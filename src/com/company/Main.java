package com.company;


public class Main {

    public static void main(String[] args) {
        Account acc = new Account("Arwin Saleh", "19980311-XXXX", (float) 15314.12);
        acc.showAllInfo();

        System.out.print('\n');

        Transaction transaction = new Transaction(acc);
        String trans1 = transaction.getOutgoingTransaction("IKEA", (float) 4999.99);
        String trans2 = transaction.getIncomingTransaction("WORK", (float) 47000);

        acc.addTransaction(trans1);
        acc.addTransaction("\n" + trans2);

        acc.showTransactionHistory();
    }
}
