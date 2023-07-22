package day10.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	public InvalidEmailException(String msg) {
		super(msg);
	}

	public InvalidEmailException(Throwable te) {
		super(te);
	}

	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}

class EmailValidator {
	
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {

		if (emailId == null) {
			throw new InvalidEmailException("Email cannot be null");
		}

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Boolean isMatch = Pattern.matches(regex, emailId);

		if (!isMatch) {
			throw new InvalidEmailException("Invalid Email Id");
		}

		System.out.println("Valid Email Id");

		return true;

		
	}
}
public class EmailInvalidDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your email"); 
	    String email=scan.nextLine();
	try {
		EmailValidator.isValidEmail(email);
		
	} catch (InvalidEmailException ex) {

		ex.printStackTrace();
	}
    }
}
