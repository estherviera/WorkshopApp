package org.ulpgc.is1.model;

import java.util.ArrayList;
//atributos
public class Vehicle {
    private String make;
    private String model;
    private Plate plate;
    private Customer customer;

    //constructor
    public Vehicle(String make, String model, Plate plate, Customer customer) {
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.customer = customer;
    }

    //getter
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Plate getPlate() {
        return plate;
    }

    public Customer getCustomer() {
        return customer;
    }

    //setter
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}




