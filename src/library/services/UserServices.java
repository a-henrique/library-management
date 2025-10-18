package library.services;

import library.model.User;

public class UserServices {

    public void addUser(String username, String email, String password) {
        User addNewUser = new User(username, email, password);
        users.add(addNewUser);
    }

    public String removeUser(String id) {
        for (User user : users){
            if(user.getId().equals(id)){
                users.remove(user);
                return "Usuário Removido: " + user.getUsername();
            }
        }
        return "NOT FOUND!";
    }

    public void listUser() {
        if (users.isEmpty()) {
            System.out.println("Lista de usuários vazia!");
        }
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void editUser(String uuid) {
        for (User user : users) {
            if (user.getId().equals(uuid)) {
                System.out.println("[1] Name");
                System.out.println("[2] Password");
                System.out.println("[3] E-mail");
                System.out.println("Which attributes would you like to edit?");
                String option_edit = scanner.nextLine();
                switch (option_edit) {
                    case "1" -> {
                        System.out.println("Enter a new username: ");
                        String new_username = scanner.nextLine();
                        user.setUsername(new_username);
                    }
                    case "2" -> {
                        // TODO: It will need be adjust, because the password will be encrypted
                        System.out.println("Enter Current Password: ");
                        String currentPassword = scanner.nextLine();
                        if (user.getPassword().equals(currentPassword)) {
                            System.out.println("Enter New Password: ");
                            String newPassword = scanner.nextLine();
                            user.setPassword(newPassword);
                            System.out.println("Password Changed!");
                        } else {
                            System.out.println("Current Password doesn't match!");
                        }
                    }
                    case "3" -> {
                        System.out.println("Enter a new email: ");
                        String newEmail = scanner.nextLine();
                        user.setUser_email(newEmail);
                        System.out.println("Email Changed!");
                    }
                    default -> System.out.println("Option Not Found!");
                }
            }
        }
    }
}
