package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;
    public double getMaxWithdrawalLimit(){
        return maxWithdrawalLimit;
    }
    public double getRate(){
        return rate;
    }
    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name,balance,0);
        this.rate = rate;
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount > getMaxWithdrawalLimit()){
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        else{
            throw new Exception("Insufficient Balance");
        }
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
//        double finalAmount = getBalance()*(1 + (rate*years)/100);
        return getBalance()*(1 + (rate*years)/100);
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
//        getBalance() * Math.pow((1 + rate / (100*times)), times * years);
//        double tempAmount = getBalance()*(1 + (getRate())/years);
//        double finalAmount = Math.pow(tempAmount, times);
//        return finalAmount;
        return getBalance() * Math.pow((1 + getRate() / (100*times)), times * years);
    }


}

//package com.driver;

//public class SavingsAccount extends BankAccount{
//    double rate;
//    double maxWithdrawalLimit;
//
//    public double getRate(){
//        return rate;
//    }
//
//    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
//        // minimum balance is 0 by default
//
//    }
//    public void withdraw(double amount) throws Exception {
//        // Might throw the following errors:
//        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
//        // 2. "Insufficient Balance" : If the amount exceeds balance
//        if(amount > maxWithdrawalLimit){
//            throw new Error("Maximum Withdraw Limit Exceed");
//        }
//        if(amount  >getBalance()){
//            throw new Error("Insufficient Balance");
//        }
//
//    }
//
//    public double getSimpleInterest(int years){
//        // Return the final amount considering that bank gives simple interest on current amount
//        double initialAmount = getBalance();
//        double finalAmount = initialAmount * (double)years * getRate();
//        return finalAmount;
//    }
//
//    public double getCompoundInterest(int times, int years){
//        // Return the final amount considering that bank gives compound interest on current amount given times per year
//
//    }
//
//}

