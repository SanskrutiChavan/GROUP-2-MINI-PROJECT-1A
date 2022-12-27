
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class user_account
{
    front_page1 fp;
    JComboBox user;
    String name="hii";
    String [] op={"","Profile","Log Out"};
    backend obj3;
    JLabel label1;
    login_page obj4;
    
    
    user_account(front_page1 obj)
    {
        fp=obj;
    }
    void options() throws Exception
    {
        obj3=new backend ();
        int lv=obj3.fetch_query();
        //int lv=0;
        if (lv==1)
        {
            label1 = new JLabel("HII");
            label1.setBounds(1020, 15, 100, 25);
            label1.setForeground(Color.WHITE);
            label1.setFont(new Font("Segoe UI", 0, 16));
             user =new JComboBox(op);
             user.setBounds(1080, 17, 50, 20);
             fp.label1.setVisible(false);
             fp.top_head_panel.add(user);
             fp.top_head_panel.add(label1);
             action_mehtod();
        }
    }
    void action_mehtod()
    {
        user.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ie) 
            {
                if (ie.getStateChange()==ItemEvent.SELECTED)
                {
                   // obj4  =new login_page();
                    //obj4.login_status=0;
                    try {
                       
                        obj3.ref_customer_id=obj3.get_customer_id();
                        System.out.println(obj3.ref_customer_id);
                        obj3.update_login_status(0);
                        front_page.main(op);
                        fp.dispose();
                    } catch (Exception ex) {
                        Logger.getLogger(user_account.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        );
    }
}