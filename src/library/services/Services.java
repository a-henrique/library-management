package library.services;

import library.model.Book;
import library.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.println("Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Book Author: ");
        String author = scanner.nextLine();
        System.out.println("Book Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Quantity exemplars: ");
        int bookItem = scanner.nextInt();
        scanner.nextLine(); // Gambiarra para o Int não pular a proxima linha
        System.out.println("Livro adicionado!");
        Book newBook = new Book(title, author, publisher, bookItem);
        books.add(newBook);
    }

    public void listBook() {
        if (this.books.isEmpty()) {
            System.out.println("Não há livros cadastrados!");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook() {
        System.out.println("What book id would you take borrow?");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Book book : books) {
            if (book.getId() == id) {
                if (book.getBookItem() > 0) {
                    book.setBookItem(book.getBookItem() - 1);
                    System.out.println("Livro Emprestado com sucesso: " + book.getTitle());
                    System.out.println("Restam " + book.getBookItem() + " exemplares");
                    if (book.getBookItem() == 0) {
                        System.out.println("Você pegou o último exemplar disponível!");
                        book.setBookAvailability(false);
                    }
                } else {
                    System.out.println("There are not available");
                }
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado");
    }

    public void returnBook() {
        System.out.println("What book id would you give return?");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.isBookAvailability()) {
                    book.setBookAvailability(true);
                    System.out.println("Livro devolvido: " + book.getTitle());
                } else {
                    System.out.println("O livro " + book.getTitle() + " não está emprestado!");
                }
            } else {
                System.out.println("Livro com ID " + id + " não encontrado");
            }
        }
    }

    public String removeBook() {
        System.out.println("Qual o id do Livro que deseja remover?");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Book book : books) {
            if(book.getId() == id){
                books.remove(book);
                return "Livro Removido: " + book.getTitle();
            }
        }
        return "NOT FOUND";
    }

    public void addUser() {
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("E-Mail: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("User Registered Successfully!!");
        User addNewUser = new User(username, email, password);
        users.add(addNewUser);
    }

    public String removeUser() {
        System.out.println("Qual id do usuário que deseja remover?");
        String id = scanner.nextLine();
        for (User user : users){
            if(user.getId().equals(id)){
                users.remove(user);
                return "Usuário Removido: " + user.getUsername();
            }
        }
        return "NOT FOUND!";
    }

    public void listUser() {
        if (users.isEmpty()) {
            System.out.println("Lista de usuários vazia!");
        }
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void editUser() {
        System.out.println("User id that would you like edit?");
        String uuid = scanner.nextLine();
        for (User user : users) {
            if (user.getId().equals(uuid)) {
                System.out.println("[1] Name");
                System.out.println("[2] Password");
                System.out.println("[3] E-mail");
                System.out.println("Which attributes would you like to edit?");
                String option_edit = scanner.nextLine();
                switch (option_edit) {
                    case "1" -> {
                        System.out.println("Enter a new username: ");
                        String new_username = scanner.nextLine();
                        user.setUsername(new_username);
                    }
                    case "2" -> {
                        // TODO: It will need be adjust, because the password will be encrypted
                        System.out.println("Enter Current Password: ");
                        String currentPassword = scanner.nextLine();
                        if (user.getPassword().equals(currentPassword)) {
                            System.out.println("Enter New Password: ");
                            String newPassword = scanner.nextLine();
                            user.setPassword(newPassword);
                            System.out.println("Password Changed!");
                        } else {
                            System.out.println("Current Password doesn't match!");
                        }
                    }
                    case "3" -> {
                        System.out.println("Enter a new email: ");
                        String newEmail = scanner.nextLine();
                        user.setUser_email(newEmail);
                        System.out.println("Email Changed!");
                    }
                    default -> System.out.println("Option Not Found!");
                }
            }
        }
    }
}