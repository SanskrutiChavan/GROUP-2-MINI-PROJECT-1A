package miniproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
//import java.sql.*;
/**
 *
 * @author Umesh Pawar
 */
public class FeeadBackUser {
//     void  create_user(String userName, String userPassword, String userFirstName, String userLastName,String moodleid,String message) {
//        create_user(userName, userPassword, userFirstName, userLastName, moodleid, message);
//    }

    /**
     *
     * @param Fname
     * @param Lname
     * @param Contact
     * @param Emailid
     * @param Moodleid
     * @param Message
     */

     public void create_user(String Fname, String Lname, String Contact, String Emailid, String Moodleid, String Message) {
       
       try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsit_sa","root","Umesh@20"); 
             Statement st=con.createStatement();
             // Adding record
             String query="INSERT INTO `apsit_sa`.`feedback`"
                     + " (`FName`, `LName`, `ContactNo`, `Emailid`,`Moodleid`,`Message`)"
                     + "VALUES('"+Fname+"','"+Lname+"','"+Contact+"','"+Emailid+"','"+Moodleid+"','"+Message+"')";
              // record added.
            if(st.executeUpdate(query)>0){
                //JOptionPane.showMessageDialog(this, "username or password wrong");
                miniproject1 mp1 = new miniproject1();
                mp1.show();
                dispose();
                
                
             } 
              con.close();

           
    
         }
         catch(Exception e)
         {
             //System.out.println(e);
         }
         //////////////////////////////
    }
     
//      void  validate_user(String user_name,String user_password) {
//        try{
//            if (user_name != null && user_password != null) {
//            Class.forName("com.mysql.jdbc.Driver");  
//            Connection con=DriverManager.getConnection(  
//            "jdbc:mysql://localhost:3306/apsit_sa","root","Umesh@20");
//            String query = "Select * from feed Where userName='" + user_name + "' and userPassword='" + user_password + "'";
//            java.sql.PreparedStatement ps = con.prepareStatement(query);
//            java.sql.ResultSet resultSet = ps.executeQuery(query);
//            String un = "";
//            String pw = "";
//            String ufn = "";
//            String uln = "";
//            int uid = 0 ;
//            while (resultSet.next()) {
//                    un = resultSet.getString("userName");
//                    pw = resultSet.getString("userPassword");
//                    ufn = resultSet.getString("userFirstName");
//                    uln = resultSet.getString("userLastName");
//                    uid = Integer.parseInt(resultSet.getString("id"));
//             }
//
//
//            if (user_name.equals(un) && user_password.equals(pw)) {
//             //   JOptionPane.showMessageDialog(this, "Success");
//            GeneralDetails GD = new GeneralDetails();
//            GD.set_user_detail(uid, ufn, uln);
//             GD.show();
//             dispose();
//            } else {
//             //   JOptionPane.showMessageDialog(this, "Username or Password is incorrect");
//             LoginFailed LF = new LoginFailed();
//             LF.show ();
//             
//            }
//
//            con.close();  
//            }
//	}catch(Exception e){ System.out.println(e);} 
//	//////////////////////////////
//    }
    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     */
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
