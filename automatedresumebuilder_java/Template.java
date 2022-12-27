/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Dalbir Singh
 */
public class Template {
      void  create_user_template1(String userFirstName, String userLastName, String userAddress, String userPhoneNo,String userDob, String userEmail, String userHobbies, String userSkills) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
            Statement st=con.createStatement();  
            // Adding record
            String query="INSERT INTO trnbill (`userFirstName`, `userLastName`, `userAddress`, `userPhoneNo`, `userDob`,`userEmail`,`userHobbies`,`userSkills`) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, userFirstName);
            ps.setString(2, userLastName);
            ps.setString(3, userAddress);
            ps.setString(4, userPhoneNo);
            ps.setString(5, userDob);
            ps.setString(6, userEmail);
            ps.setString(7, userHobbies);
            ps.setString(8, userSkills);
        
            ps.execute();
            ps.close();
            con.close();
	}catch(Exception e){ System.out.println(e);} 
     }
     }
    

