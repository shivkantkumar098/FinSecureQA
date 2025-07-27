package org.finSecure.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
// This file is part of the FinSecure project.
    private static final Properties props = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties")) {
            props.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file.", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
