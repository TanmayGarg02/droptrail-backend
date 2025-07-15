package com.drop_tail.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "drop_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String imageData;

    private double latitude;
    private double longitude;

    private LocalDateTime timeStamp;
}
