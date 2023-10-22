package org.ulpgc.is1.model;

import java.util.ArrayList;
//atributos
public class Customer {
    private String name;
    private Phone phone;

    //constructor
    public Customer(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    //getter
    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}

