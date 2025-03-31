package com.corelogic.solid.principles.SingleResponsibility.before;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  Explanation: The User class has two responsibilities: managing user data and handling file storage.
 *  This violates the Single Responsibility Principle because a change in the file storage mechanism would
 *  require modifications to the User class.
 */
public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Bad practice: Handling file storage within the User class
    public void saveToFile() {
        try (FileWriter fileWriter = new FileWriter(name + ".txt")) {
            fileWriter.write("Name: " + name + "\n");
            fileWriter.write("Email: " + email + "\n");
            System.out.println("User data saved to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        user.saveToFile();
    }
}