package org.ulpgc.is1.model;

import java.util.Date;
//atributos
public class Payment {

    private Date date;
    private int amount;

    //constructor
    public Payment(Date date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    //getter
    public Date getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    //setter
    public void setDate(Date date) {
        this.date = date;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
