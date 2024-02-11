package com.example.mytestproject;

public class UsersDatabaseConnection {

    public void connect() {
        System.out.println("Connected to the users database");
    }

    public void disconnect() {
        System.out.println("Disconnected from the users database");
    }

    public void getUsers() {
        System.out.println("Getting users from the users database");
    }

    public void updateUser() {
        System.out.println("Updating user in the users database");
    }

    public void registerUser() {
        int id = findById();
        String message = getMessage(id);
        System.out.println(message);
    }

    public void deleteUser() {
        int id = findById();
        if(id == 0) {
            System.out.println("User does not exist in the users database");
            return;
        }
        System.out.println("Deleting user from the users database");
    }

    public int findById() {
        return 0;
    }

    public String getMessage(int id){
        if(id != 0) {
            return "User already exists in the users database";
        }
        return "Registering user in the users database";
    }
}
