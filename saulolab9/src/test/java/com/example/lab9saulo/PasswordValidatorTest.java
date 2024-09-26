package com.example.lab9saulo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PasswordValidatorTest {

    // //Test for passwords with less than 8 characters
    // @Test
    // public void testPasswordValidatorShortPassword() {
    //     PasswordValidator validator = new PasswordValidator();
    //     String password = "Pass";
    //     assertFalse(validator.isValidPassword(password)); 
    // }
    
    // //Test for passwords with No uppercase letter
    // @Test
    // public void testPasswordValidatorNoUpperCase() {
    //     PasswordValidator validator = new PasswordValidator();
    //     String password = "Password"; 
    //     assertTrue(validator.isValidPassword(password)); 
    // }

    // //Test for passwords with meets both conditions
    // @Test
    // public void testPasswordValidatorValidPassword() {
    //     PasswordValidator validator = new PasswordValidator();
    //     String password = "Password123"; 
    //     assertTrue(validator.isValidPassword(password));
    // }

    // //Test for passwords with null input
    // @Test
    // public void testPasswordValidatorNullPassword() {
    //     PasswordValidator validator = new PasswordValidator();
    //     String password = null; // Null input
    //     assertFalse(validator.isValidPassword(password));
    // }
    
    // //Test for passwords with  Exactly 8 characters, with uppercase
    // @Test
    // public void testPasswordValidatorExactlyEightCharacters() {
    //     PasswordValidator validator = new PasswordValidator();
    //     String password = "Pass1234";
    //     assertTrue(validator.isValidPassword(password));
    // }

    @Test
    public void testValidPasword() {

        NotificationService mockNotificationService = mock(NotificationService.class);

        PasswordValidator passwordValidator = new PasswordValidator(mockNotificationService);

        passwordValidator.isValidPassword("Password");

        verify(mockNotificationService).sendNotification("Password is valid");
    }
    
}
