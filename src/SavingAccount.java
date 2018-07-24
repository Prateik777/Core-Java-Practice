
public class SavingAccount implements Account {

	AccountHelper helper = new AccountHelperImpl();
	
	@Override
	public double calculateInterest(double amount) {
		return amount * 0.3;
	}

	@Override
	public void deposit(double amount) {
		helper.deposit(amount);				//code reuse via composition
	}

	@Override
	public void withdraw(double amount) {
		helper.withdraw(amount);			//code reuse via composition
	}

}
