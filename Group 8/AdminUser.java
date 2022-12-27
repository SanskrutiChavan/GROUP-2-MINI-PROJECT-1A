/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Umesh Pawar
 */
public class AdminUser {
    
     public void admincreate_user(String ID,String UserName, String PassWord) {
                   

       try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsit_sa","root","Umesh@20"); 
             Statement st=con.createStatement();
             // Adding record
             String query="INSERT INTO `apsit_sa`.`adminlogin`"
                     + " (`UserID`, `UserName`, `PassWord`)"
                     + "VALUES(?,?,?)";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, ID);
            ps.setString(2, UserName);
            ps.setString(3, PassWord);
            ps.execute();
            ps.close();
            System.out.println("works properly");
              // record added.
            if(st.executeUpdate(query)>0){
                                
                AdminWelcome mp1 = new AdminWelcome();
                mp1.show();
                dispose();
                
                
             } 
              con.close();

           
    
         }
         catch(Exception e)
         {
             //System.out.println(e);
         }
     
}
     
     
     public void admin_eventinfo(String Event1Date,String Event1Name,String Event2Date,String Event2Name,String Event3Date,String Event3Name,String Event4Date,String Event4Name ){
         
         try{
              Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apsit_sa","root","Umesh@20"); 
             Statement st=con.createStatement();
             // Adding record
             String query="INSERT INTO `apsit_sa`.`event_info`"
                     + " (`Event1Date`, `Event1Name`,`Event2Date`, `Event2Name`,`Event3Date`, `Event3Name`,`Event4Date`, `Event4Name`)"
                     + "VALUES(?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            
            ps.setString(1, Event1Date);
            ps.setString(2, Event1Name);
            ps.setString(3, Event2Date);
            ps.setString(4, Event2Name);
            ps.setString(5, Event3Date);
            ps.setString(6, Event3Name);
            ps.setString(7, Event4Date);
            ps.setString(8, Event4Name);
            
            ps.execute();
            ps.close();
            System.out.println("works properly");
              // record added.
            if(st.executeUpdate(query)>0){
                                
                AdminWelcome mp1 = new AdminWelcome();
                mp1.show();
                dispose();
                
                
             } 
              con.close();

           
    
         }
         catch(Exception e)
         {
             //System.out.println(e);
         }
}
    
    /**
     *
     */
          



    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
