package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ImageLoader {
    private static Properties prop;
    private static final HashMap<String, String> imageAddresses = new HashMap<>();

    public static void load() {
        if (!imageAddresses.isEmpty()) imageAddresses.clear();
        if (prop == null) prop = new Properties();
        try {
            InputStream input = new FileInputStream("src/main/resources/config.properties");
            prop.load(input);
            imageAddresses.put("captcha1", prop.getProperty("captcha1"));
            imageAddresses.put("captcha2", prop.getProperty("captcha2"));
            imageAddresses.put("captcha3", prop.getProperty("captcha3"));
            imageAddresses.put("captcha4", prop.getProperty("captcha4"));
            imageAddresses.put("download", prop.getProperty("download"));
            imageAddresses.put("search_image", prop.getProperty("search_image"));
            imageAddresses.put("sharif_logo", prop.getProperty("sharif_logo"));
            imageAddresses.put("question", prop.getProperty("question"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, String> getImageAddresses() {
        load();
        return imageAddresses;
    }
}
