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

    public void deleteUser() {
        System.out.println("Deleting user from the users database");
    }

    public void findById() {
    }
}
