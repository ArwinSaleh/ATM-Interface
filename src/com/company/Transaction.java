package com.company;

import java.util.List;

public class Transaction {
    Account acc;

    public Transaction(Account acc) {
        this.acc = acc;
    }

    public String getOutgoingTransaction(String receiver, float amount){
        acc.withdraw(amount);
        return "From: " + acc.getName() + "     to: " + receiver + "" +
                "           Transaction Size: " + amount
                + "     Remaining Balance: " + acc.getBalance();
    }

    public String getIncomingTransaction(String transactor, float amount){
        acc.deposit(amount);
        return "From: " + transactor + "            to: " + acc.getName() +
                "    Transaction Size: " + amount
                + "     Remaining Balance: " + acc.getBalance();
    }
}