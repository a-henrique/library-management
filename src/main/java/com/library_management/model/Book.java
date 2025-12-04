package com.library_management.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String genre;
    private LocalDateTime publishedAt;
    private LocalDateTime createdAt;


    public Book(){

    }

    public Book(String title, String author, String genre){;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.createdAt = LocalDateTime.now();
        this.publishedAt = LocalDateTime.now();
    }

    // Getters
    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public LocalDateTime getPublishedAt(){
        return publishedAt;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    // Setters

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setPublishedAt(LocalDateTime publishedAt){
        this.publishedAt = publishedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
}
