
public class AccountHelperImpl implements AccountHelper {


	@Override
	public void deposit(double amount) {

		System.out.println("Amount deposited : " + amount);
	}

	@Override
	public void withdraw(double amount) {
		System.out.println("Amount withdrawn : " + amount);
	}

}
