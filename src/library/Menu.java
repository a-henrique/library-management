package library;

import library.controller.Controller;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    private Controller controller;

    public Menu(Controller controller){
        this.controller = controller;
    }
    public void showMenu() {
        System.out.println("======== LIBRARIAN ========");
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Add Book");
        System.out.println("[2] List Books");
        System.out.println("[3] Borrow Book");
        System.out.println("[4] Return Book");
        System.out.println("[5] Delete Book");
        System.out.println("[6] Add New User");
        System.out.println("[7] Remove User");
        System.out.println("[8] List Users");
        System.out.println("[9] Edit Users");
        System.out.println("[0] Finish Program");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option){
            case 1:
                controller.addBook();
                break;
            case 2:
                controller.listBook();
                break;
            case 3:
                controller.borrowBook();
                break;
            case 4:
                controller.returnBook();
                break;
            case 5:
                controller.removeBook();
                break;
            case 6:
                controller.addUser();
                break;
            case 7:
                controller.removeUser();
                break;
            case 8:
                controller.listUser();
                break;
            case 9:
                controller.editUser();
                break;
            case 0:
                break;
        }
    }
}
