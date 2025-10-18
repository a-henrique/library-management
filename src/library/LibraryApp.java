package library;

import library.controller.BookController;
import library.controller.BorrowController;
import library.controller.UserController;
import library.repository.*;
import library.services.BookServices;
import library.services.BorrowServices;
import library.services.UserServices;

import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando os repositories
        BookRepository bookEmMemoria = new BookEmMemoria();
        BorrowRepository borrowMemory = new BorrowMemory();
        UserRepository userMemory = new UserMemory();

        // Montando os Services
        BookServices bookServices = new BookServices(bookEmMemoria);
        BorrowServices borrowServices = new BorrowServices(borrowMemory);
        UserServices userServices = new UserServices(userMemory);

        // Montando a relação Service/Controller
        BookController bookController = new BookController(bookServices, scanner);
        BorrowController borrowController = new BorrowController(borrowServices, scanner);
        UserController userController = new UserController(userServices, scanner);

        Menu menu = new Menu(bookController, borrowController, userController);

        while(true){
            menu.showMenu();
            int option = scanner.nextInt();
            menu.choice(option);
        }
    }
}
