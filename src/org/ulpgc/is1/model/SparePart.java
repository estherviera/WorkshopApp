package org.ulpgc.is1.model;

import java.util.ArrayList;
//atributos
public class SparePart {

    private String name;
    private Integer price;

    //constructor
    public SparePart(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
