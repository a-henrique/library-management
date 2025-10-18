package library;

import library.controller.BookController;

public class Menu {

    private BookController bookController;

    public Menu(BookController bookController){
        this.bookController = bookController;
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
    }

    public void choice(int option){
        switch (option){
            case 1:
                bookController.addBook();
                break;
            case 2:
                bookController.listBook();
                break;
            case 3:
                bookController.borrowBook();
                break;
            case 4:
                bookController.returnBook();
                break;
            case 5:
                bookController.removeBook();
                break;
            case 6:
                bookController.addUser();
                break;
            case 7:
                bookController.removeUser();
                break;
            case 8:
                bookController.listUser();
                break;
            case 9:
                bookController.editUser();
                break;
            case 0:
                break;
        }
    }
}
