package org.ulpgc.is1.model;
//atributo
public class Plate {
    private String number;

    //constructor
    public Plate(String number) {
        this.number = number;
    }

    //getter
    public String getNumber() {
        return number;
    }

    //setter
    public void setNumber(String number) {
        this.number = number;
    }

    //relación
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




