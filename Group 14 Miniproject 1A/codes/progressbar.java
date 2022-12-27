import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class progressbar {
    public static void main(String args[])
    {
        basic2 obj=new basic2();
    }
    
}


class basic2 extends JFrame implements ActionListener
{   
    int i=0;
    JProgressBar p1;
    JButton b1;
    Timer t1;
    basic2()
    {
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        p1= new JProgressBar(0,20);
        b1=new JButton("ok");
        t1=new Timer(25,this);
        add(p1);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        t1.start();  
        if (i==20)
        {
            basic a1=new basic();
            dispose();
        }
        i++;
        p1.setValue(i);
    }
}