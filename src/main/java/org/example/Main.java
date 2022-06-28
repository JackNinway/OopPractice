package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book aBook = new Book();

        Author author = new Author("AA BB",);

        ArrayList<Author> author = new ArrayList<Author>();
        author.add("AA BB");

        Rectangle myRectangle = new Rectangle();
        Car myCar = new Car("NPK 111", "Volvo", "red", 1955, 29);
        BancAccount customerJN = new BancAccount();
        BancAccount customerAT = new BancAccount();

        customerJN = new BancAccount("111", "Jack Ninway", "jn@se.se", "070112233",999) ;
        customerJN.depositAccount(11);
        customerJN.withdrawAccount(1111);

        System.out.println(myCar.drive());

        System.out.println("Height = ?");
        myRectangle.setHeight(scanner.nextDouble());
        System.out.println("Width = ?");
        myRectangle.setWith(scanner.nextDouble());
        System.out.println("The rectangles area is: " + myRectangle.getArea());
    }
}