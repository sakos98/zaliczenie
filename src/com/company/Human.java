package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private  Double salary;

    public Human()
    {

    }

    public Human(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getSalary(){
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentDate + " " + currentTime + "Your salary is: "+ salary);
        return salary;
    }

    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Salary must be bigger or equal 0.");
        } else{
            System.out.println("New data has been sent to accounting system.");
            System.out.println("Annex from the contract must be collected from Mrs Hanna from HR.");
            System.out.println("ZUS and US already know about salary change. There is no point hiding it.");
            this.salary = salary;
        }
    }
}
