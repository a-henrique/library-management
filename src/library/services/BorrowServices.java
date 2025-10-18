package library.services;

import library.model.Book;
import library.model.Borrow;

import java.util.ArrayList;

public class BorrowServices {
    ArrayList<Borrow> borrowHistory = new ArrayList<>();

    public void borrowBook(int id) {
        for (Book book : books) { // Como é que eu vou ler os livros disponíveis agora?
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

    public String returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                if (!book.isBookAvailability()) {
                    book.setBookAvailability(true);
                    return "Livro devolvido: " + book.getTitle();
                } else {
                    return "O livro " + book.getTitle() + " não está emprestado!";
                }
            } else {
                return "Livro com ID " + id + " não encontrado";
            }
        }
        return "";
    }
}
