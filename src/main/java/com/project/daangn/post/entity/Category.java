package com.project.daangn.post.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String categoryName;

    public Category(){}

}
