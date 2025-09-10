package library.model;

import java.util.UUID;

public class User {

    private String name;
    private String registration;
    private String email;
    private String password;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.registration = UUID.randomUUID().toString();
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getRegistration(){
        return registration;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }
}
