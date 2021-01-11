package com.company;

import devices.Car;
import devices.Phone;

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
        Car car2 = new Car("Ferrari", "Roma", "2019", 10000.0);

        boolean isHashCodeEquals = car.hashCode() == car2.hashCode();
        if(isHashCodeEquals == true){
            System.out.println("Hashcode are the same");
        }else {
            System.out.println("The id is different, that means objects are not equal");
        }

        Phone phone = new Phone("Xiaomi", "MI 9 SE", "2019");

        Human human = new Human("Krzysztof", "Krawczyk");

        System.out.println((car).equals(car2));
        me.setCar(car);

        mause.feed();
        mause.takeForAWalk();
        mause.feed();
        me.setSalary(5000.0);
        me.getSalary();
        car2.turnOn();
        phone.turnOn();
        System.out.println(car2.toString());
        System.out.println(phone.toString());
    }
}
