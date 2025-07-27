package org.finSecure.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
// This file is part of the FinSecure project.
public class WaitUtils {
    public static WebElement waitForElementVisible(WebDriver driver, By locator, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static boolean waitForElementInvisible(WebDriver driver, By locator, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}
