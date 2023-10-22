package org.ulpgc.is1.model;
//atributo
public class Phone {
    private String number;
    //cocnstructor
    public Phone(String number) {
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
        if (number == null || number.length() != 9) {
            return false;
        }

        for (char digit : number.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false;
            }
        }
        return true;
    }
}

