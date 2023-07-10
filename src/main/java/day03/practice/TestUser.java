package day03.practice;

class User {
    private String name;
    private String password;
    private String emailId;
    
    
    public User() {
        
    }
    
    
    public User(String name, String password, String emailId) {
        this.name = name;
        this.password = password;
        this.emailId = emailId;
    }
    
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmailId() {
        return emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}


public class TestUser {
   public static void main(String[] args) {
	
	   User user1 = new User();
	   user1.setName("Paramu");
	   user1.setPassword("paramu@2004");
	   user1.setEmailId("paramu@gmail.com");
	   
	   System.out.println(user1.getName() + "," + user1.getPassword() + ","
				+ user1.getEmailId());

	   User user2 = new User("Kavitha", "kavi@2005", "kavi@gmail.com");
	   System.out.println(user2.getName()+ "," + user2.getPassword() + ","
				+ user2.getEmailId());
	   
    }
 }
