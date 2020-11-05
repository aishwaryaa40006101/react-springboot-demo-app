package com.example.simplereactdemo.controller;

import com.example.simplereactdemo.models.HelloWorld;
import com.example.simplereactdemo.service.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })

@RestController
public class HelloController {


    @Autowired
    private HelloRepository helloRepository;

    @GetMapping("/getMessage")
    public List<HelloWorld> getAllCourses() {
        return helloRepository.findAll();
    }

    @DeleteMapping("/deleteMessage/{id}")
    public void deleteCourse(@PathVariable("id") int id){
         helloRepository.deleteById(id);
    }
    @PostMapping
    public HelloWorld saveMessage(@RequestBody HelloWorld message){
        return  helloRepository.save(message);
    }
}