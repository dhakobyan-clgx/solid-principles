package com.corelogic.solid.principles.springboot2.service;

import com.corelogic.solid.principles.springboot2.notifier.Notifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DynamicNotificationService {
    private final Map<String, Notifier> notifierMap;

    public DynamicNotificationService(Map<String, Notifier> notifierMap) {
        this.notifierMap = notifierMap;
    }

    public void notifyUser(String channel, String message) {
        Notifier notifier = notifierMap.get(channel);

        if (notifier == null) {
            throw new IllegalArgumentException("Unknown channel: " + channel);
        }

        notifier.send(message);
    }
}
