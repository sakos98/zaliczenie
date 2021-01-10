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

        Car car = new Car("Porhe", "GT3", "2020", 2000.0);
        me.car = car;
        System.out.println(me.car.model);

        mause.feed();
        mause.takeForAWalk();
        mause.feed();
    }
}
