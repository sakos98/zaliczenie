package creatures;

import com.company.Human;
import com.company.Sellable;

public abstract class Animal implements Sellable, Feedable
{
    private String name;
    String species;
    private Double weight = 20.0;
    static final Double DEAFULT_DOG_WEIGHT = 8.8;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Animal(String name, String species, Double weight)
    {
        this.species = species;
        if(species =="dog")
        {
            this.weight = DEAFULT_DOG_WEIGHT;
        }
        else if (species == "lion")
        {
            this.weight = 40.0;
        }
        else if (species == "mouse")
        {
            this.weight = 1.2;
        }
    }

    public void feed(Double foodWeight)
    {
        if(weight <= 0)
        {
            System.out.println("Your pet " +name +" is dead :(");
        }
        else
        {
            weight++;
            System.out.println("Thanks for food, my weight is now "+weight);
        }

    }

    void takeForAWalk()
    {

        if (weight > 1)
        {
            weight--;
            if (weight <= 0)
            {
                weight = 0.0;
                System.out.println("Your pet " +name+ " died");
            }
            else
            {
                System.out.println("Thanks for a walk ;) my weight is now " +weight);
            }
        }
        else
        {
            weight= 0.0;
            System.out.println("Your pet "+name+" died");
        }
    }

    public String toString(){
        return name + " " + species + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price)
    {
        if(seller.getPet() != null) {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(-price);
                seller.setCash(price);
                buyer.setPet(this);
                seller.setPet(null);
                System.out.println(buyer.toString() + " bought " + this.toString() + " from " + seller.toString() + " for " + price + "$");
            }
            else
            {
                System.out.println(buyer.toString() + " has not enough money");
            }
        }
        else
        {
            System.out.println(seller.toString() + " hasn't got any pet to sell");
        }
    }

}
