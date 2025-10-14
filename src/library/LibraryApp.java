package library;

import library.controller.Controller;
import library.services.Services;


public class LibraryApp {
    public static void main(String[] args) {
        Services services = new Services();
        Controller controller = new Controller(services);
        Menu menu = new Menu(controller);

        while(true){
            menu.showMenu();
        }
    }
}
