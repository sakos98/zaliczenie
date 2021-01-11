package devices;


import com.company.Sellable;

public abstract class Device implements Sellable {
    String producer;
    String model;
    String yearOfProduction;
    Double value;

    abstract void turnOn();
}
