package creatures;

import creatures.Animal;
import creatures.Edbile;

public class FarmAnimal extends Animal implements Edbile{

    public FarmAnimal (String name, String species, Double weight)
    {
        super(name, species, weight);
    }

    public void beEaten(){

    }

    @Override
    public void feed() {

    }
}
