/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Dalbir Singh
 */
public class ResumeUser {
    
   
    void  create_user(String userName,String userPassword,String userFirstName, String userLastName) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
            Statement st=con.createStatement();  
            // Adding record 
            String query="INSERT INTO `resume`.`user`"
             + " (`userName`, `userPassword`, `userFirstName`, `userLastName`)"
             + "VALUES('"+userName+"','"+userPassword+"','"+userFirstName+"','"+userLastName+"')";
            st.executeUpdate(query); // record added. 

            con.close();  
	}catch(Exception e){ System.out.println(e);} 
	//////////////////////////////
    }
    
    void  validate_user(String user_name,String user_password) {
        try{
            if (user_name != null && user_password != null) {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
            String query = "Select * from user Where userName='" + user_name + "' and userPassword='" + user_password + "'";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            java.sql.ResultSet resultSet = ps.executeQuery(query);
            String un = "";
            String pw = "";
            String ufn = "";
            String uln = "";
            String uid = "" ;
            while (resultSet.next()) {
                    un = resultSet.getString("userName");
                    pw = resultSet.getString("userPassword");
                    ufn = resultSet.getString("userFirstName");
                    uln = resultSet.getString("userLastName");
                    uid = resultSet.getString("id");
             }


            if (user_name.equals(un) && user_password.equals(pw)) {
             //   JOptionPane.showMessageDialog(this, "Success");
            GeneralDetails GD = new GeneralDetails();
            GD.get_general_detail(uid);
            
             GD.show();
             dispose();
            } else {
             //   JOptionPane.showMessageDialog(this, "Username or Password is incorrect");
             LoginFailed LF = new LoginFailed();
             LF.show ();
             
            }

            con.close();  
            }
	}catch(Exception e){ System.out.println(e);} 
	//////////////////////////////
    }
    
    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
