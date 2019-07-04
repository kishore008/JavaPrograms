package com.kishore;

public class Main {

    public static void main(String[] args) {
//	    BankAccount bankAccount = new BankAccount(779517377, 500, "kishore", "kishoresminds@gmail.com", 777951737);
//	    bankAccount.setAccountNumber(779517377);
//	    bankAccount.setBalance(500);
//	    bankAccount.setCustomerName("Kishore");
//	    bankAccount.setEmail("kishroesminds@gmail.com");
//	    bankAccount.setPhoneNumber(779517377);

//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getBalance());
//        System.out.println(bankAccount.getCustomerName());
//        System.out.println(bankAccount.getEmail());
//        System.out.println(bankAccount.getPhoneNumber());
//
//        bankAccount.depositFund(1000);
//        bankAccount.withdrawFunds(50);
//        bankAccount.withdrawFunds(1450);
//
//        System.out.println("The balance in your account is " + bankAccount.getBalance());

        VipCustomer customer1 = new VipCustomer("kishore1", 1500, "Kishoresminds@gmail.com");
        System.out.println("YOu're " + customer1.getName() + " your credit limit is " + customer1.getCreditLimit() + " and your email is " + customer1.getEmail());

        VipCustomer customer2 = new VipCustomer(1500, "Kishoresmind2@gmail.com");
        System.out.println("YOu're " + customer2.getName() + " your credit limit is " + customer2.getCreditLimit() + " and your email is " + customer2.getEmail());

        VipCustomer customer3 = new VipCustomer("Kishoresmind3@gmail.com");
        System.out.println("YOu're " + customer3.getName() + " your credit limit is " + customer3.getCreditLimit() + " and your email is " + customer3.getEmail());
    }
}
