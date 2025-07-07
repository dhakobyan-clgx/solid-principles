package com.corelogic.solid.principles.springboot.service;

import com.corelogic.solid.principles.springboot.notifier.Notifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final Notifier notifier;

    // High-level module depends on abstraction
    public NotificationService(@Qualifier("emailNotifier") Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser(String message) {
        notifier.send(message);
    }
}