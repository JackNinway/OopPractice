package org.example;

public class Main {
    public static void main(String[] args) {

        BancAccount customerJN = new BancAccount();
        BancAccount customerAT = new BancAccount();
        customerJN = new BancAccount("111", "Jack Ninway", "jn@se.se", "070112233",999) ;
        customerJN.depositAccount(11);
        customerJN.withdrawAccount(1111);

        Car myCar = new Car("NPK 111", "Volvo", "red", 1955, 29);
        System.out.println(myCar.drive());
    }
}