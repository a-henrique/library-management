package library.repository;

import library.model.User;

import java.util.ArrayList;

public interface UserRepository {
    ArrayList<User> users = new ArrayList<>();

    void save(User user);
    void removeUser(String id);
    ArrayList<User> listAllUsers();

}
