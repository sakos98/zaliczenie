package devices;
import java.util.Objects;

public class Car extends Device {
    final String producer;
    final String model;
    final String yearOffProduction;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    Double value;

    public Car(String producer, String model, String yearOffProduction){

        this.producer = producer;
        this.model = model;
        this.yearOffProduction = yearOffProduction;
    }

    public Car(String producer, String model, String yearOffProduction, Double value){

        this.producer = producer;
        this.model = model;
        this.yearOffProduction = yearOffProduction;
        this.value = value;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return producer.equals(car.producer) &&
                model.equals(car.model) &&
                yearOffProduction.equals(car.yearOffProduction) &&
                value.equals(car.getValue());
    }

    @Override
    //public int hashCode(){
        //return Object.hash(producer, model, yearOffProduction, value);
   // }

    public String toString() {
        return producer + " " + model + " " + yearOffProduction + " " + value;
    }
    public void turnOn() {
        System.out.println("Device is turned on");
    }
}
