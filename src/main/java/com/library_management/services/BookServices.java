package com.library_management.services;

import com.library_management.model.Book;
import com.library_management.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    final private BookRepository bookRepository;

    public BookServices(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book createBook(String title, String author, String genre){
        Book book = new Book(title, author, genre);
        return bookRepository.save(book);
    }

    public List<Book> listAll(){
        return bookRepository.findAll();
    }

}
