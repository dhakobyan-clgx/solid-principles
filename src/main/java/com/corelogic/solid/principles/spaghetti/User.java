package com.corelogic.solid.principles.spaghetti;


public class User {

    private boolean active;
    private Account account;

    public boolean isActive() {
        return active;
    }

    public Account getAccount() {
        return account;
    }
}
