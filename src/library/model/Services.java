package library.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Services {

    Scanner scanner = new Scanner(System.in);

    public int option(){
        System.out.println("======== LIBRARY ========");
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
}
