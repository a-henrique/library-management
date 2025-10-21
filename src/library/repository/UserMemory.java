package library.repository;

import library.model.User;

import java.util.ArrayList;

public class UserMemory implements UserRepository{

    ArrayList<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    };

    public void removeUser(String id){
        users.remove(id);
    }

    public ArrayList<User> listAllUsers(){
        return users;
    }
}
