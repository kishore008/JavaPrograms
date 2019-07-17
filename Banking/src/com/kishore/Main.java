package com.kishore;

public class Main {

    public static void main(String[] args) {
	    Bank bank = new Bank("Kishore Bank");

	    bank.addBranch("Bangalore");

	    bank.addCustomer("Bangalore", "Kishore", 1000);
	    bank.addCustomer("Bangalore", "Madhuri", 5000);
	    bank.addCustomer("Bangalore", "Sunny", 3000);

	    bank.addBranch("Kolar");
	    bank.addCustomer("Kolar", "Manasa", 50000);

	    bank.addCustomerTransaction("Bangalore", "Kishore", 500);
	    bank.addCustomerTransaction("Bangalore", "Madhuri", 2000);

	    bank.listCustomers("Bangalore", true);
	    bank.listCustomers("Kolar", false);

	    if(!bank.addCustomer("Melborne", "Brain", 5.53)){
			System.out.println("Melborne doesn't exist");
		}

	    if(!bank.addBranch("Bangalore")){
			System.out.println("Adelaide Branch exists already");
		}

	    if(!bank.addCustomerTransaction("Bangalore", "Appu", 552)){
			System.out.println("Customer doesn't exist at branch");
		}

	    if(!bank.addCustomer("Bangalore", "Kishore", 5000)){
			System.out.println("Custoemer Kishore already exisits");
		}
    }
}
