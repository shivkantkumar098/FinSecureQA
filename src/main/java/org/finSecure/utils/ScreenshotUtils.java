package org.finSecure.utils;

import org.finSecure.constant.FrameworkConstants;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtils {
// This file is part of the FinSecure project.
    public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            // Ensure the screenshot directory exists
            File screenshotsDir = new File(FrameworkConstants.SCREENSHOT_PATH);
            if (!screenshotsDir.exists()) {
                screenshotsDir.mkdirs(); // Create the folder if it doesn't exist
            }

            String timestamp = String.valueOf(System.currentTimeMillis());
            File dest = new File(screenshotsDir, fileName + "_" + timestamp + ".png");

            Files.copy(src.toPath(), dest.toPath());
            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());

        } catch (WebDriverException | IOException e) {
            e.printStackTrace();
        }

    }
}
