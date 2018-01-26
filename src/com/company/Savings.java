package com.company;


public class Savings extends BankAccount {

    public Savings(double balance) {
        super(balance);
        System.out.println("   The new account is a Savings account");
    }

    public double compoundInterest(double interest) {
        double rate = interest/100;
        this.balance = (this.balance + (this.balance*rate));
        System.out.println("After " +interest + "% interest this period, your Savings account balance is now $" + this.balance + ".");
        System.out.println("");
        return this.balance;
    }

    @Override
    public double withdraw(double amount) {
        double tempBalance = this.balance - amount;
        if (tempBalance < 0) {
            System.out.println("A withdrawal in the amount of $" + amount + " is not possible for Savings account " + this.acctNum + ".");
            System.out.println("   The account only has $" + this.balance + ".");
            System.out.println("");
        } else {
            this.balance -= amount;
            System.out.println("A withdrawal in the amount of $" + amount + " was made for Savings account " + this.acctNum + ".");
            System.out.println("   The new Savings account balance is $" + this.balance + ".");
            System.out.println("");

        } return this.balance;
    }
}