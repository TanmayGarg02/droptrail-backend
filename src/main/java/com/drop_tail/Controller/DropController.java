package com.drop_tail.Controller;

import com.drop_tail.Model.Drop;
import com.drop_tail.Repo.DropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/drops")
@CrossOrigin(origins = "*")
public class DropController {

    @Autowired
    private DropRepository dropRepo;

    @PostMapping
    public Drop saveDrop(@RequestBody Drop drop) {
        drop.setTimeStamp(LocalDateTime.now());
        return dropRepo.save(drop);
    }

    @GetMapping
    public List<Drop> getAllDrops() {
        return dropRepo.findAll();
    }
}

