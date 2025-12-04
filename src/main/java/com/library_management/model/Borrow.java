package com.library_management.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Borrow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamento 1:N (User - Borrow)
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Relacionamento N:1 (Borrow - BookCopy)
    @ManyToOne
    @JoinColumn(name = "bookcopy_id")
    private BookCopy bookCopy;

    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
}
