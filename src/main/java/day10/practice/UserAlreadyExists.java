package day10.practice;

import java.util.ArrayList;

class UserAlreadyExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}


class User {
	int id;
	String name;
	String emailId;
	
	public User(int id,String name,String emailId) {
		this.id=id;
		this.name=name;
		this.emailId=emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

class UserValidator {
	static ArrayList<User> arr = new ArrayList<User>();
	public static String userAlreadyvalidate(User user) throws UserAlreadyExistsException {
		if (arr.size() == 0) {
			arr.add(user);
			return "User added";
		}
		
		for(User element:arr) {
			if(element.emailId.equals(user.getEmailId())) {
				throw new UserAlreadyExistsException("User already added");
			}
			
		}
		arr.add(user);
		return "User added";
	}
}

public class UserAlreadyExists {
	public static void main(String[] args) {
		User user1=new User(1, "paramu", "paramu@gmail.com");
		User user2=new User(1, "paramu", "paramuap@gmail.com");
	String data1=UserValidator.userAlreadyvalidate(user1);
	String data2=UserValidator.userAlreadyvalidate(user2);
	System.out.println(data1);
	System.out.println(data2);
		
		
	}
}
