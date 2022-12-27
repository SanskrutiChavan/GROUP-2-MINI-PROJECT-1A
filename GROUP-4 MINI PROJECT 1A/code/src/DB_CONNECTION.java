


import java.sql.*;

/**
 *

 */

public class DB_CONNECTION {
    static final String DB_URL="jdbc:mysql://localhost/lms";
    static final String USER="root";
    static final String PASS="Devanshk$1104";
    public static Connection connectDB(){
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            
            return conn;
        }
        catch(Exception ex)
        {
            System.out.println("There were errors while connecting to db");
        return null;
        
 }}}
 

