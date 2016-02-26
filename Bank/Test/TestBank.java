package Bank.Test;
/* 1 - Test Transfer Founds
 * 2 - Test for Exception
 * 3 - New JUnit Test Case (New Class) To Test Deposit() and Withdrawn()
 * 4 - Create Test Suite Class
 * 
 * 
 * Pasos: 	1- crear projecto y packetes
 * 			2- Descargar JUNIT y meterlo en el paquete test (los JAR)
 * 			3- Meter lo del Bank en otro paquete
 * 			4- Nuevo-> JUNIT -> nombre para el archivo y abajo seleccionar le archivo al que se le va a hacer el test
 * 			5- Al hacer next te dice si quieres incluir JUnit, si a todo y  GG
 * 
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Bank.Account;
import Bank.BankException;

public class TestBank {
	
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
	public void testTransferFunds() throws BankException {
		destinationTestA.TransferFunds(destinationTestB, 100.0F);
		assertTrue(destinationTestA.getBalance() == 100 );
		assertTrue(destinationTestB.getBalance() == 250);
	}
	
	
	
	
	@Test( expected = BankException.class)
	public void bankExceptionTest() throws BankException{
		destinationTestA.TransferFunds(destinationTestB, 99999);
	}
	
	@Test
	public void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMinimumBalance() {
		fail("Not yet implemented");
	}




}
