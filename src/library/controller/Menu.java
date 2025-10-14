package library.controller;

import library.model.Book;
import library.model.User;
import library.services.Services;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public Services services;

    public void showMenu() {
        System.out.println("======== LIBRARIAN ========");
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Add Book");
        System.out.println("[2] List Books");
        System.out.println("[3] Lending Book");
        System.out.println("[4] Return Book");
        System.out.println("[5] Delete Book");
        System.out.println("[6] Add New User");
        System.out.println("[7] Remove User");
        System.out.println("[8] List Users");
        System.out.println("[9] Edit Users");
        System.out.println("[0] Finish Program");
    }

    public Object selectOption() {
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                services.addBook();
                break;
            case 2:
                services.listBook(books);
                break;
            case 3:
                System.out.println("Digite o id do livro que deseja pegar: ");
                int id = scanner.nextInt();
                services.borrowBook(books, id);
                break;
            case 4:
                System.out.println("Digite o ID do livro que deseja devolver");
                id = scanner.nextInt();
                services.deliveredBook(books, id);
                break;
            case 5:
                System.out.println("Digite o ID do livro que deseja remover");
                id = scanner.nextInt();
                services.removeBook(books, id);
            case 6:
                System.out.println("Preencha com as informações abaixo: ");
                services.addUser();
                break;
            case 7:
                System.out.println("Digite o id do usuário a ser removido: ");
                id = scanner.nextInt();
                services.removeUser(users, id);
            case 8:
                services.listUser(users);
                break;
            case 9:
                System.out.println("Digite o id do usuário a ser editado: ");
                String uuid = scanner.nextLine();
                services.editUser(users, uuid);
            case 0:
                break;
        }
        return option;
    }
}
