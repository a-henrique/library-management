package library.model;

import java.time.LocalDate;

public class Borrow {

    private User user; // Associando Usuário à empréstimo
    private Book book; // Associando Livro à empréstimo
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private boolean returned;

    public User user() {
        return user;
    }

    public Borrow setUser(User user) {
        this.user = user;
        return this;
    }

    public Book book() {
        return book;
    }

    public Borrow setBook(Book book) {
        this.book = book;
        return this;
    }

    public LocalDate borrowDate() {
        return borrowDate;
    }

    public Borrow setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
        return this;
    }

    public LocalDate returnDate() {
        return returnDate;
    }

    public Borrow setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public boolean returned() {
        return returned;
    }

    public Borrow setReturned(boolean returned) {
        this.returned = returned;
        return this;
    }
}
