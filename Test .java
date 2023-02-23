/*
JOYADDAR MD JOBAYER
1731833
*/
public class Test {

	public static void main(String[] args) {
		Account account = new Account();
		SavingsAccount saving = new SavingsAccount();
		CurrentAccount current =  new CurrentAccount();
		
		account.setAccNumber(785412);
		account.setAccPassword("NewPassword123");
		
		saving.setBalance(10000);
		saving.interestBalance(0.05);
		saving.accDetail();
		
		current.setBalance(5000);
		current.interestBalance(0.03);
		current.accDetail();
		
		System.out.println("Really it's tough");
		
	}

}
