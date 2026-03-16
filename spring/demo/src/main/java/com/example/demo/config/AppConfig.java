package com.example.demo.config;
import java.util.HashMap;
import java.util.Map;

public class AppConfig {
    private static AppConfig instance;
    private final Map<String, Object> configs = new HashMap<>();

    private AppConfig() {
        configs.put("dbHost", "localhost");
        configs.put("dbPort", 5432);
        configs.put("shopName", "Highland Coffee");
        configs.put("maxOrders", 100);
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) instance = new AppConfig();
        return instance;
    }

    public Object getConfig(String key) { return configs.get(key); }
    public void setConfig(String key, Object value) { configs.put(key, value); }
}