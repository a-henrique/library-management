package library.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Book {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String author;
    private String publisher;
    private LocalDateTime insertDate;
    private int bookItem;
    private Date publisherDate;
    private boolean bookAvailability;

    public Book(String title, String author, String publisher, int bookItem){
        // TODO: Refactor BookId
        idCounter++;
        this.id = idCounter;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.bookItem = bookItem;
        this.insertDate = LocalDateTime.now();
        this.bookAvailability = true;
    }

    // GETTERS
    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public LocalDateTime getInsertDate(){
        return insertDate;
    }

    public int getBookItem(){
        return bookItem;
    }

    public Date getPublisherDate(){
        return publisherDate;
    }

    public boolean isBookAvailability(){
        return bookAvailability;
    }


    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public void setBookItem(int bookItem) {
        this.bookItem = bookItem;
    }

    public void setPublisherDate(Date publisherDate) {
        this.publisherDate = publisherDate;
    }

    public void setBookAvailability(boolean bookAvailability) {
        this.bookAvailability = bookAvailability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", insertDate=" + insertDate +
                ", bookItem=" + bookItem +
                ", publisherDate=" + publisherDate +
                ", bookAvailability=" + bookAvailability +
                '}';
    }
}


