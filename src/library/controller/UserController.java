package library.controller;

import library.repository.BookRepository;
import library.repository.UserRepository;
import library.services.UserServices;

import java.util.Scanner;

public class UserController {

    final private UserServices userServices;
    final private Scanner scanner;

    public UserController(UserServices userServices, Scanner scanner){
        this.userServices = userServices;
        this.scanner = scanner;
    }

    public void addUser() {
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("E-Mail: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("User Registered Successfully!!");
        userServices.addUser(username, email, password);
    }

    public void removeUser() {
        System.out.println("Qual id do usuário que deseja remover?");
        String id = scanner.nextLine();
        System.out.println(userServices.removeUser(id));
    }

    public void listUser() {
        userServices.listUser();
    }

//    public void editUser() {
//        System.out.println("User id that would you like edit?");
//        String uuid = scanner.nextLine();
//        userServices.editUser(uuid);
//    }
}
