package org.ulpgc.is1.model;

import java.util.ArrayList;
//atributos
public class Mechanic {

    private String name;
    private String surname;
    //constructor
    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    //getter
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

