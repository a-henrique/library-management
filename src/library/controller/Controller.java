package library.controller;

import library.services.Services;

public class Controller {
    final private Services services;

    public Controller(Services services) {
        this.services = services;
    }
    // TODO: Setting params on the methods
    public void addBook() {
        services.addBook();
    }

    // TODO: Setting params on the methods
    public void listBook() {
//        services.listBook();
    }

    // TODO: Setting params on the methods
    public void borrowBook() {
//        services.borrowBook();
    }

    // TODO: Setting params on the methods
    public void returnBook() {
//        services.returnBook();
    }

    // TODO: Setting params on the methods
    public void removeBook() {
//        services.removeBook();
    }

    // TODO: Setting params on the methods
    public void addUser() {
        services.addUser();
    }

    // TODO: Setting params on the methods
    public void removeUser() {
//        services.removeUser();
    }

    // TODO: Setting params on the methods
    public void listUser() {
//        services.listUser();
    }

    // TODO: Setting params on the methods
    public void editUser() {
//        services.editUser();
    }
}
