package com.company;

public class Animal
{
    String name;
    String species;
    private Double weight;
    static final Double DEAFULT_DOG_WEIGHT = 8.8;

    public Animal(String species)
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

    void feed()
    {
        weight++;
        System.out.println("thx for fod bro, my weight is now " + weight);
    }

}
