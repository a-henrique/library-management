package library.controller;

import library.services.BookServices;

import java.util.Scanner;

public class BookController {
    final private BookServices bookServices;
    final private Scanner scanner;

    public BookController(BookServices bookServices, Scanner scanner) {
        this.bookServices = bookServices;
        this.scanner = scanner;
    }

    public void addBook() {
        System.out.println("Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Book Author: ");
        String author = scanner.nextLine();
        System.out.println("Book Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Quantity exemplars: ");
        int bookItem = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Livro adicionado!");
        bookServices.addBook(title, author, publisher, bookItem);
    }

    public void listBook() {
        System.out.println(bookServices.listBook());
    }

    public void removeBook() {
        System.out.println("Qual o id do Livro que deseja remover?");
        int id = scanner.nextInt();
        scanner.nextInt();
        bookServices.removeBook(id);
    }

    // TODO: Create a new Method
    public void updateBook(){}
}
