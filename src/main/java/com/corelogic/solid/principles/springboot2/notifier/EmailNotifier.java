package com.corelogic.solid.principles.springboot2.notifier;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
