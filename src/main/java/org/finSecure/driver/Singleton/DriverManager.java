package org.finSecure.driver.Singleton;

import org.finSecure.driver.factory.DriverFactory;
import org.finSecure.driver.manager.Browser;
import org.openqa.selenium.WebDriver;

// This file is part of the FinSecure project.
public class DriverManager {

        private static WebDriver driver;

        private DriverManager() {
            // private constructor to prevent external instantiation
        }

        public static WebDriver getDriver(String browserType) {
            if (driver == null) {
                synchronized (DriverManager.class) {
                    if (driver == null) {
                        Browser browser = DriverFactory.getDriver(browserType);
                        driver = browser.createDriver();
                    }
                }
            }
            return driver;
        }

        public static void quitDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }

