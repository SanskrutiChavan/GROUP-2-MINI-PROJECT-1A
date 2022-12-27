//import java.awt.*;
import javax.swing.*;
public class swing1 {
    public static void main(String args[])
    {
     //JFrame frame=new JFrame();
     abc obj=new abc(); 
          //exp e1=new exp();
     obj.check1();
     obj.check();
    // obj.frame.setVisible(true);
    
      // obj.setLayout(null);
       obj.setVisible(true);
       
  
     
    }

}
class abc extends JFrame
{
    private int k=1;
    JLabel l,l1;
     //JFrame frame=new JFrame();
       abc()
           {
              
               
           
                  setLayout(null);
             setSize(600, 400);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
              
              k=k+1;
              
           }
     

     void check()
     {
         exp e1=new exp(new abc());
     }
     void check1()
     {
         
             l =new JLabel("hii sumit");
         l1=new JLabel("welcome to java gui");
          l1.setBounds(100,100,500,300);
          add(l);
          add(l1);
     }    
     
}
 


class exp 
{
    
    exp(abc a1)
    {
     a1.removeAll();
     //a1.check1();
    // a1.revalidate();
       
        
        
    }
}