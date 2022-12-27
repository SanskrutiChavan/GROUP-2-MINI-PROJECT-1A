import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Vedant
 */
public class DBconnection {
    void  Register(String Name , String username,String password, String email,  String phone, String age) {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/sports_club","root","Vedant@1033");
            Statement st=conn.createStatement();  
            // Adding record
            String query="INSERT INTO users(`Name`, `username`, `password`, `email`, `phone`,`age`) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,Name);
            ps.setString(2,username);
            ps.setString(3,password );
            ps.setString(4,email);
            ps.setString(5,phone);
            ps.setString(6,age);
           
            ps.execute();
            ps.close();
            conn.close();
            
            if(st.executeUpdate(query)>0){System.out.println("works properly");
            abcd d=new abcd();
            dispose();
            d.show();
            
            }
	}catch(Exception e)
        { System.out.println(e);} 
    
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    void enroll(String name,String username,String email,String gender,String sports,String membership){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/sports_club","root","Vedant@1033");
            Statement st=conn.createStatement();  
            // Adding record
            String query="INSERT INTO enroll(`name`, `username`, `email`, `gender`, `sports`,`membership`) values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,username);
            ps.setString(3,email);
            ps.setString(4,gender);
            ps.setString(5,sports);
            ps.setString(6,membership);
            
            ps.execute();
            ps.close();
            conn.close();
            
            if(st.executeUpdate(query)>0){
                System.out.println("Enrolled");
             }
	}catch(Exception e)
        { System.out.println(e);}
            }

    PreparedStatement prepareStatement(String q) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void events(String event,String date){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sports_club","root","Vedant@1033");
            Statement st=conn.createStatement();  
            // Adding record
            String query="INSERT INTO events(`event`, `date`) values (?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,event);
            ps.setString(2,date);
            ps.execute();
            ps.close();
            conn.close();
            
            if(st.executeUpdate(query)>0){
                System.out.println("events added");
             }
	}catch(Exception e)
        { System.out.println(e);}
            }
    void notices(String notice){
            try{
             Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection conn=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sports_club","root","Vedant@1033");
            Statement st=conn.createStatement();  
            // Adding record
            String query="INSERT INTO note(`notice`) values (?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,notice);
            ps.execute();
            ps.close();
            conn.close();
            
            if(st.executeUpdate(query)>0){
                System.out.println("Enrolled");
             }
	}catch(Exception e)
        { System.out.println(e);}
            }

    void notice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        }
        
    

    
    

    

