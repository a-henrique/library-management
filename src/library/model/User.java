package library.model;

import java.util.UUID;

public class User {

    final private String id;
    private String user_email; // TODO Refatorar para user_email and the other variables
    private String username; // TODO refactor to username and the other variables
    private String password;
    private String typeUser;

    public User(String username, String email, String password){
        this.username = username;
        this.user_email = email;
        this.password = password;
        this.id = UUID.randomUUID().toString();
    }

    public String getUsername(){
        return username;
    }

    public String getUser_email(){
        return user_email;
    }

    public String getPassword(){
        return password;
    }

    public String getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setUser_email(String email){
        this.user_email = email;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user_email='" + user_email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", typeUser='" + typeUser + '\'' +
                '}';
    }
}
