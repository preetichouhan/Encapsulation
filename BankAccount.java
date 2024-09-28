package com.encapsulation;

import java.util.Scanner;

public class BankAccount 
{
 private double balance;
 
 BankAccount(double bankBalance)
 {
	 balance = bankBalance;
 }
 public double getBankBlnce()
 {
	 return balance;
 }
 public void setBankBlnce(double balance)
 {
	 this.balance = balance;
 }
 
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter bank balance: - ");
   double balance = sc.nextDouble();
   
   BankAccount b1 = new BankAccount(balance);
   
   b1.setBankBlnce(balance);
   System.out.println(b1.getBankBlnce());

	}

}
