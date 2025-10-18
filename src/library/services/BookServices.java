package library.services;

import library.model.Book;
import library.repository.BookRepository;

import java.util.ArrayList;

public class BookServices {

    final private BookRepository bookRepository;

    public BookServices(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(String title, String author, String publisher, int bookItem) {
        Book newBook = new Book(title, author, publisher, bookItem);
        bookRepository.save(newBook);
    }

    public ArrayList<Book> listBook() {
        if (bookRepository.listAll().isEmpty()) {
            return null;
        } else {
            return bookRepository.listAll();
        }
    }

    public void removeBook(int id) {
        for (Book book : bookRepository.listAll()) {
            if(book.getId() == id){
                bookRepository.removeById(id);
            }
        }
    }

}