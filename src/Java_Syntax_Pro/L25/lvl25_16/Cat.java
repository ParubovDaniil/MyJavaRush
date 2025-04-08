package Java_Syntax_Pro.L25.lvl25_16;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Cat {
    public static int catCount = 0;
    public static String namePrefix;

    static {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("cat.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        namePrefix = (String) p.get("name-prefix");
    }
    public static int maxCatCount = 50;

    static {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("max.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (p.get("cat-max") != null)
            System.out.println();
    }
}