package library.services;

import library.model.Book;
import library.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Book addBook() {
        System.out.println("Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Book Author: ");
        String author = scanner.nextLine();
        System.out.println("Book Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Quantity exemplars: ");
        int bookItem = scanner.nextInt();
        System.out.println("Livro adicionado!");
        return new Book(title, author, publisher, bookItem);
    }

    public void listBook(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Não há livros cadastrados!");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(ArrayList<Book> books, int id) {
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
                    System.out.println("O Livro não há exemplares disponíveis no momento");
                }
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado");
    }

    public void returnBook(ArrayList<Book> books, int id) {
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

    public void removeBook(ArrayList<Book> books, int id) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Livro Removido: " + books.get(i).getTitle());
            books.remove(i);
            return;
        }
    }

    public User addUser() {
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("E-Mail: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("User Registered Successfully!!");
        return new User(username, email, password);
    }

    public void removeUser(ArrayList<User> users, int id) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println("Usuário Removido: " + users.get(i).getUsername());
            users.remove(i);
            return;
        }
    }

    public void listUser(ArrayList<User> users) {
        if (users.isEmpty()) {
            System.out.println("Lista de usuários vazia!");
        }
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void editUser(ArrayList<User> users, String uuid) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(uuid)) {
                System.out.println("[1] Name");
                System.out.println("[2] Password");
                System.out.println("[3] E-mail");
                System.out.println("Which attributes would you like to edit?");
                String option_edit = scanner.nextLine();
                if (option_edit.equals("1")) {
                    System.out.println("Enter a new username: ");
                    String new_username = scanner.nextLine();
                    users.get(i).setUsername(new_username);
                } else if (option_edit.equals("2")){
                    // TODO: It will need be adjust, because the password will be encrypted
                    System.out.println("Enter Current Password: ");
                    String currentPassword = scanner.nextLine();
                    if(users.get(i).getPassword().equals(currentPassword)){
                        System.out.println("Enter New Password: ");
                        String newPassword = scanner.nextLine();
                        users.get(i).setPassword(newPassword);
                        System.out.println("Password Changed!");
                    } else {
                        System.out.println("Current Password doesn't match!");
                    }
                } else if (option_edit.equals("3")){
                    System.out.println("Enter a new email: ");
                    String newEmail = scanner.nextLine();
                    users.get(i).setUser_email(newEmail);
                    System.out.println("Email Changed!");
                } else {
                    System.out.println("Option Not Found!");
                }
            }
        }
    }
}