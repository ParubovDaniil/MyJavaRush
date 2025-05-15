package Java_Syntax_Pro.L27.lvl27_6;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    static {
        synchronized (new OurPresident()){
            if (president == null) {
                president = new OurPresident();
            }
        }
    }

    public static OurPresident getOurPresident() {
       return president;
    }
}
