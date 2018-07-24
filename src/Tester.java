
public class Tester {

	public static void main(String[] args) {

		SavingAccount myAccount = new SavingAccount();
		
		System.out.println(myAccount.calculateInterest(1000));

		myAccount.deposit(1000);
		myAccount.withdraw(500);
		
		FixedDepositAccount fd = new FixedDepositAccount();
		System.out.println(fd.calculateInterest(1000));
		fd.deposit(500);
		fd.withdraw(7656);
	}

}
