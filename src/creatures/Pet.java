package creatures;

import creatures.Animal;

public class Pet extends Animal{
    public Pet (String name, String species, Double weight)
    {
        super(name, species, weight);
    }

    @Override
    public void feed() {

    }
}
