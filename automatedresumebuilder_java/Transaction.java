
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dalbir Singh
 */
public class Transaction {
    
    

    
          void  set_general_info(String id, String userFirstName, String userLastName, String userAddress, String userPhoneNo,String userDob, String userEmail, String userHobbies, String userSkills) {
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
            String query = "Select * from generalinfo Where userid='" + id + "'";
            PreparedStatement stmt=con.prepareStatement(query);  
            ResultSet rs=stmt.executeQuery();
            if (rs.next() == true) {
                
            // Insert Query
            String update_query="UPDATE generalinfo SET userFirstName = ?, userLastName = ?, userAddress = ?, userPhoneNo = ?, userDob = ?, userEmail = ?,userHobbies = ?, userSkills = ? WHERE userid = ? ";
            PreparedStatement ps = con.prepareStatement(update_query);
            ps.setString(1, userFirstName);
            ps.setString(2, userLastName);
            ps.setString(3, userAddress);
            ps.setString (4, userPhoneNo);
            ps.setString(5, userDob);
            ps.setString(6, userEmail);
            ps.setString(7, userHobbies);
            ps.setString(8, userSkills);
            ps.setInt(9, Integer.parseInt(id));
        
            ps.executeUpdate();
            ps.close();
                
            } else {
             
            // Adding geninfo record
            String insert_gen_query="INSERT INTO generalinfo (`userid`, `userFirstName`, `userLastName`, `userAddress`, `userPhoneNo`, `userDob`,`userEmail`,`userHobbies`,`userSkills`) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(insert_gen_query);
            
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, userFirstName);
            ps.setString(3, userLastName);
            ps.setString(4, userAddress);
            ps.setString(5, userPhoneNo);
            ps.setString(6, userDob);
            ps.setString(7, userEmail);
            ps.setString(8, userHobbies);
            ps.setString(9, userSkills);
        
            ps.execute();
            ps.close();
            
            // Create Edut Record with userid
            String insert_edu_query="INSERT INTO eduinfo (`userid`) values (?)";
            PreparedStatement pse = con.prepareStatement(insert_edu_query);
            pse.setInt(1, Integer.parseInt(id));
            pse.execute();
            pse.close();
            }


            con.close();
	}catch(Exception e){ System.out.println(e);} 
     }
          
    void get_general_detail(String id)
    {
       try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
            String query = "Select * from generalinfo Where userid='" + id + "'";
            java.sql.PreparedStatement ps = con.prepareStatement(query);
            java.sql.ResultSet resultSet = ps.executeQuery(query);
            
            String _userid = "" ;
            String _userFirstName = "" ;
            String _userLastName = "" ;
            String _userAddress = "";
            String _userPhoneNo = "";
            String _userDob = "";
            String _userEmail = "";
            String _userHobbies = "";
            String _userSkills = "";
            

            while (resultSet.next()) {
                    _userid = resultSet.getString("userid");
                    _userFirstName = resultSet.getString("userFirstName");
                    _userLastName = resultSet.getString("userLastName");
                    _userAddress = resultSet.getString("userAddress");
                    _userPhoneNo = resultSet.getString("userPhoneNo");
                    _userDob = resultSet.getString("userDob");
                    _userEmail = resultSet.getString("userEmail");
                    _userHobbies = resultSet.getString("userHobbies");
                    _userSkills = resultSet.getString("userSkills");
             }
           con.close();
          
	}catch(Exception e){ System.out.println(e);} 
        
    }
    
    void  set_edu_school_info(String id, String userSscBoard, String userSscSchool, String userSscYear, String userSscPercentage,String userHscBoard, String userHscCollege, String userHscYear, String userHscStream, String userHscPercentage) {
        
        System.out.println(id);
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
              
            // Update record
            String update_query="UPDATE eduinfo SET userSscBoard = ?, userSscSchool = ?, userSscYear = ?, userSscPercentage = ?, userHscBoard = ?, userHscCollege = ?,userHscYear = ?, userHscStream = ?, userHscPercentage = ? WHERE userid = ? ";
            PreparedStatement ps = con.prepareStatement(update_query);
            ps.setString(1, userSscBoard);
            ps.setString(2, userSscSchool);
            ps.setString(3, userSscYear);
            ps.setString(4, userSscPercentage);
            ps.setString(5, userHscBoard);
            ps.setString(6, userHscCollege);
            ps.setString(7, userHscYear);
            ps.setString(8, userHscStream);
            ps.setString(9, userHscPercentage);
            ps.setInt(10, Integer.parseInt(id));
        
            ps.executeUpdate();
            ps.close();
                
            con.close();
	}catch(Exception e){ System.out.println(e);} 
     }
    
        void  set_edu_university_info(String id, String userUniversityDegreeName, String userUniversityBranch, String userUniversityBatchYear, String userUniversityCollegeName,String userUniversitySem1, String userUniversitySem2, String userUniversitySem3, String userUniversitySem4, String userUniversitySem5, String userUniversitySem6, String userUniversitySem7, String userUniversitySem8) {
        
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
              
            // Update record
            String update_query="UPDATE eduinfo SET userUniversityDegreeName = ?, userUniversityBranch = ?, userUniversityBatchYear = ?, userUniversityCollegeName = ?, userUniversitySem1 = ?, userUniversitySem2 = ?,userUniversitySem3 = ?, userUniversitySem4 = ?, userUniversitySem5 = ?, userUniversitySem6 = ?, userUniversitySem7 = ?, userUniversitySem8 = ? WHERE userid = ? ";
            PreparedStatement ps = con.prepareStatement(update_query);
            ps.setString(1, userUniversityDegreeName);
            ps.setString(2, userUniversityBranch);
            ps.setString(3, userUniversityBatchYear);
            ps.setString(4, userUniversityCollegeName);
            ps.setString(5, userUniversitySem1);
            ps.setString(6, userUniversitySem2);
            ps.setString(7, userUniversitySem3);
            ps.setString(8, userUniversitySem4);
            ps.setString(9, userUniversitySem5);
            ps.setString(10, userUniversitySem6);
            ps.setString(11, userUniversitySem7);
            ps.setString(12, userUniversitySem8);
            ps.setInt(13, Integer.parseInt(id));
        
            ps.executeUpdate();
            ps.close();
                
            con.close();
	}catch(Exception e){ System.out.println(e);} 
     }
        
        void  set_edu_intern_info(String id, String userProjectTitle, String userProjectDescription, String userProjectTechHandled, String userInternDone,String userInternDuration) {
        
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
              
            // Update record
            String update_query="UPDATE eduinfo SET userProjectTitle = ?, userProjectDescription = ?, userProjectTechHandled = ?, userInternDone = ?, userInternDuration = ? WHERE userid = ? ";
            PreparedStatement ps = con.prepareStatement(update_query);
            ps.setString(1, userProjectTitle);
            ps.setString(2, userProjectDescription);
            ps.setString(3, userProjectTechHandled);
            ps.setString(4, userInternDone);
            ps.setString(5, userInternDuration);
            ps.setInt(6, Integer.parseInt(id));
        
            ps.executeUpdate();
            ps.close();
                
            con.close();
	}catch(Exception e){ System.out.println(e);} 
     }
        
     void  set_edu_experience_info(String id, String userExperienceLanguagesKnown, String userExperienceCertificate ,String userCertificateUrl,String userCertificateBatch) {
        
        try{  
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/resume","root","Dalbir@P3517");
              
            // Update record
            String update_query="UPDATE eduinfo SET userExperienceLanguagesKnown = ?, userExperienceCertificate = ?, userCertificateUrl = ?, userCertificateBatch = ? WHERE userid = ? ";
            PreparedStatement ps = con.prepareStatement(update_query);
            ps.setString(1, userExperienceLanguagesKnown);
            ps.setString(2, userExperienceCertificate);
            ps.setString(3, userCertificateUrl);
            ps.setString(4, userCertificateBatch);
            ps.setInt(5, Integer.parseInt(id));
     
        
            ps.executeUpdate();
            ps.close();
                
            con.close();
	}catch(Exception e){ System.out.println(e);} 
     }
     
     
     
     
     
     
    
    
    
    
}
