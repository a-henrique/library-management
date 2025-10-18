package library;

import library.controller.BookController;
import library.controller.BorrowController;
import library.controller.UserController;

public class Menu {

    final private BookController bookController;
    final private BorrowController borrowController;
    final private UserController userController;

    public Menu(BookController bookController, BorrowController borrowController, UserController userController){
        this.bookController = bookController;
        this.borrowController = borrowController;
        this.userController = userController;
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
                borrowController.borrowBook();
                break;
            case 4:
                borrowController.returnBook();
                break;
            case 5:
                bookController.removeBook();
                break;
            case 6:
                userController.addUser();
                break;
            case 7:
                userController.removeUser();
                break;
            case 8:
                userController.listUser();
                break;
            case 9:
                userController.editUser();
                break;
            case 0:
                break;
        }
    }
}
