package org.finSecure.driver.factory;

import org.finSecure.driver.manager.*;

public class DriverFactory {
    // Using Factory pattern to return appropriate Browser supplier
    public static Browser getDriver(String driverType) {
        if (driverType == null) {
            throw new IllegalArgumentException("Driver type cannot be null");
        }
        switch (driverType.toLowerCase()) {
            case "chrome":
                return new ChromeDriverSupplier();
            case "firefox":
                return new FirefoxDriverSupplier();
            case "edge":
                return new EdgeDriverSupplier();
            default:
                throw new IllegalArgumentException("Invalid driver type: " + driverType);
        }
    }
}
