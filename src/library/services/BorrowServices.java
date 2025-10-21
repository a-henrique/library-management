package library.services;
import library.model.Book;
import library.repository.BookRepository;
import library.repository.BorrowRepository;


public class BorrowServices {

    final private BorrowRepository borrowRepository;
    final private BookServices bookServices;
    final private UserServices userServices;

    public BorrowServices(BorrowRepository borrowRepository, BookServices bookServices, UserServices userServices){
        this.borrowRepository = borrowRepository;
        this.bookServices = bookServices;
        this.userServices = userServices;
    }

    public void borrowBook(int id) {
        for (Book book : bookServices.listBook()) { // Como é que eu vou ler os livros disponíveis agora?
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
        for (Book book : bookServices.listBook()) {
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
