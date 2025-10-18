package library.repository;

import library.model.Borrow;

import java.util.ArrayList;

public interface BorrowRepository {
    ArrayList<Borrow> borrowHistory = new ArrayList<>();

    ArrayList<Borrow> listAllBorrows(){
        return borrowHistory;
    }
}
