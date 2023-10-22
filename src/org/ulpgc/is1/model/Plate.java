package org.ulpgc.is1.model;

public class Plate {

    //atributos
    private String number;

    //constructor
    public Plate(String number) {
        this.number = number;
    }

    //getter y setter
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // relación
    public boolean isValid() {
        if (number == null || number.isEmpty()) {
            return false;
        }

        for (char character : number.toCharArray()) {
            if (!Character.isLetterOrDigit(character)) {
                return false;
            }
        }

        return true;
    }
}
