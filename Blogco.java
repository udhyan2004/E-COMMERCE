package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Blog;
import com.example.demo.repository.Blogrp;


@RestController
@RequestMapping("/api")
public class Blogco {  

    @Autowired  
    Blogrp blogrp;

    @GetMapping("/blogs/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable("id") int id) {
        Optional<Blog> blogData = blogrp.findById((int) id); 
        if (blogData.isPresent()) {
            return new ResponseEntity<>(blogData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

     @PostMapping("/blogs")
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        try{
            Blog newBlog = new Blog(blog.getId(),blog.getName(), blog.getTitle(), blog.getReview(), blog.getRatings(), blog.getContact());

            Blog sBlog = blogrp.save(newBlog);

            return new ResponseEntity<>( sBlog, HttpStatus.CREATED);
        }
        catch(Exception e) {
            
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/blogs/{id}")
    public ResponseEntity<Blog> UpdateBlogById(@PathVariable("id") int id) {
        
    }
}

























