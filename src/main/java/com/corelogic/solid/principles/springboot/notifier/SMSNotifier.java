package com.corelogic.solid.principles.springboot.notifier;

import org.springframework.stereotype.Component;

@Component
public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
