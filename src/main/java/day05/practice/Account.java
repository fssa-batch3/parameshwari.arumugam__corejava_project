package day05.practice;

//Change the below class to have setters and Getters and Constructors

class Account1 {
	String accNo;
	double balance;
	
	
	// Default Constructor
		public Account1() {

		}
		
	public Account1(String accNo, double balance) {
		    this.accNo = accNo;
			this.balance = balance;
		}

		
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
