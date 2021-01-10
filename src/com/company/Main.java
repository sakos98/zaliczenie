package com.company;

public class Main {

    public static void main(String[] args)
    {
        Animal dog = new Animal("dog");
        dog.name = "Chmurka";

        Animal lion = new Animal ("lion");
        lion.name = "Leo";

        Human me = new Human("Michał", "Sak");
        me.pet = dog;

        Animal mause = new Animal("mause");
        mause.name = "Jerry";

        mause.feed();
        mause.takeForAWalk();
        mause.feed();
    }
}
