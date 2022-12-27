import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class checkbox
{
    public static void main(String args[])
            {
                basic1 obj = new basic1();
            }
}



class basic1 extends JFrame implements ActionListener
{
    JTextField f1;
    JLabel l1;
    JCheckBox c1,c2,c3;
    JButton b1;
   basic1()
   {
       setSize(400,400);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       f1=new JTextField(20);
       l1=new JLabel("Result");
       c1=new JCheckBox("maharashtra");
       c2=new JCheckBox("delhi");
       c3=new JCheckBox("chennai");
       b1=new JButton("show");
       add(f1);
       add(l1);
       add(c1);
       add(c2);
       add(c3);
       add(b1);
       b1.addActionListener(this);
       
       
   }
   public void actionPerformed(ActionEvent e)
   {
       String value;
       String text=f1.getText();
       value=text;
       if (c1.isSelected())
       {
           value=value+"\nmaharashtra";
           
       }
       if(c2.isSelected())
       {
        value=value+"\ndelhi";   
       }
       if (c3.isSelected())
       {
           value=value+"\nchennai";
       }
       l1.setText(value);
   }
}