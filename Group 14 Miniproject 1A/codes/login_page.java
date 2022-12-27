import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
class login_page //extends JFrame
{
    JPanel blue_panel,white_panel;
    JPanel [] bw_panel=new JPanel[]{blue_panel,white_panel};
    int i,x,y,j,k;
    backend obj;
    
   // labels for login
    JLabel log_label,entry_label,pass_label,new_b;
    JLabel [] w_label=new JLabel[]{entry_label,pass_label};
    String []w_value={"Enter Email/Mobile number","Enter Password"};
    //textpane textfield
    JTextPane ref_line,entry_pane;
    JPasswordField pass_field,confirm_pass;
    //LOGIN butoon
    JButton log_b,cont,log_back,next,finish;
    //user details
    String [] ref_value={"Name","Email","State","City","Pincode","Address"};
    JTextField user_name,city,pincode,add,email,state;
    JTextField [] dt=new JTextField[]{user_name,email,state,city,pincode,add};
    JLabel ref_label;
    login_page lgobj;
    JComboBox state_box,city_box;
     String str,name_,email_,mob_,pass_,state_,city_,add_;
     int pin_,login_status;
      int customer_id;
     front_page1 dis;
    login_page()
            {
                 //lgobj=new login_page();
            }
    
    login_page(JPanel main_login)
    {
        main_login.removeAll();
        //main_login.invalidate();
        main_login.setLayout(null);
        main_login.revalidate();
       // lgobj=new login_page();
        // log_label=new JLabel("Login");
         
       
        
       
    }
  void login_panel(JPanel main_login)
  {
      //main_panel.setLayout(null);
      x=200;y=20;j=400;k=600;
      for(i=0;i<2;i++)
      {
          bw_panel[i]=new JPanel();
      bw_panel[i].setBounds(x,y,j,k);
      bw_panel[i].setLayout(null);
      main_login.add( bw_panel[i]);
      x=595;j=j+350;
      }
       bw_panel[0].setBackground(new Color(40, 116, 240));
        bw_panel[1].setBackground(Color.white);   
  }
  void login_labels()
  {
      log_label=new JLabel("Login");
      log_label.setBounds(100,20,200,100);
      log_label.setFont(new Font("Segoe UI", 1, 40));
      log_label.setForeground(Color.white);
      bw_panel[0].add(log_label);
      //white field
       x=200;y=20;j=400;k=50;
      for(i=0;i<2;i++)
      {
          w_label[i]=new JLabel(w_value[i]);
          w_label[i].setBounds(x,y,j,k);
          w_label[i].setFont(new Font("Segoe UI", 0, 16));
          w_label[i].setForeground(Color.black);
          bw_panel[1].add( w_label[i]);
          y=y+80;
          k=k+50;
      } 
  }
  void pass_()
  {
      pass_field=new JPasswordField();
         pass_field.setBounds(200,180,300,30);
         pass_field.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
         // pass_field.setBackground(new Color(40, 116, 240));
          bw_panel[1].add(pass_field);
  }
   void login_fields()
           
      {
         
          
          entry_pane=new JTextPane();
          entry_pane.setBounds(200,105,300,2);
          entry_pane.setBackground(new Color(40, 116, 240));
          bw_panel[1].add(entry_pane);
          entry_pane=new JTextPane();
          entry_pane.setBounds(200,75,300,30);
          //entry_pane.setBackground(new Color(40, 116, 240));
          bw_panel[1].add(entry_pane);
          
          //password
          
          pass_field=new JPasswordField();
         pass_field.setBounds(200,215,300,1);
          pass_field.setBackground(new Color(40, 116, 240));
          bw_panel[1].add(pass_field);
          
           pass_field=new JPasswordField();
         pass_field.setBounds(200,180,300,30);
         pass_field.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
         // pass_field.setBackground(new Color(40, 116, 240));
          bw_panel[1].add(pass_field);
          
          log_b=new JButton("Login");
          log_b.setBounds(200,300,300,45);
          log_b.setBackground(new Color(251, 100, 27));
         log_b.setFont(new Font("Segoe UI", 1, 25));
           log_b.setForeground(Color.white);
           log_b.setName("log");
          bw_panel[1].add( log_b);
          
           new_b=new JLabel("New to OnlineShopping? Create an account");
         new_b.setBounds(200,525,350,45);
         new_b.setFont(new Font("Segoe UI", 1, 16));
          new_b.setForeground(new Color(40, 116, 240));
          bw_panel[1].add( new_b);
          
        log_b.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent b1)
            {
                try {
                    boolean val=fetch_login_data();
                    if (val==true)
                    {
                        
                        obj.update_login_status(1);
                        front_page.main(w_value);
                        dis.dispose(); 
                        dis.login_val=true;
                        
                    }
                        
                } catch (Exception ex) {
                    Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        );
      }
     void new_login(JPanel main_login)
     {
         
         //modifications
         log_label.setText("<html>Looks like<br/>you're new here!</html>");
         log_label.setFont(new Font("Segoe UI", 1, 28));
         w_label[0].setText("Enter Mobile number");
         bw_panel[1].remove(pass_field);bw_panel[1].remove(w_label[1]);
         
         String newVal="Existing User? Log in";
         log_b.setActionCommand(newVal);
         log_b.setText(newVal);
         log_b.setFont(new Font("Segoe UI", 1, 22));
         log_b.setForeground(new Color(40, 116, 240));
         log_b.setBackground(Color.white);
           
        
         
         //continue
         cont=new JButton("Continue");
          cont.setBounds(200,220,300,45);
          cont.setBackground(new Color(251, 100, 27));
         cont.setFont(new Font("Segoe UI", 1, 25));
           cont.setForeground(Color.white);
          bw_panel[1].add( cont);
          
          
              log_b.addActionListener(new ActionListener ()
            {
             public void actionPerformed(ActionEvent e)
      
                 {     
                      main_login.removeAll();
                     lgobj=new login_page();
                     //login_page lgobj2=new login_page();
                     lgobj.login_panel(main_login);
                     lgobj.login_labels();
                     lgobj.login_fields();
                     lgobj.login_action(main_login);
                     main_login.revalidate();
                     //lgobj2.new_login();
                    
                  }
           });
              cont.addActionListener(new ActionListener ()
            {
             public void actionPerformed(ActionEvent e)
      
                 {     
                  
                     boolean val=verify_mob();
                     if (val==true)
                     {
                         main_login.removeAll();
                    
                     //lgobj=new login_page();
                     login_panel(main_login);
                     user_details(main_login);
                     //lgobj.login_action(main_login);
                     main_login.revalidate();
                     //lgobj2.new_login();
                     }
                    
                  }
           });
           
     }
    
        void login_action(JPanel main_login)
             
     { 
         new_b.addMouseListener(new MouseAdapter()
         {
             public void mousePressed(MouseEvent e1)
      
             {      // lgobj=new login_page();
                   
                         main_login.removeAll();
                     //lgobj=new login_page();
                     //login_page lgobj2=new login_page()  
                     login_panel(main_login);
                     login_labels();
                     login_fields();
                     new_login(main_login);
                     login_action(main_login);
                     main_login.revalidate();
                     
                     
                            
              }
         });
          
          
        
         
     }     
     
    void user_details(JPanel main_login)
    {
        String [] state_name={"","Maharashtra","Gujraat","Tamilnadu"};
        String [][] city_name={{""},{"Mumbai","Thane","Navi Mumbai"},{"Wadodra","Gaandhimagar"},{"chennai"}};
        x=200;y=75;j=300;k=30;
        for(i=0;i<6;i++)
      {
          if (i==2)
          {
              
           state_box= new JComboBox(state_name);
           state_box.setBounds(x,y,j,k);
           bw_panel[1].add(state_box);
          }
       
      
          ref_label=new JLabel(ref_value[i]);
          ref_label.setBounds(x,y-30,j,k);
          ref_label.setFont(new Font("Segoe UI", 0, 16));
          ref_label.setForeground(Color.black);
          bw_panel[1].add( ref_label);
          
          dt[i]=new JTextField(20);
          dt[i].setBounds(x,y,j,k);
          //dt[i].setBackground(new Color(40, 116, 240));
          bw_panel[1].add(dt[i]);
          //
          /*ref_line=new JTextPane();
          ref_line.setBounds(x,y+30,j,2);
          ref_line.setBackground(new Color(40, 116, 240));
          bw_panel[1].add(ref_line);*/
          
          
          y=y+80;
          //k=k+50;
      } 
         state_box.addItemListener(new ItemListener ()
          {
              int check=0;
              
              public void itemStateChanged(ItemEvent e)
              {
                 //city_box= new JComboBox(city_name[0]);
              
                  if (state_box.getSelectedIndex()==0)
                  {
                      if (check>0)
                      {
                          bw_panel[1].remove(city_box);
                      }
                      check++;
                       city_box= new JComboBox(city_name[0]);
                       city_box.setBounds(x,y-240,j,k);
                       
                  }
                  if (state_box.getSelectedIndex()==1)
                  {
                      if (check>0)
                      {
                          bw_panel[1].remove(city_box);
                      }
                      check++;
                      city_box= new JComboBox(city_name[1]);
                      city_box.setBounds(x,y-240,j,k);
                   

                  }
                      //city_box.setBounds(x,y,j,k);
                       bw_panel[1].add(city_box);
                       dt[3].setVisible(false);
                       
              }
              
          });
          next=new JButton("Next");
          next.setBounds(x+50,y-30,j-100,k);
          next.setBackground(Color.white);
         next.setFont(new Font("Segoe UI", 1, 14));
           next.setForeground(new Color(40, 116, 240));
          bw_panel[1].add( next);
          next.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent ae)
              { 
                  boolean val=verify_name();
                  if (val==true)
                  {
                  get_data();
                  main_login.removeAll();
                  login_panel(main_login); 
                  enter_pass();
                  bw_panel[1].revalidate();
                  }
                  
              }
          }
          );
    }
    void enter_pass()
    {
        x=200;y=30;j=300;k=30;
        String [] ref_value={"Create Password","Confirm Password"};
         pass_field=new JPasswordField();
         pass_field.setBounds(200,75,300,45);
          bw_panel[1].add(pass_field);
          
          confirm_pass=new JPasswordField();
         confirm_pass.setBounds(200,180,300,45);
          bw_panel[1].add(confirm_pass);
          for (i=0;i<2;i++)
          {
          ref_label=new JLabel(ref_value[i]);
          ref_label.setBounds(x,y,j,k);
          ref_label.setFont(new Font("Segoe UI", 0, 16));
          ref_label.setForeground(Color.black);
          bw_panel[1].add( ref_label);
          y=y+100;
          }
          finish=new JButton("Finish");
          finish.setBounds(200,270,300,45);
          finish.setBackground(new Color(251, 100, 27));
         finish.setFont(new Font("Segoe UI", 1, 25));
           finish.setForeground(Color.white);
          bw_panel[1].add( finish);
          finish.addActionListener(new ActionListener()
                  {
                      public void actionPerformed(ActionEvent ae3)
                      {
                          if (verify_pass()==compare_pass())
                          {
                              System.out.println("success");
                              try {
                           
                                  UpdateCustomer();
                                  UpdateSecurity();
                                  obj.ref_customer_id=obj.get_customer_id1();
                                  obj.update_login_status(1);
                                  front_page.main(w_value);
                                  dis.dispose();
                              } catch (Exception ex) {
                                  Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                              }
                          }
                  
                      }
                  }
                  );
    }
    boolean verify_mob()
    {
       
       try{ 
         str =entry_pane.getText();
         long mob_no=Long.parseLong(str);
         if (str.length()==10)
         {
             System.out.println(mob_no);
             return true;
         }
         else
         {
             JOptionPane.showMessageDialog(bw_panel[1],"This field shoud contain exact 10 digits","Alert",JOptionPane.WARNING_MESSAGE);
             return false;
         }
        
       }
       catch(NumberFormatException ex){
           if(str.length()==0){
          
            JOptionPane.showMessageDialog(bw_panel[1],"This field is mandatory","Alert",JOptionPane.WARNING_MESSAGE);
            return false;
           }
             JOptionPane.showMessageDialog(bw_panel[1],"Only numbers are allowed","Alert",JOptionPane.WARNING_MESSAGE);
       }
       return false;
       
    }
    boolean  verify_name()
    {
      
        
            try{
            str=dt[0].getText();
            int f=Integer.parseInt(str);
            if (String.valueOf(f).length()>=1)
            {
                JOptionPane.showMessageDialog(bw_panel[1], "This field shoud start with alphabet", "Alert", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else
                return true;
            }
           catch(NumberFormatException ex){
               try{
                    if(str.length()==0){
          
            JOptionPane.showMessageDialog(bw_panel[1],"This field is mandatory","Alert",JOptionPane.WARNING_MESSAGE);
            return false;
           }
             int f=Integer.parseInt(String.valueOf(str.charAt(0)));
           JOptionPane.showMessageDialog(bw_panel[1], "This field shoud start with alphabet", "Alert", JOptionPane.WARNING_MESSAGE);

               }
               catch(NumberFormatException ex1)
               {
                   return true;
               }
           }
             return false;
    }
   boolean  verify_pass()
   {
       str="";
       int count=0;
      for(i=0;i<pass_field.getPassword().length;i++)
      {
          if (Character.isWhitespace(pass_field.getPassword()[i]))
          {
          JOptionPane.showMessageDialog(bw_panel[1], "WhiteSpace is not allowed", "Alert", JOptionPane.WARNING_MESSAGE);
           return false;
          }
          str=str+String.valueOf(pass_field.getPassword()[i]);
          if (!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i)))
          {
              count++;
          }
      }
 
     if (str.length()>6)
     {
          if(count>0)
        {
         if(count<2)
         {
            JOptionPane.showMessageDialog(bw_panel[1], "Please choose strong password", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
         }
       }
        else
        {
          JOptionPane.showMessageDialog(bw_panel[1], "Use special characters for strong password", "Alert", JOptionPane.WARNING_MESSAGE);
          return false;
        }
     }
     else
     {
        JOptionPane.showMessageDialog(bw_panel[1], "Password length is too small", "Alert", JOptionPane.WARNING_MESSAGE);
        return false;
     }
     System.out.println(str);
    return true;
   }
   boolean compare_pass()
   {
       String confirm="";
       for (i=0;i<confirm_pass.getPassword().length;i++)
       {
           confirm=confirm+String.valueOf(confirm_pass.getPassword()[i]);
       }
       System.out.println(str+""+confirm);
       if(str.equals(confirm))
       {
           return true;
       }
            else
        {
          JOptionPane.showMessageDialog(bw_panel[1], "Password does not match", "Alert", JOptionPane.WARNING_MESSAGE);
          return false;
        }
  
   }
   void   UpdateCustomer() throws Exception
   {
       String insert="insert into customer_details values(?,?,?,?,?,?)";
       obj=new backend();
       obj.getconnection();
       obj.insert_query(insert);
       obj.pst.setString(1,name_);
       obj.pst.setString(2,state_);
       obj.pst.setString(3,city_);
       obj.pst.setInt(4,pin_);
       obj.pst.setString(5,add_);
       obj.pst.setString(6,"hobby");
       obj.pst.executeUpdate();
       obj.pst.close();
       
   }
   void UpdateSecurity() throws Exception
   {
       String insert="insert into account_details values(?,?,?,?)";
       obj.getconnection();
       obj.insert_query(insert);
       obj.pst.setString(1,email_);
       obj.pst.setLong(2, Long.parseLong(entry_pane.getText()));
       obj.pst.setString(3,String.valueOf(pass_field.getPassword()));
       obj.pst.setInt(4,obj.get_customer_id1());
       System.out.println("chh"+obj.get_customer_id1());
       obj.pst.executeUpdate();
       obj.pst.close();
   }
   void get_data()
   {
        name_=dt[0].getText();
        email_=dt[1].getText();
       //pass_=String.valueOf(pass_field.getPassword());
       state_=String.valueOf(state_box.getSelectedItem());
       city_=String.valueOf(city_box.getSelectedItem());
       pin_=Integer.parseInt(dt[4].getText());
       add_=dt[5].getText();
   }
   boolean fetch_login_data() throws Exception
   {
       int n=entry_pane.getText().length();
       char[] temp=new char[n];
       for(i=0;i<entry_pane.getText().length();i++)
       {
           temp[i]=entry_pane.getText().charAt(i);
       }
       System.out.println(temp);
       obj=new backend();
        obj.getconnection();
        String fetch="select * from account_details where email_id='"+String.valueOf(temp)+"'";
        obj.rs=obj.st.executeQuery(fetch);
        obj.rs.next();
        obj.ref_customer_id=obj.rs.getInt(5);
        System.out.println("ref id"+obj.ref_customer_id);
        if(obj.rs.getString(3).equals(String.valueOf(pass_field.getPassword())))
        return true;
        else
        {
         JOptionPane.showMessageDialog(bw_panel[1], "Icorrect username or password", "Alert", JOptionPane.WARNING_MESSAGE);
         return false;
        }
        
   }
 
    void dispose_fun(front_page1 obj1)
   {
        dis=obj1;
   }
}