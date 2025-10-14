package library;

import library.controller.Controller;
import library.services.Services;

import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) {
        Services services = new Services();
        Controller controller = new Controller(services);
        Menu menu = new Menu(controller);
        Scanner scanner = new Scanner(System.in);

        while(true){
            menu.showMenu();
            int option = scanner.nextInt();
            menu.choice(option);
        }
    }
}
