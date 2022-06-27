package org.example;

public class BancAccount {

// static field
    int counter = 0;
// Instance fields
    private String accNumber, name, email, phoneNr;
    private double balance;

    public BancAccount(String accNumber, String name, String email, String phoneNr, double balance) {
        this();
        this.accNumber = accNumber;
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        balance = balance;
    }

    public BancAccount() {
        this.accNumber = "No account registred";
        this.name = "UNKNOWN_NAME";
        this.email = "No customer";
        this.phoneNr = "No customer";
        this.balance = 0;
    }

// deposit to the account
    public  void depositAccount(double amount) {
        balance += amount;
        System.out.printf(" You have:\t  %.2f \n", balance );
    }
// withdraw from account
    public void withdrawAccount(double amount){
        if (amount < balance) {
            balance -= amount;
            System.out.printf(" You have:\t  %.2f \n", balance );
        }
        else
            System.out.println("you have not enough money");
    }

// Getters & Getters
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


