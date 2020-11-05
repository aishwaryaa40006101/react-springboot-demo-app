package com.example.simplereactdemo.models;

import javax.persistence.*;

@Table(name="hello")
@Entity
public class HelloWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorld() {
    }

    public HelloWorld(int id, String message) {
        this.id = id;
        this.message = message;
    }
}
