package Bank.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Bank.Account;

public class TestBank2 {

	
	Account destinationTestA;
	Account destinationTestB;
	
	@Before
	public void setUp(){
		destinationTestA = new Account();
		destinationTestB = new Account();
		
		destinationTestA.Deposit(200);
		destinationTestB.Deposit(150);

	}
	
	@Test
	public void testDeposit() {
		destinationTestA.Deposit(200);
		destinationTestB.Deposit(200);
		assertTrue(destinationTestA.getBalance() == 400);
		assertTrue(destinationTestB.getBalance() == 350);
	}

	@Test
	public void testWithdraw() {
		destinationTestA.Withdraw(100);
		destinationTestB.Withdraw(100);
		assertTrue(destinationTestA.getBalance() == 100);
		assertTrue(destinationTestB.getBalance() == 50);
	}

}
