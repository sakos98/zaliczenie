package com.company;

public class Car {
    final String producer;
    final String model;
    final String yearOffProduction;
    Double value;

    public Car(String producer, String model, String yearOffProduction){

        this.producer = producer;
        this.model = model;
        this.yearOffProduction = yearOffProduction;
    }

    public Car(String producer, String model, String yearOffProduction, Double value){

        this.producer = producer;
        this.model = model;
        this.yearOffProduction = yearOffProduction;
        this.value = value;
    }
}
