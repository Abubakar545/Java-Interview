package com.student.StudentAPI.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "first_name")
    private String name;

    private String email;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

}
