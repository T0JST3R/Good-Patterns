package javagoodpatterns.factory;

public class CommonwealthFactory extends Factory {
    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(2.0, "Diesel", 2008, "Left");
            case FOCUS:
                return new Ford(1.5, "Diesel", 2005, "Left");
            default:
                throw new IllegalArgumentException("Unknown car type");
        }
    }

    @Override
    public Car buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case E60:
                return new BMW(2.0, "Diesel", 2000, "Left");
            case X5:
                return new BMW(2.5, "Diesel", 2010, "Left");

            default:
                throw new IllegalArgumentException("Unknown car type");
        }
    }
}