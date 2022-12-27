import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.*;
public class category_page {
    String check,str;
    int x,y,j,k,i;
    display_items diobj;
    category_page(front_page1 ac)
    {
         ac.main_panel.removeAll();
         ac.main_panel.invalidate();
         ac.main_panel.setLayout(new GridBagLayout());
         ac.scroll.getViewport().setViewPosition(new Point(0,0));
         diobj=new display_items();
    }
    void category_panel(front_page1 ac)
    {
         GridBagConstraints gbc=new GridBagConstraints();
         x=10;y=0;j=0;k=0;
          int m=0,n=1;
          int len=1800;
          for (i=0;i<2;i++)
        {
            ac.item_p[i]=new JPanel();
            ac.item_p[i].setLayout(null); 
            //item_p[i].setBounds(x,y,j,k);
            gbc.gridx=m;gbc.gridy=n;
            gbc.ipadx=1470;gbc.ipady=len;
           // gbc.anchor=GridBagConstraints.PAGE_END;
            gbc.insets=new Insets(x,y,j,k);
            ac.item_p[i].setBackground(Color.WHITE);
            ac.main_panel.add(ac.item_p[i],gbc);
            len=len-600;
            
            n=n+1;
        }
       //
       
           ac.tp[0]=new JPanel();
           ac.tp[0].setLayout(null); 
           ac.tp[0].setBounds(0,150,1470,3);
           ac.tp[0].setBackground(new Color(40, 116, 240));
           ac.item_p[0].add(ac.tp[0]);
            //x=;
        
        
    }
    void display_all_items(front_page1 ac)
    {
  
        diobj.col_=100;
        diobj.y_=200;diobj.j_=220;diobj.k_=290;diobj.i_=5;diobj.gap_=240;
        diobj.timg_h_=240;diobj.timg_w_=140;
        diobj.a_=85;diobj.b_=500;diobj.c_=220;diobj.diff_=240;
        diobj.display_mob(ac);
 

    }
            
    void  category_selection(String str)
    {
        diobj.n_=1;
        switch(str)
        {
            case "ALL":
                System.out.println("all");
                break;
            case "TRENDING":
                System.out.println("trending");
                break;
            case "MOBILES":
                System.out.println("mobiles");
                diobj.obj.q=0;
                break;
            case "BOOKS":
                System.out.println("books");
                diobj.obj.q=3;
                break;
            case "FASHION":
                diobj.obj.q=1;
                diobj.sumt=70;
                diobj.suml=25;
                System.out.println("fashion");
                break;
            case "HOME&KITCHEN":
                System.out.println("home and kitchen");
                diobj.obj.q=4;
                break;
            case "ELECTRONICS":
                diobj.obj.q=2;
                System.out.println("electronincs");
        }
    }
            
}
