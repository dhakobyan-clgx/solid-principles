package com.corelogic.solid.principles.spaghetti;

public class Solution {

    public void Spaghetti(User user) {
        if (user != null) {
            if (user.isActive()) {
                if (user.getAccount() != null) {
                    if (user.getAccount().getBalance() > 0) {
                        // Proceed with operation
                    } else {
                        // Handle insufficient balance
                    }
                } else {
                    // Handle null account
                }
            } else {
                // Handle inactive user
            }
        } else {
            // Handle null user
        }
    }

    public void refinedSpaghetti(User user) {
        if (user == null) {
            // Handle null user
            return;
        }
        if (!user.isActive()) {
            // Handle inactive user
            return;
        }
        Account account = user.getAccount();
        if (account == null) {
            // Handle null account
            return;
        }
        if (account.getBalance() <= 0) {
            // Handle insufficient balance
            return;
        }
        // Proceed with operation
    }
}
