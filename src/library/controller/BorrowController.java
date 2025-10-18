package library.controller;

import library.services.BorrowServices;

public class BorrowController {

    final private BorrowServices borrowServices;

    public BorrowController(BorrowServices borrowServices){
        this.borrowServices = borrowServices;
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
