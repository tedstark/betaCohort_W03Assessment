package com.company;

public class Main {

    public static void main(String[] args) {
        // 2018.01.26 - Week 3 Assessment Challenge, Bank Account Generator
        /*Filename: Tomato Paste
        You are going to create a banking application that creates different types of banking accounts.
        This application will not accept user input, but rather serve as part of a larger application.
        The portion that you are developing will be the one that actually creates the classes that all bank accounts will be based off of.
        First, you will need to create a parent 'Bank Account' class that has a 'Balance' that will be a public member.
        All Bank accounts should be able to 'Withdraw' and 'Deposit'.
        Withdraws and Deposits can affect the Balance, but should provide an update printed on the screen,
            with how much has been deposited or withdrawn from the account, as well as the new balance.
        ***
        Now create two new bank accounts that inherit (extend) from the main Bank Account class,
            entitled 'Savings Account' and 'Checking Account'.
        With the Savings Account, users should not be able to withdraw more money than they have in the account.
        Additionally, there should be a method on this class entitled 'Compound Interest',
            which accepts an 'Interest' argument that when ran, adds the interest onto the current balance
            while providing an update printed on the screen.
        With the Checking Account, users will be able to deduct more funds than they have available,
            but should be charged an 'Overdraft Fee', which should be a constant provided in the class.
        When a user does this, it should provide an update printed to the screen, letting the user know
            that they have over drafted.
        Once you classes have been built, create two new accounts (one Savings and one Checking)
            and deposit $500 into each account.
        Try to deduct $550 from the Savings account, then compound 6% interest to the account.
        Then with the Checking account, deduct $550 from the account.

        Note that the 'compound' interest is a 'stretch' goal.
        Not required in the final submission, more just an extra challenge if you want it*/

//        BankAccount testAccount = new BankAccount(0);
//        testAccount.deposit(3000);
//        testAccount.withdraw(2000);

        Checking testChecking = new Checking(0);
        testChecking.deposit(500);
        testChecking.withdraw(550);

        Savings testSavings = new Savings(0);
        testSavings.deposit(500);
        testSavings.withdraw(550);

        testSavings.compoundInterest(6);
    }
}
