package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tags")
@Getter
@Setter
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "name")
    private String name;
}
