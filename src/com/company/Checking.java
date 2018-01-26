package com.company;

public class Checking extends BankAccount {
    public Checking(double balance) {
        super(balance);
        System.out.println("   The new account is a Checking account");
    }

    @Override
    public double withdraw(double amount) {
        double tempBalance = this.balance - amount;
        double feeOD = 25;
        double amountOD = Math.abs(tempBalance);
        if (tempBalance < 0) {
            this.balance = tempBalance - feeOD;
            System.out.println("A withdrawal in the amount of $" + amount + " was made for Checking account " + this.acctNum + ".");
            System.out.println("   This account is now overdrawn by $" + amountOD + ".");
            System.out.println("   After assessing the $" + feeOD + " overdraft fee, the balance for account " +this.acctNum+ " is $" + this.balance +".");
            System.out.println("");
        } else {
            this.balance -= amount;
            System.out.println("A withdrawal in the amount of $" + amount + " was made for Checking account " + this.acctNum + ".");
            System.out.println("   The new checking account balance is $" + this.balance);
            System.out.println("");
        }
        return this.balance;
    }
}
