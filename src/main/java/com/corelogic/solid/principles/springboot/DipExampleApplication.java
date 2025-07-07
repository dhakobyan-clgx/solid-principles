package com.corelogic.solid.principles.springboot;

import com.corelogic.solid.principles.springboot.service.NotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DipExampleApplication implements CommandLineRunner {

    private final NotificationService notificationService;

    public DipExampleApplication(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DipExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        notificationService.notifyUser("Hello, DIP with Spring Boot!");
    }
}

/**
 * ** How Spring resolves the dependency
 * NotificationService doesn’t know if it’s using email or SMS.
 * It depends on the Notifier interface, not the implementation.
 *
 * ** Dependency Injection:
 * Spring injects the desired Notifier implementation at runtime.
 */