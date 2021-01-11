package devices;
import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getPhone() != null)
        {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(-price);
                seller.setCash(price);
                buyer.setPhone(this);
                seller.setPhone(null);
                System.out.println(buyer.toString() + " bought " + this.toString() + " from " + seller.toString() + " for " + price + "$");
            }
            else
            {
                System.out.println(buyer.toString() + " has not enough money");
            }
        }
        else
        {
            System.out.println(seller.toString() + " hasn't got any phone to sell");
        }
    }
}
