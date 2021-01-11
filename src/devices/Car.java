package devices;
import com.company.Human;

import java.util.Objects;

public abstract class Car extends Device {
    final String producer;
    final String model;
    final String yearOffProduction;
    public Double resource = 30.0;
    public Double capacityOfResource = 100.0;

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

    public abstract void refuel(double qunatity);

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
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() != null)
        {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(-price);
                seller.setCash(price);
                buyer.setCar(this);
                seller.setCar(null);
                System.out.println(buyer.toString() + " bought " + this.toString() + " from " + seller.toString() + " for " + price + "$");
            }
            else {
                System.out.println(buyer.toString() + " has not enough money");
            }
        }
        else {
            System.out.println(seller.toString() + " hasn't got any car to sell");
        }
    }


}
