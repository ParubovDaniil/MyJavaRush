package Java_Syntax_Pro.L23;
import java.awt.*;

public class lvl23_14 {}

/*
Большая лисица — это такая лисица
*/

class Solution14 {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        public Color Color() {
            return Color.GRAY;
        }

        @Override
        public Color getColor() {
            return null;
        }
    }

}
