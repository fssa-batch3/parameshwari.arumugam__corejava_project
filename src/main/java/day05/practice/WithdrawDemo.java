package day05.practice;



public class WithdrawDemo {
  public static void main(String[] args) {
	  Account1 axisaccount = new Account1("123456789", 5000);
		ATM axisAtm = new AxisATM();
		try {
			axisAtm.withdraw(axisaccount, 1000);
			System.out.println(axisaccount.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// 2
		Account1 iciciATMaccount = new Account1("987654321", 10000);
		ATM iciciATM = new IciciATM();
		try {
			iciciATM.withdraw(iciciATMaccount, 2000);
			System.out.println(iciciATMaccount.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		axisAtm.deposit(axisaccount, 2000);
		System.out.println("AxisAtm balance" + axisaccount.getBalance());
		iciciATM.deposit(iciciATMaccount, 2000);
		System.out.println("IciciATM deposited " + iciciATMaccount.getBalance());
}
}
