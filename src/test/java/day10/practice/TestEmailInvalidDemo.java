package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmailInvalidDemo {
  
	@Test
	public void testValidEmailException() { 
		
		try {
			Assertions.assertTrue(EmailValidator.isValidEmail("Paramu@gmail.com"));
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	@Test
	public void testInvalidNullInput() {
		
		try {
			EmailValidator.isValidEmail(null);
			Assertions.fail("Test Invalid Null Email Method Input is Failed");
		}catch(InvalidEmailException ex) {
			Assertions.assertEquals("Email cannot be null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidEmailAddress() {
		
		try {
			EmailValidator.isValidEmail("Paramugmail.com");
			Assertions.fail("Test Invalid Email Address Id is Failed");
		}catch(InvalidEmailException ex) {
			Assertions.assertEquals("Invalid Email Id", ex.getMessage());
		}
		
	}

}
