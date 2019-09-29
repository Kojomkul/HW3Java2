package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(10000);
        System.out.println(account.getAmount());
        try {
            for (; ; ) {
                account.withDraw(6000);
            }
        } catch (LimitException Le) {
            System.out.println("Ваш баланс составляет - " + Le.getRemainingAmount());
        }
    }
}
