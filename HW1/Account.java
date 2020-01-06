package com.company;

/**
 * Created by Administrator on 2017-05-24.
 */
public class Account {

    protected String account;
    protected String name;
    protected int balance;

    public Account() {
    }

    public Account(String name, String account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int withdraw(int amount) {
        int withdrawal;
        if(amount < balance) {
           withdrawal = amount;

        } else {
            withdrawal = balance;
        }
        balance -= withdrawal;
        return withdrawal;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Account : " + account);
        System.out.println("Balance : " + balance);
    }

    @Override
    public String toString() {
        String str = name + ":" + account + ":" + balance;
        return str;
    }
}

