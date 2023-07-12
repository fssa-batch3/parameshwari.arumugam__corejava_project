package day05.practice;

public class IciciATM implements ATM {
	@Override
	public boolean deposit(Account1 account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		return true;
	}
	@Override
	public boolean withdraw(Account1 account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 10000) {
			throw new Exception("Your account balance is less than 10000 you should have mininmum balance to withdraw");
		}
		double amountwithdraw = amount + 10;
		if (account.balance >= amountwithdraw) {
			account.balance -= amountwithdraw;
			return true;
		} else {
			throw new Exception("Your account balance is less than 10000 you should have mininmum balance to withdraw");
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}
}
