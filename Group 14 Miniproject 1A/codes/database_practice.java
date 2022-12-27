import java.sql.*;
public class database_practice {
    public static void main(String args[]) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/my_database";
        String rootname="root";
        String pass="ntms123#";
        String query="insert new_tap values(?,?)";
        int emp_no=18;
        String name="rahul";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,rootname,pass); 
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,emp_no);
        st.setString(2, name);
        //st.setString(2,"dombivli");
        int count =st.executeUpdate();
        ResultSet rs=st.executeQuery("select * from new_tap where emp_no=11");
        String userdata="";
        while(rs.next())
        {
            userdata=rs.getInt(1)+""+rs.getString(2);
            System.out.println(userdata);
        }

            
          st.close();
          con.close();
    } 
    
}
