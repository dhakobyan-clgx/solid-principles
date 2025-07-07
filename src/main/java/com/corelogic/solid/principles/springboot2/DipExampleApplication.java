package com.corelogic.solid.principles.springboot2;

import com.corelogic.solid.principles.springboot2.service.DynamicNotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DipExampleApplication implements CommandLineRunner {

    private final DynamicNotificationService dynamicNotificationService;

    public DipExampleApplication(DynamicNotificationService dynamicNotificationService) {
        this.dynamicNotificationService = dynamicNotificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DipExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        dynamicNotificationService.notifyUser("email", "Hello via Email!");
        dynamicNotificationService.notifyUser("sms", "Hello via SMS!");
        dynamicNotificationService.notifyUser("push", "Hello via Push Notification!");
    }
}