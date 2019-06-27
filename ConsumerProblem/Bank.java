package com.Thread.ConsumerProblem;

public class Bank {
	int amount=10000;
	 synchronized void withdraw(int amount) {
		 System.out.println("Going to withdraw..");
		 if(this.amount<amount)
		 {
			 System.out.println("Insuefficent Fund : "+this.amount+" amount Deposited");
		 }
		 try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		 this.amount=-amount;
		 {
			 System.out.println("Withdraw Completed"+":"+amount);
		 }
		 
	 }
	 
	 synchronized void deposit(int amount) {
		 System.out.println("Going to deposit");
		 this.amount+=amount;
		 System.out.println("Deposit completed, total amount is"+":"+this.amount);
		 notify();
	 }
	 
	 public static void main(String[] args) {
		 final Bank b=new Bank();
		 Thread t1=new  Thread() {
			 @Override
			 public void run() {
				 b.withdraw(15000);
			 }
		 };
		 t1.start();
		 
		 Thread t2=new Thread() {
			 @Override
			 public void run() {
				 b.deposit(10000);
			 }
		 };
		 t2.start();
		 
	 }

}
