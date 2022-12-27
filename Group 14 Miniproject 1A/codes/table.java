import javax.swing.*;
import java.awt.*;
public class table {
    public static void main(String args[])
    {
        table1 obj=new table1();
    }
}


class table1 extends JFrame
{
    table1()
    {
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        String [][] data ={{"1","sumit","cricket"},{"2","aman","pubg"},{"3","ankit","webseries"}};
        String [] column={"id","name","hobby"};
        JTable tab1=new JTable(data,column);
        JScrollPane sp=new JScrollPane(tab1);
        sp.setBounds(30,40,400,200);
        add(sp);
        JPasswordField p1=new JPasswordField();
        p1.setBounds(50,400,50,50);
        add(p1);
        String [] d={"1","2","3","4"};
        String [] m={"jan ajajja","fab","march"};
        String [] y={"2022","@023","2024"};
        JComboBox day =new JComboBox(d);
        JComboBox month =new JComboBox(m);
        JComboBox year =new JComboBox(y);
        day.setBounds(600,40,60,40);
        month.setBounds(700,40,60,40);
        year.setBounds(800,40,60,40);
        add(day);add(month);add(year);
        String dob=day.getSelectedItem()+""+month.getSelectedItem()+""+year.getSelectedItem();
        JTextArea ta1=new JTextArea();
        ta1.setBounds(500,500,100,80);
        add(ta1);
        ta1.setText(dob);
    }
}