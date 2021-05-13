package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account implements ATM {
    private String name, citizenID;
    private float balance;
    public List<String> transactionHistory = new ArrayList<String>();

    public Account(String name,
                   String citizenID,
                   float initialBalance){
        this.name = name;
        this.citizenID = citizenID;
        this.balance = initialBalance;
    }

    public void showAllInfo(){
        System.out.println("This account belongs to: " + this.name);
        System.out.println("Personal identification number: " + this.citizenID);
        System.out.println("..................................................");
        System.out.println("Balance: " + this.balance + " units");
    }

    public void showTransactionHistory(){
        System.out.println("Transaction History: \n");
        this.transactionHistory.forEach(System.out::println);
    }

    public void withdraw(float amount){
        this.balance = this.balance - amount;
    }

    public void deposit(float amount){
        this.balance = this.balance + amount;
    }

    public void addTransaction(String transaction){
        this.transactionHistory.add(transaction);
    }

    public float getBalance(){
        return this.balance;
    }

    public String getName(){
        return this.name;
    }

    public String getCitizenID(){
        return this.citizenID;
    }
}
