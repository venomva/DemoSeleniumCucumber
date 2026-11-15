package com.testver.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Reads configuration from config.properties file.
 * Supports override via environment variables (uppercase, dot replaced with underscore).
 */
public class ConfigReader {

    private static final Logger log = LogManager.getLogger(ConfigReader.class);
    private static final Properties properties = new Properties();
    private static boolean loaded = false;

    private static void loadProperties() {
        if (loaded) return;
        String configPath = System.getProperty("config.path", "config/config.properties");
        try (FileInputStream fis = new FileInputStream(configPath)) {
            properties.load(fis);
            log.info("Loaded configuration from: {}", configPath);
        } catch (IOException e) {
            log.warn("Could not load config.properties from '{}'. Using defaults and env vars.", configPath);
        }
        loaded = true;
    }

    public static String get(String key) {
        loadProperties();
        // Environment variable override: APP_URL, BROWSER, etc.
        String envKey = key.toUpperCase().replace(".", "_");
        String envValue = System.getenv(envKey);
        if (envValue != null && !envValue.isEmpty()) {
            log.debug("Using env var {} = {}", envKey, envValue);
            return envValue;
        }
        return properties.getProperty(key);
    }

    public static String getAppUrl() {
        return get("app.url");
    }

    public static String getBrowser() {
        return get("browser");
    }

    public static boolean isHeadless() {
        return Boolean.parseBoolean(get("headless"));
    }

    public static int getImplicitWaitSeconds() {
        return parseInt("implicit.wait.seconds", 10);
    }

    public static int getExplicitWaitSeconds() {
        return parseInt("explicit.wait.seconds", 15);
    }

    public static int getPageLoadTimeoutSeconds() {
        return parseInt("page.load.timeout.seconds", 30);
    }

    private static int parseInt(String key, int defaultValue) {
        try {
            return Integer.parseInt(get(key));
        } catch (NumberFormatException e) {
            log.warn("Invalid number for key '{}', using default: {}", key, defaultValue);
            return defaultValue;
        }
    }
}
