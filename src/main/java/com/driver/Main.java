package com.driver;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("BOI",23,3.0,9.0);
        System.out.print(s.getCompoundInterest(2,3));

    }
}