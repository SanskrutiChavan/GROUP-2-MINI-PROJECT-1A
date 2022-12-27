import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class backend {
    
    Connection con;
    PreparedStatement pst,pst1;
    Statement st;
    ResultSet rs,rs1;
    int q;
    String [] str={"'MOBILE'","'FASHION'","'ELECTRONICS'","'BOOKS'","'KITCHEN'"};
    String query;
    int lv;
    String product_desc,product_name,product_image;
    int product_price,pincode,customer_id;
    String name,add,temp_add,temp_card;
    int ref_customer_id,payment_option;
    void getconnection() throws Exception
    {
        
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:sqlserver://sumitsqlserver1.database.windows.net:1433;database=my_database;user=sqladmin@sumitsqlserver1;password=ntMs123#;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30; "); 
         //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database","root","ntms123#"); 
         st=con.createStatement();


       
         //rs=st.executeQuery(query);
         //rs.next(); 
        /* while(rs.next())
         {
             String data=rs.getString("product_image");
             System.out.println(data);
         }*/
    }
    int get_customer_id ()throws Exception
    {
      getconnection();
       get_query("select customer_id from login_status");
       while(rs.next())
       {
          customer_id=rs.getInt(1);
       }
       return customer_id;
    }
    int get_customer_id1 ()throws Exception
    {
      getconnection();
       get_query("select customer_id from customer_details");
       while(rs.next())
       {
          customer_id=rs.getInt(1);
       }
       return customer_id;
    }
    String get_customer_details() throws Exception
    {
        this.getconnection();
        get_query("select customer_name from customer_details where customer_id="+this.get_customer_id()+"");
        rs.next();
        return rs.getString('1');
    }
    int get_login_status() throws Exception
    {
        getconnection();
       get_query("select login_value from login_status");
       while(rs.next())
       {
          customer_id=rs.getInt(1);
       }
       return customer_id;
    }
    int get_order_no() throws Exception
    {
      getconnection();
       get_query("select order_no from order_table");
       while(rs.next())
       {
          customer_id=rs.getInt(1);
       }
       return customer_id;   
    }
    void get_order_details() throws Exception
    {
        
        int id=this.get_order_no();
        System.out.println(id);
        getconnection();
        insert_query("select * from order_table where order_no=?");
        pst.setInt(1, id);
        rs=pst.executeQuery();
        rs.next();
        product_name=rs.getString(2);
        product_price=rs.getInt(7);
        temp_add=rs.getString(5);
        payment_option=rs.getInt(8);
        
        
       
    }
    void set_query(String query)
    {
        query="select * from product_details where product_category="+str[q];
    }
    void get_query(String query) throws Exception
    {
         //this.set_query();
         System.out.println(q);
         rs=st.executeQuery(query);
    }
    int  fetch_query() throws Exception
    {
        getconnection();
        query="select login_value from login_status ";
        rs1=st.executeQuery(query);
        
       while (rs1.next())
       {
           lv=rs1.getInt(1);
           // return lv;
      }
      // rs.close();
       //st.close();
       
       return lv;
    }
   void  insert_query(String query1) throws Exception
    {
       pst = con.prepareStatement(query1);
 
    }
     void update_login_status(int x) throws Exception
   {
        query="insert into login_status values(?,?)";
        getconnection();
        pst1 = con.prepareStatement(query);
        pst1.setInt(1,x);
        get_customerdetails();
        System.out.println("red"+ref_customer_id);
        pst1.setInt(2,this.ref_customer_id);
        pst1.executeUpdate();
        pst1.close();
     
   }
      void get_productdetails(String str) throws Exception
    {
       getconnection();
       insert_query("select * from product_details where product_name=?");
       pst.setString(1,str);
       rs=pst.executeQuery();
       rs.next();
       product_name=rs.getString(1);
       product_price=rs.getInt(4);
       product_desc=rs.getString(3);
       product_image=rs.getString(2);
    }
      void get_customerdetails() throws Exception
      {
       getconnection();
       get_query("select * from customer_details");
       rs.next();
       customer_id=rs.getInt(1);
       name=rs.getString(2);
       pincode=rs.getInt(5);
       
      }
     // void take_order(int customer_id) throws Exception
      //{
         // getconnection();
        //  insert_query("insert into order_table values(?,?,?,?)");
        //  pst.setString(1,"");
        //  pst.setInt(2, 3);
        //  get_customerdetails();
        //  pst.setInt(3,customer_id);
        //  pst.setString(4,"");
      //}
}


class details
{
    int n=5,i;
    int x,y,j,k;
    JLabel tmob;
    details()
    {
       JLabel []tmob=new JLabel[20];
    }
    void load_data()
    {
        for(i=0;i<5;i++)
        {
            
        }
    }
    void display( )
    {
       
        for(i=0;i<n;i++)
        {
                     
        }
      
    }
    
    
}