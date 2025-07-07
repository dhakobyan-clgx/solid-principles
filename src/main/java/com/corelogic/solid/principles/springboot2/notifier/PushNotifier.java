package com.corelogic.solid.principles.springboot2.notifier;

import org.springframework.stereotype.Component;

@Component("push")
public class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}
