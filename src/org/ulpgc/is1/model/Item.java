package org.ulpgc.is1.model;
//atributo
public class Item {
    public Integer quantity;
    //constructor
    public Item(Integer quantity) {
        this.quantity = quantity;
    }
    //getter
    public Integer getQuantity() {
        return quantity;
    }
    //setter
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

