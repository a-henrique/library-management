package com.library_management.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Borrow> borrows;

    private String username;
    private String email;
    private String typeUser;
    private String password;
}
