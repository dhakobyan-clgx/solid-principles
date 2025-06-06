package com.corelogic.tech_talk.solid_principles.single_responsibility.after;

import java.io.FileWriter;
import java.io.IOException;

public class UserFileManager {
    public void saveToFile(User user) {
        try (FileWriter fileWriter = new FileWriter(user.getName() + ".txt")) {
            fileWriter.write("Name: " + user.getName() + "\n");
            fileWriter.write("Email: " + user.getEmail() + "\n");
            System.out.println("User data saved to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
