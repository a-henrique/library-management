package library;

import library.controller.Menu;
import library.model.Book;
import library.services.Services;
import library.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        Menu menu = new Menu();

        while(true){
            menu.showMenu();
            menu.selectOption();
        }
    }
}
