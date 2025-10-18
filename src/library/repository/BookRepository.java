package library.repository;

import library.model.Book;

import java.util.ArrayList;

public interface BookRepository {

    void save(Book book);
    void removeById(int id);
    ArrayList<Book> listAll();
}
