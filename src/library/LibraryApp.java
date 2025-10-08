package library;

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
                    users.add(services.addUser());
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
        }
    }
}
