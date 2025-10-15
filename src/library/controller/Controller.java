package library.controller;

import library.services.Services;

import java.util.Scanner;

public class Controller {
    final private Services services;

    Scanner scanner = new Scanner(System.in);

    public Controller(Services services) {
        this.services = services;
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
        scanner.nextLine(); // Gambiarra para o Int não pular a proxima linha
        System.out.println("Livro adicionado!");
        services.addBook(title, author, publisher, bookItem);
    }

    public void listBook() {
        System.out.println(services.listBook());
    }

    public void borrowBook() {
        System.out.println("What book id would you take borrow?");
        int id = scanner.nextInt();
        scanner.nextLine();
        services.borrowBook(id);
    }

    public void returnBook() {
        System.out.println("What book id would you give return?");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(services.returnBook(id));
    }

    public void removeBook() {
        System.out.println("Qual o id do Livro que deseja remover?");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(services.removeBook(id));
    }

    public void addUser() {
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("E-Mail: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("User Registered Successfully!!");
        services.addUser(username, email, password);
    }

    public void removeUser() {
        System.out.println("Qual id do usuário que deseja remover?");
        String id = scanner.nextLine();
        System.out.println(services.removeUser(id));
    }

    public void listUser() {
        services.listUser();
    }

    public void editUser() {
        System.out.println("User id that would you like edit?");
        String uuid = scanner.nextLine();
        services.editUser(uuid);
    }
}
