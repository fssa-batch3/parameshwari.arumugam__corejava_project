package day02.practice;



class User{
	
	private String id;
	private String name;
	private String password;
	private String emailid;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
	
}


public class UserDetails {
    public static void main(String[] args) {
    	
    	User user = new User();
    	user.setId("12345");
    	user.setName( "Paramu" );
    	user.setPassword("Paramu@2004");
    	user.setEmailid("paramu@gmail.com");
 
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getEmailid());
		
	}
}
