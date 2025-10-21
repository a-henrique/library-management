package library.repository;

import library.model.Borrow;

import java.util.ArrayList;

public class BorrowMemory implements BorrowRepository{

    ArrayList<Borrow> borrowHistory = new ArrayList<>();

    @Override
    public ArrayList<Borrow> listAllBorrows() {
        return borrowHistory;
    }

    public void save(Borrow borrow){
        borrowHistory.add(borrow);
    }
}
