package library.exception;

public class BookIndisponivelException extends RuntimeException {
    public BookIndisponivelException(String message) {
        super(message);
    }
}
