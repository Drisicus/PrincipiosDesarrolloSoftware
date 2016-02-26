
package Bank;

public class BankException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BankException () {
	
	}
	public String toString(){
	 return "There are insufficient funds in the account";
	}
}
