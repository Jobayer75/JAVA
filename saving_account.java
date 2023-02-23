
public class SavingsAccount extends Account{
	public double accBalance;
	public double interestRate;
	
	public SavingsAccount() {
		
	}
	
	public void setBalance(double setBalance) {
		this.accBalance = setBalance;
	}
	
	public double getBalance() {
		return accBalance;
	}
	
	public double interestBalance(double interestRate) {
		double newBalance;
		newBalance = (accBalance - (accBalance * interestRate));
		return newBalance;
	}
	
	public double intPromoBalance(double interestRate, double promoRate) {
		double newBalance;
		newBalance = accBalance-(accBalance*interestRate)+(accBalance*promoRate);
		return newBalance;
	}
	
	public void accDetail () {
		System.out.println("Account Number : " + this.getAccNumber());
		System.out.println("Account Password : " + this.getAccPassword());
		System.out.println("Account Type : Savings");
		System.out.println("Account Balance : " + this.getBalance());
	}
}
