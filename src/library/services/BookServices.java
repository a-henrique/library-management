package library.services;

import library.model.Book;
import library.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class BookServices {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook(String title, String author, String publisher, int bookItem) {
        Book newBook = new Book(title, author, publisher, bookItem);
        books.add(newBook);
    }

    public String listBook() {
        if (this.books.isEmpty()) {
            return "Não há livros cadastrados!";
        }
        for (Book book : books) {
            return book.toString();
        }
        return "";
    }

    public String removeBook(int id) {
        for (Book book : books) {
            if(book.getId() == id){
                books.remove(book);
                return "Livro Removido: " + book.getTitle();
            }
        }
        return "NOT FOUND";
    }

}