package library.repository;

import library.model.Borrow;

import java.util.ArrayList;

public interface BorrowRepository {

    ArrayList<Borrow> listAllBorrows();
    void save(Borrow borrow);
}
