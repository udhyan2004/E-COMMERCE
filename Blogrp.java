package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Blog;

public interface  Blogrp extends JpaRepository<Blog, Integer> {
    
}
