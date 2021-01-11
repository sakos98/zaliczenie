package devices;

public abstract class Device {
    String producer;
    String model;
    String yearOfProduction;

    abstract void turnOn();
}
