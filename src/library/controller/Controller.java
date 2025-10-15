package library.controller;

import library.services.Services;

public class Controller {
    final private Services services;

    public Controller(Services services) {
        this.services = services;
    }

    public void addBook() {
        services.addBook();
    }

    public void listBook() {
         services.listBook();
    }

    public void borrowBook() {
         services.borrowBook();
    }

    public void returnBook() {
         services.returnBook();
    }

    public void removeBook() {
        System.out.println(services.removeBook());
    }

    public void addUser() {
        services.addUser();
    }

    public void removeUser() {
        System.out.println(services.removeUser());
    }

    public void listUser() {
        services.listUser();
    }

    public void editUser() {
        services.editUser();
    }
}
