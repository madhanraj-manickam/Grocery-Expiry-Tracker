package com.madhanraj.expirytracker;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.*;

public class ReminderScheduler {
    public static void scheduleReminders(String product, LocalDate expiryDate) {
        LocalDate today = LocalDate.now();
        long daysLeft = ChronoUnit.DAYS.between(today, expiryDate);

        if (daysLeft <= 0) {
            System.out.println("⚠️ Product already expired.");
            return;
        }

        long interval = daysLeft / 10;
        if (interval < 1) interval = 1;

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("🔔 Reminder: " + product + " will expire on " + expiryDate);
        };

        scheduler.scheduleAtFixedRate(task, 0, interval, TimeUnit.SECONDS);

        System.out.println("✅ Reminder set for every " + interval + " day(s).");
    }
}
