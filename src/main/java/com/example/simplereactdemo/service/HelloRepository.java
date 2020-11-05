package com.example.simplereactdemo.service;

import com.example.simplereactdemo.models.HelloWorld;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<HelloWorld, Integer> {
}
