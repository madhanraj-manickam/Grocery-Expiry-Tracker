package com.madhanraj.expirytracker;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String productName = JOptionPane.showInputDialog("Enter Product Name:");
        LocalDate expiryDate = ExpiryInput.getExpiryDateFromUser(productName);
        ReminderScheduler.scheduleReminders(productName, expiryDate);
    }
}
