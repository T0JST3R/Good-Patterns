package javagoodpatterns.factory;

public abstract class Car {
    private double engineCapacity;
    private String fuelType;
    private int YearOfProduction;
    private String steeringWheelPosition;

    public Car(double engineCapacity, String fuelType, int yearOfProduction, String steeringWheelPosiotion) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        YearOfProduction = yearOfProduction;
        this.steeringWheelPosition = steeringWheelPosiotion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", fuelType='" + fuelType + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                '}';
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }

    public String getSteeringWheelPosiotion() {
        return steeringWheelPosition;
    }
}
