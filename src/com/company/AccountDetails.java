package com.company;

public class AccountDetails {
    int ac_num;
    String name;
    int balance;


    void insert(int a, String s, int b) {

        ac_num = a;
        name = s;
        balance = b;


    }

    void checkBalance() {
        System.out.println("Available Balance : " + balance);
    }

    void deposit(int amt) {
        balance = balance + amt;

        System.out.println("Amount Desposited : " + balance);
    }

    void withdraw(int amount) {

        amount = balance - amount;

        if (amount < balance) {
            System.out.println("Insuffcient Balance");
        } else {
            System.out.println("Withdrawn Amount : " + amount);
        }


        System.out.println("Amount Available after withdraw : " + amount);
    }

    void interest(double apr) {

        apr = (balance * 100) / apr;

        System.out.println("APR : " + apr);

    }

    void display() {
        System.out.println("Ac_Number : " + ac_num + "\n" + "Customer Name :" + name + "\n" + "Amount in Account : " + balance);
    }


}
