package com.company;

import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Disel;
import devices.Phone;
import devices.Electric;

public class Main {

    public static void main(String[] args) throws Exception
    {

        Animal dog = new Pet("Chmurka", "dog", 10.0);


        Animal lion = new Pet("Leo", "Lion", 100.0);

        Human me = new Human("Michał", "Sak", 7);
        me.setSalary(999999999.0);
        me.setPet(dog);

        Animal mause = new Pet("Mikki", "Mause", 2.0);

        Electric car = new Electric("Tesla","Model S","2020", 1000.0);
        Disel car2 = new Disel("Volswagen","Polo","1995",150000.0);

       // boolean isHashCodeEquals = car.hashCode() == car2.hashCode();
       // if(isHashCodeEquals == true){
         //   System.out.println("Hashcode are the same");
       // }else {
       //     System.out.println("The id is different, that means objects are not equal");
       // }

        Phone phone = new Phone("Xiaomi", "MI 9 SE", "2019");

        Human human = new Human("Krzysztof", "Krawczyk", 6);

        //System.out.println((car).equals(car2));
        phone.installApp("facebook","Chrome","Archero","exam test answers","calculator");
        System.out.println(phone.installedApps[3]);
        phone.uninstallApp(3);
        System.out.println(phone.installedApps[3]);
        mause.feed();
        mause.feed();
        me.setSalary(5000.0);
        me.getSalary();
        phone.turnOn();
        me.getPet().feed(1.2);
        System.out.println(phone.toString());
        me.buyCar(car);
        me.buyCar(car2);
        System.out.println(me.getCash());
        System.out.println(me.getCar(0));
        System.out.println(me.carsValue());
    }
}
