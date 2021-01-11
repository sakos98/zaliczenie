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

    public Double value;

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

    public void sell(Human seller, Human buyer, Double price, Integer garagePlace) throws Exception {
        if (seller.getCar(garagePlace) == null)
        {
            throw new Exception("Seller hasn't this car");
        }else if (buyer.isFreePlace() == false)
        {
            throw new Exception("Buyer hasn't place in garage");
        }else if (buyer.getCash() < price)
        {

            throw new Exception("Buyer hasn't got money");
        }else
        {
            seller.removeCar(this);
            buyer.addCar(this);
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            System.out.println("Transaction successful");
        }
    }
}

