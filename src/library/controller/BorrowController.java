package library.controller;

import library.services.BorrowServices;

import java.util.Scanner;

public class BorrowController {

    final private BorrowServices borrowServices;
    final private Scanner scanner;

    public BorrowController(BorrowServices borrowServices, Scanner scanner){
        this.borrowServices = borrowServices;
        this.scanner = scanner;
    }

    public void borrowBook() {
        System.out.println("What book id would you take borrow?");
        int id = scanner.nextInt();
        scanner.nextLine();
        borrowServices.borrowBook(id);
    }

    public void returnBook() {
        System.out.println("What book id would you give return?");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(borrowServices.returnBook(id));
    }

}
