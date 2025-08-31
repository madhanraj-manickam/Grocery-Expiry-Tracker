package com.madhanraj.expirytracker;

import javax.swing.*;
import java.time.LocalDate;

public class ExpiryInput {
    public static LocalDate getExpiryDateFromUser(String product) {
        String input = JOptionPane.showInputDialog("Enter expiry date for " + product + " (YYYY-MM-DD):");
        return LocalDate.parse(input);
    }
}
