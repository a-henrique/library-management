package com.library_management.controller;

import com.library_management.dto.CreateBookRequest;
import com.library_management.model.Book;
import com.library_management.services.BookServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    final private BookServices bookServices;

    public BookController(BookServices bookServices){
        this.bookServices = bookServices;
    }

    @GetMapping
    public List<Book> listAll(){
        return bookServices.listAll();
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody CreateBookRequest request){
        return bookServices.createBook(request.title(), request.author(), request.genre());
    }
}
