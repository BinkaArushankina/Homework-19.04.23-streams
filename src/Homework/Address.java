package Homework;

public class Address {

    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String toString() {
        return "Address" +
                " street = " + street  +
                " houseNumber  =" + houseNumber;
    }
}
