package org.finSecure.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// This file is part of the FinSecure project.
public class DateTimeUtils {
    public static String getCurrentTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
    }
}
