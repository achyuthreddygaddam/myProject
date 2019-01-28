package com.company;

public class AccountMain {

    public static void main(String[] args) {

        AccountDetails AC = new AccountDetails();
        AC.ac_num = 12345;
        AC.name = "Achyuth";
        AC.balance = 1000;

        AC.display();
        AC.insert(12345, "Achyuth", 1000);
        AC.checkBalance();
        AC.deposit(20000);
        AC.withdraw(30000);
        AC.interest(1);

    }

}
