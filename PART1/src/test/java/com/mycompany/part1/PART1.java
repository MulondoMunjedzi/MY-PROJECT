/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mulondo Munjedzi
 */


public class PART1 {

    PART1 user = new PART1();

    @Test
    public void testUsernameValid() {
        assertTrue(user.isUsernameValid("abc_"));
    }

    @Test
    public void testUsernameInvalid() {
        assertFalse(user.isUsernameValid("abcdef"));
    }

    @Test
    public void testPasswordValid() {
        assertTrue(user.isPasswordValid("Abcdef1!"));
    }

    @Test
    public void testPasswordInvalid() {
        assertFalse(user.isPasswordValid("abc"));
    }

    @Test
    public void testPhoneValid() {
        assertTrue(user.isPhoneNumberValid("+27831234567"));
    }

    @Test
    public void testPhoneInvalid() {
        assertFalse(user.isPhoneNumberValid("0831234567"));
    }

    @Test
    public void testLoginSuccess() {
        user.saveUserDetails("John", "Doe", "abc_", "Abcdef1!", "+27831234567");
        assertTrue(user.isLoginSuccessful("abc_", "Abcdef1!"));
    }

    @Test
    public void testLoginFail() {
        user.saveUserDetails("John", "Doe", "abc_", "Abcdef1!", "+27831234567");
        assertFalse(user.isLoginSuccessful("wrong", "wrong"));
    }

    private boolean isUsernameValid(String abc_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isPasswordValid(String abcdef1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void saveUserDetails(String john, String doe, String abc_, String abcdef1, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isPhoneNumberValid(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean isLoginSuccessful(String abc_, String abcdef1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}