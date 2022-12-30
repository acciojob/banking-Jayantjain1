package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;
    public double getMinBalance(){
        return minBalance;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public BankAccount(String name,double balance,double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }
//123568968
    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        int num = digits;
        int tempSum = 0;
        while(num > 0){
            int re = num % 10;
            tempSum = tempSum * 10 + re;
            num = num / 10;
        }
        if(tempSum != sum){
            throw new Exception("Account Number can not be generated");
        }
        else{
            return Integer.toString(tempSum);
        }
//        return null;
    }

    public void deposit(double amount) {
        //add amount to balance
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        balance = balance - amount;
        if(balance < getMinBalance()){
            throw new Exception("Insufficient Balance");
        }

    }

}
//package com.driver;
//
//public class BankAccount {
//
//    private String name;
//    private double balance;
//    private double minBalance;
//
//    public BankAccount(String name, double balance, double minBalance) {
//
//    }
//
//    public String generateAccountNumber(int digits, int sum) throws Exception{
//        //Each digit of an account number can lie between 0 and 9 (both inclusive)
//        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
//        //If it is not possible, throw "Account Number can not be generated" exception
//
//        return null;
//    }
//
//    public void deposit(double amount) {
//        //add amount to balance
//
//    }
//
//    public void withdraw(double amount) throws Exception {
//        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
//
//    }
//
//}