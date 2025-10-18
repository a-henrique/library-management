package library.repository;

import library.model.Book;

import java.util.ArrayList;

public class BookEmMemoria implements BookRepository {

    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void save(Book book){
        this.books.add(book);
    }

    @Override
    public ArrayList<Book> listAll(){
        return new ArrayList<>(this.books);
    }

    @Override
    public void removeById(int id){
        books.remove(id);
    }
}
