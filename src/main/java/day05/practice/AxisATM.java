package day05.practice;

class AxisATM implements ATM {
	@Override
	public boolean deposit(Account1 account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		return true;
	}
	@Override
	public boolean withdraw(Account1 account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 5000) {
			throw new Exception("Your account balance is less than 5000 you should have mininmum balance to withdraw");
		}
		double amountwithdraw = amount + 5;
		if (account.balance >= amountwithdraw) {
			account.balance -= amountwithdraw;
			return true;
		} else {
			throw new Exception("Your account balance is less than 5000 you should have mininmum balance to withdraw");
		}
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}
}
