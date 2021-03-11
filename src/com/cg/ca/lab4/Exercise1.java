package com.cg.lab4;

import java.util.Random;
import java.util.Scanner;

class Account{
	final int minimum_balance=500;
	public long accNum;
	public double balance;
	public Person accHolder;
	public boolean AccFlag = false;

	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public int getMinimum_balance() {
		return minimum_balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		double bal = getBalance();
		 setBalance(bal+amount);
		 System.out.println("Succesful!! Your balance is : Rs."+getBalance());

	}
	
	public void withdraw(double amount) {
		double bal = getBalance();
		 if((bal-amount)<500) {
			 System.out.println("Can't withdraw money!! Minimum balance must be Rs."+minimum_balance);
		 }
		 else {
			 setBalance(bal-amount);
			 
			 System.out.println("Succesfull!! You've withdrawn Rs."+ amount +"\nRemaining Balance is : Rs."+getBalance());
		 }
		 

	}
	public double getBalance() {
		 return balance;

	}
	
	
}

class AccountCreator extends Account{

	
	public static void accNumGen() {
	
	}
	
	public void AccountCreatorMethod() {
		
		
		Person objPerson=new Person();
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Name");
	    String userName = myObj.nextLine(); 
	    objPerson.setName(userName);
	    Scanner myObj7 = new Scanner(System.in);  
	    System.out.println("Enter Age");
	    float userAge = myObj.nextFloat();
	    objPerson.setAge(userAge);
	 
	    
	    Scanner myObj2=new Scanner(System.in);
	    System.out.println("Enter amount to deposit \nNote: Minimum balance is "+minimum_balance+ ":");
	    long amout = myObj2.nextLong();
	    if(amout<minimum_balance) {
	    	System.out.println("! Amount should be more than "+minimum_balance);
	    }
	    else {
	    	int START =1000000000;
	    	long END = 9999999999L;
	    	
	  	  long range = END - (long)START + 1;
		    Random random = new Random();
		  
		    
		 	Account s = new Account();
		   	s.setAccNum(Math.abs((long)(range*random.nextLong())));
		   
		    deposit(amout);
		    AccFlag=true;
		   
		    
		    
		    System.out.println("\t\tAccount created Succesfulyy!!");
		    System.out.println("\t\tName : "+objPerson.getName());
		    System.out.println("\t\tAge : "+objPerson.getAge());
		     
		   System.out.println("\t\tAccount number :"+s.getAccNum());
		    banking();
	  
	    }
	   
	}
	
	public void banking() {
		System.out.println("\t\t\tWelcome");
		 
		if(AccFlag==true) {
			while(true) {
				 
				   System.out.println("===================Continue banking=======================");
				   System.out.println("Enter 1 to Desposit and 2 to withdraw");
				   Scanner myobj3 = new Scanner(System.in);
				   int option = myobj3.nextInt();
					   switch (option) {
					case 1:
						System.out.println("Enter amount to deposit :");
						Scanner myObj4=new Scanner(System.in);
						long amt = myObj4.nextLong();
						deposit(amt);
						break;
				
					default:
						System.out.println("Enter amount to witdraw :");
						Scanner myObj5=new Scanner(System.in);
						long am = myObj5.nextLong();
						withdraw(am);
						break;
					}
				    
			}
		}
		else {
			System.out.println("New user Detected!!\n\t\t Enter 1 to create account");
			Scanner myObj6=new Scanner(System.in);
			int option = myObj6.nextInt();
			switch (option) {
			case 1:
				AccountCreatorMethod();
				break;

			default:
				System.exit(0);
				break;
			}
			
		}

	}
	
}


public class Exercise1 {

	public static void main(String[] args) {
		AccountCreator obj = new AccountCreator();
		obj.banking();
	}



}

