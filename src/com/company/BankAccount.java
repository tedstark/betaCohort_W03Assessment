package com.company;

import java.util.Random;

public class BankAccount {
    Random makeAccount = new Random();

    public double balance;
    public int acctNum = makeAccount.nextInt(999999-50);

    public BankAccount (double balance) {
        this.balance = balance;
        System.out.println("");
        System.out.println("A new bank account, " + this.acctNum + ", was created with a starting balance of $" + this.balance + ".");
    }

    public double withdraw (double amount) {
        this.balance -= amount;
        System.out.println("");
        System.out.println("A withdrawal in the amount of $" + amount + " was made for account " + this.acctNum + ".");
        System.out.println("   The new account balance is $" + this.balance);
        System.out.println("");
        return this.balance;
    }
    public double deposit (double amount) {
        this.balance += amount;
        System.out.println("");
        System.out.println("A deposit in the amount of $" + amount + " was made for account " + this.acctNum + ".");
        System.out.println("   The new account balance is $" + this.balance);
        System.out.println("");
        return this.balance;
    }
}
