package com.example.lab9saulo;

public class PasswordValidator {
    private NotificationService notificationService;

    public PasswordValidator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }

        if (hasUpperCase) {
            notificationService.sendNotification("Password is valid");
        }

        return hasUpperCase;
    }
}