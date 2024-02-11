package com.example.mytestproject;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserRegistrationRestController {

    UsersDatabaseConnection connection;

    public UserRegistrationRestController() {
    }

    @GetMapping("/user-registration")
    public void registerUser(@PathVariable String username, @PathVariable String password) {
        connection.connect();
        connection.registerUser();
        connection.disconnect();
    }
}
