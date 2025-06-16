package com.corelogic.solid.principles.single_responsibility.after;

/**
 * The User class now only manages user data, while the UserFileManager class handles file storage.
 * This adheres to the Single Responsibility Principle, as each class now has only one reason to change.
 */
public class Solution {
    public static void main(String[] args) {
        User user = new User("John Doe", "john.doe@example.com");
        UserFileManager fileManager = new UserFileManager();
        fileManager.saveToFile(user);
    }
}
