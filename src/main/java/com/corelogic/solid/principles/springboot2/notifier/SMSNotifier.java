package com.corelogic.solid.principles.springboot2.notifier;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
