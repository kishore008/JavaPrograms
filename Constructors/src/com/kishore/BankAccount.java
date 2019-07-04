package com.kishore;

public class BankAccount {

    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accountNumber, long balance, String customerName, String email, long phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFund(long balance){
        this.balance += balance;
        System.out.println("Your new balance after depositing funds of " + balance + " is " + this.balance);
    }

    public void withdrawFunds(long balance){
        if(this.balance<balance){
            System.out.println("Only " + this.balance + " available. Withdraw not processed");
        }else {
            this.balance -= balance;
            System.out.println("Your new balance after withdrawing funds of " + balance + " is " + this.balance);
        }

    }
}
