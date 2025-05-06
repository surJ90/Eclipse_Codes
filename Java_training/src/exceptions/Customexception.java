package exceptions;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class BankAcc {
	private double balance;
	
	public BankAcc(double balance) {
		this.balance = balance;
	}
	
	public void withdra(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance: " + balance);
		}
		balance -= amount;
		System.out.println("Withdraw sucessful. Balance: " + balance);
	}
}
public class Customexception {

	public static void main(String[] args) {
		BankAcc account = new BankAcc(10000);
		try {
			account.withdra(15000);
		} catch (InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
