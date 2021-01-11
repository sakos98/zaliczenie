package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    private Animal pet;
    private Car car;
    private Double salary = 5000.0;
    private Double cash = 100.0;
    private static final Integer DEFAULT_GARAGE_SIZE = 3;
    private Car[] garage;

    public String toString() {
        return firstName + " " + lastName;
    }

    public Human(String firstName, String lastName, Integer garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garage.length];
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        Human.this.phone = phone;
    }

    public void setCash(Double cash) {
        this.cash = this.cash + cash;
    }

    public Double getCash() {
        return cash;
    }

    public Double getSalary() {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentDate + " " + currentTime + "Your salary is: " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary must be bigger or equal 0.");
        } else {
            System.out.println("New data has been sent to accounting system.");
            System.out.println("Annex from the contract must be collected from Mrs Hanna from HR.");
            System.out.println("ZUS and US already know about salary change. There is no point hiding it.");
            this.salary = salary;
        }
    }

    public Car getCar(Integer garagePlace) {
        return this.garage[garagePlace];
    }

    public void setCar(Integer garagePlace, Car car) {
        this.garage[garagePlace] = car;
    }

    public Double carsValue() {
        double value = 0.0;
        for (Car index : garage) {
            if (index != null) {
                value += index.value;
            }
        }
        return value;
    }

    public void garageSort(Comparator comparator) {
        Arrays.sort(this.garage, comparator);
    }

    public boolean isFreePlace() {
        boolean answer = false;
        for (int index = 0; index < this.garage.length; index++) {
            if (this.garage[index] == null) {
                answer = true;
            }
        }
        return answer;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void removeCar(Car car) {
        for (int index = 0; index < this.garage.length; index++) {
            if (this.garage[index] == car) {
                this.garage[index] = null;
            }
        }
    }

    public void addCar(Car car) throws Exception {
        if (isFreePlace() == true) {
            for (int index = 0; index < this.garage.length; index++) {
                if (this.garage[index] == null) {
                    this.garage[index] = car;
                    break;
                }
            }
        } else {
            throw new Exception("Garage is full");
        }
    }

    public void buyCar(Car car) throws Exception {
        if (salary > car.value) {
            if (isFreePlace()) {
                addCar(car);
                System.out.println("The car was bought for cash.");
            }
        } else if (salary * 12 > car.value) {
            if (isFreePlace()) {
                addCar(car);
                System.out.println("The car was bought on credit");
            }
        }
    }
}
