package javagoodpatterns.factory;

public abstract class Factory {
    public abstract Car buildFord(FordModel fordModel);
    public abstract Car buildBMW(BMWModel bmwModel);
}
