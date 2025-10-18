package library;

import library.controller.BookController;
import library.controller.BorrowController;
import library.controller.UserController;
import library.services.BookServices;
import library.services.BorrowServices;
import library.services.UserServices;

import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) {
        BookServices bookServices = new BookServices();
        BorrowServices borrowServices = new BorrowServices();
        UserServices userServices = new UserServices();
        BookController bookController = new BookController(bookServices);
        BorrowController borrowController = new BorrowController(borrowServices);
        UserController userController = new UserController(userServices);

        Menu menu = new Menu(bookController);
        Scanner scanner = new Scanner(System.in);

        while(true){
            menu.showMenu();
            int option = scanner.nextInt();
            menu.choice(option);
        }
    }
}
