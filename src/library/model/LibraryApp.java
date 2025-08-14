package library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        Services services = new Services();
        while(true){
            int option = services.option();

            switch (option){
                case 1:
                    books.add(services.addBook());
                    break;
                case 2:
                    services.listBook(books);
                    break;
                case 6:
                    break;
            }
        }
    }
}
