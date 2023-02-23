/*
JOYADDAR MD JOBAYER

*/
public class Account {
	public float accNumber;
	public String accPassword;
	
	public Account() {
		
	}
	
	public void display() {
		System.out.println("Account Number : " + accNumber);
		System.out.println("Account Password : " + accPassword);
	}
	
	public double getAccNumber() {
		return accNumber;
	}
	
	public void setAccNumber(float newAccNumber) {
		this.accNumber = newAccNumber;
	}
	
	public String getAccPassword() {
		return accPassword;
	}
	
	public void setAccPassword(String newAccPassword) {
		this.accPassword = newAccPassword;
	}
	
}
