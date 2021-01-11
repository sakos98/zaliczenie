package devices;

public class Phone extends Device{
    public Phone(String producer, String model, String yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Device is turned on");
    }

    @Override
    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }
}
