
package Bank;

/*JUNIT:
 * 	UNIT TEST: Test a single class
 * 	TEST CASE: Test a method
 * 	TEST SUITE: Collection of Tests Cases
 * 
 *	Best Practice:
 *	Separate Production and Test code
 *	To do so we store the files in a package and the tests in another one 
 */

public class Account {

    private float balance;
    
    public float getBalance ()
    {
        return balance;
    }
    
    private float minimumBalance = 10.00F;
    
    public float getMinimumBalance ()
    {
        return minimumBalance;
    }

    public void Deposit(float amount)
    {
        balance += amount;
    }

    public void Withdraw(float amount)
    {
        balance -= amount;
    }

    public void TransferFunds(Account destination, float d) throws BankException
    {	
        if (balance - d < minimumBalance) throw new BankException();
        destination.Deposit(d);
        Withdraw(d);    
    }
 
}
