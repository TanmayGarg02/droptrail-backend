package com.drop_tail.Repo;

import com.drop_tail.Model.Drop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DropRepository extends JpaRepository<Drop, Long> {
}
