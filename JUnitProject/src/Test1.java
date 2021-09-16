import org.junit.jupiter.api.Test;

public class Test1 {

	public static void main(String[] args) {
		Savingsaccount sacc=new Savingsaccount(101,"Julie",10000);
		System.out.println(" "+sacc);
		sacc.withdraw(500);
		System.out.println(" "+sacc);
	}

}
class Savingsaccount{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "Savingsaccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	public Savingsaccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	@Test
	public void withdraw(double amt) {
		this.accountBalance=this.accountBalance-amt;
	}
	public void deposit(double amt) {
		this.accountBalance=this.accountBalance+amt;
	}
}