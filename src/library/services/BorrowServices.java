package library.services;
import library.model.Book;
import library.repository.BookRepository;
import library.repository.BorrowRepository;


public class BorrowServices {

    final private BorrowRepository borrowRepository;
    final private BookServices bookServices;
    final private UserServices userServices;

    public BorrowServices(BorrowRepository borrowRepository, BookServices bookServices, UserServices userServices) {
        this.borrowRepository = borrowRepository;
        this.bookServices = bookServices;
        this.userServices = userServices;
    }

    public boolean borrowBook(int id) {
        for (Book book : bookServices.listBook())
            if (book.getId() == id && book.isBookAvailability()){
                book.setBookItem(book.getBookItem() - 1);
                if (book.getBookItem() == 0) {
                    book.setBookAvailability(false);
                }
                return true;
            }
        return false;
    }

    public boolean returnBook (int id){
        for (Book book : bookServices.listBook())
            if (book.getId() == id) {
                book.setBookItem(1);
                if (!book.isBookAvailability()) {
                    book.setBookAvailability(true);
                }
                return true;
        }
        return false;
    }

}
