package com.account;

public class Account {
    String accountName;
    double balance;
    public Account( String accountName,double balance) {
        this.accountName = accountName;
        if(balance>0){
            this.balance = balance;
        }
        else{
            System.out.println("Balance should be greater than 0 ");
        }
    }
    public double getBalance() {
        return balance;
    }


    public void credit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Credit amount  should be greater than 0 ");
        }
    }
    public void debit(double amount){

            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Debit amount exceeded account balance.");
            }
    }
}
