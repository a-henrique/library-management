package library.services;

import library.model.Book;
import library.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {

    Scanner scanner = new Scanner(System.in);

    public int option(){
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
        System.out.println("[0] Finish Program");

        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public Book addBook(){
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

    public void listBook(ArrayList<Book> books){
        if(books.isEmpty()){
            System.out.println("Não há livros cadastrados!");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(ArrayList<Book> books, int id){
        for (Book book : books){
            if (book.getId() == id){
                if (book.getBookItem() > 0) {
                    book.setBookItem(book.getBookItem() - 1);
                    System.out.println("Livro Emprestado com sucesso: " + book.getTitle());
                    System.out.println("Restam " + book.getBookItem() + " exemplares");
                    if (book.getBookItem() == 0){
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

    public void deliveredBook(ArrayList<Book> books, int id){
        for (Book book : books){
            if (book.getId() == id){
                if(!book.isBookAvailability()){
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

    public void removeBook(ArrayList<Book> books, int id){
        for(int i = 0; i < books.size(); i++){
            System.out.println("Livro Removido: " + books.get(i).getTitle());
            books.remove(i);
            return;
        }
    }

    public User addUser(){
        System.out.println("Username: ");
        String username = scanner.nextLine();
        System.out.println("E-Mail: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();
        System.out.println("User Registered Successfully!!");
        return new User(username, email, password);
    }

    public void removeUser(ArrayList<User> users, int id){
        for (int i = 0; i < users.size(); i++){
            System.out.println("Usuário Removido: " + users.get(i).getUsername());
            users.remove(i);
            return;
        }
    }

    public void listUser(ArrayList<User> users){
        if(users.isEmpty()){
            System.out.println("Lista de usuários vazia!");
        }
        for(User user : users){
            System.out.println(user);
        }
    }
}
