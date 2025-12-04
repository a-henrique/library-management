package com.library_management.dto;

public record CreateBookRequest(
        String title,
        String author,
        String genre
) {}
