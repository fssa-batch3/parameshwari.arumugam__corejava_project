package day05.practice;

public interface  ATM {
	boolean deposit(Account1 account, double amount);
    boolean withdraw(Account1 account,double amount) throws Exception;
    double getBalance();
}
