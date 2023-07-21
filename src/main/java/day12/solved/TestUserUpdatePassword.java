package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;

public class TestUserUpdatePassword {
	public static void main(String[] args) throws Exception {
		 
        Connection connection = ConnectionUtil.getConnection();
 
        // Input
        String userName = "<paramu>";
        String password = "<123456>";
        
       
        // DEPOSIT
        String query = "UPDATE students SET password=? WHERE student_name=?";
 
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setString(1, password);
        pst.setString(2, userName);
 
        int rows = pst.executeUpdate();
        System.out.println("No of rows updated" + rows);
    }
}
