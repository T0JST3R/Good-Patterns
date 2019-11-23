package javagoodpatterns.FlyWeight;

public class ColorRepository {
    static private Color white = new Color(0, 0, 0);
    static private Color black = new Color(255, 255, 255);

    public static Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }
}
