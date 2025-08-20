package library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {

    Scanner scanner = new Scanner(System.in);

    public int option(){
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Add Book");
        System.out.println("[2] List Books");
        System.out.println("[3] Lending Book");
        System.out.println("[4] Delivery Book");
        System.out.println("[5] Delete Book");
        System.out.println("[6] Finish Program");

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
                if (book.isBookAvailability()){
                    book.setBookAvailability(false);
                    System.out.println("Livro Emprestado com sucesso: " + book.getTitle());
                } else {
                    System.out.println("Livro já emprestado!");
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
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado");
    }


}
