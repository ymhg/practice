package org.example.otp;

import java.util.HashMap;
import java.util.Map;

public class Context {
    public static Map<String, String> profiles;

    static {
        profiles = new HashMap<>();
        profiles.put("wc", "11");
        profiles.put("winnie", "22");
    }

    public static String getPassword(String key) {
        return profiles.get(key);
    }
}
