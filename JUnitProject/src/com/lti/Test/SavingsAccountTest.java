package com.lti.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.lti.java.Bank;
import com.lti.java.SavingsAccount;

public class SavingsAccountTest {  //TestCase,  Tests, begin or end with Test
	
	static SavingsAccount savingsAccount;
	
	@BeforeAll
	static void initialize() {
		
		savingsAccount = Bank.getObject();
		System.out.println("initialize "+savingsAccount);
	}
	
	@BeforeEach
	void setUp() {
		 System.out.println("setUp() beforeEach invoked...");
		 //savingsAccount = Bank.getObject();
		 System.out.println("some coding...1");
		 System.out.println("some coding...2");
		 System.out.println("some coding...3");	   	
	}
	
	@Test
	void test3() {
	        System.out.println("Testing the deposit() method");
	        System.out.println("Creating object...");
	        
	    assertNotNull(savingsAccount);
	    
	        System.out.println("Object created..."+savingsAccount.hashCode());

	        double balanceBeforeDeposit = savingsAccount.getAccountBalance();
	        System.out.println("Invoking method");
	        double amountToDeposit = 3000;

	        savingsAccount.deposit(amountToDeposit);

	    assertEquals(balanceBeforeDeposit+amountToDeposit,  savingsAccount.getAccountBalance());

	    //  savingsAccount.withdraw(2000);
	        System.out.println("Deposit Method succeeded ..");
	}
	
	@Test
	public void test2() {
		System.out.println("Testing started  : .....");
		
		assertTrue(14>5); //strong belief - opinion
		System.out.println("passed1");
		
		assertTrue(240>50);
		System.out.println("passed2");
		
		assertTrue(34>5);
		System.out.println("passed3");
		
		SavingsAccount savObj = new SavingsAccount(100,"Julie",5000);
		
		System.out.println("Testing finished : .....");
	}
	
	@RepeatedTest(3)
	void test1() {
	        System.out.println("Testing the withdraw() method");
	        System.out.println("Creating object...");
	     
	    assertNotNull(savingsAccount);

        System.out.println("Object created..."+savingsAccount.hashCode());


	        double balanceBeforeWithdraw = savingsAccount.getAccountBalance();
	        System.out.println("Invoking method");
	        double amountToBeWithdrawn = 3000;

	        savingsAccount.withdraw(amountToBeWithdrawn);

	    assertEquals(balanceBeforeWithdraw-amountToBeWithdrawn,  savingsAccount.getAccountBalance());

	    //  savingsAccount.withdraw(2000);
	    assertTrue(savingsAccount.getAccountBalance() > 0 );
	        System.out.println("Withdraw Method succeeded .."+savingsAccount.getAccountBalance());
	        System.out.println("----------------------");
	}
	//bus booking system - 43 test cases - 
	//findBus() { }  findTicket() { }  findCustomer()
	//bookTicket() {} cancelTicket() { }
	// reservationChart(){ }
	//seatSelection(){ }	...
	
}