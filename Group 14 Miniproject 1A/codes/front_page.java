import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
public class front_page {
    public static void  main(String args[])
    {
        front_page1 fpo=new front_page1();
        //fpo.front_page1();
        fpo.front_panel();
         //fpo.scroll_pane();
        fpo.text_pane();
        fpo.front_label();
       // fpo.images();
        fpo.scroll_pane();
         fpo.images();
        fpo.action_method();
       
        try{
            fpo.login_status();
        } catch (Exception ex) {
            Logger.getLogger(front_page.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        fpo.setVisible(true);
        
    }
}

class front_page1 extends JFrame implements MouseListener
{
    //panels
    JPanel main_panel,top_head_panel,front_panel2,front_panel3,next_panel,prev_panel,item_panel1,item_panel2,item_panel3,item_panel4,item_panel5,item_panel6,item_panel7;
   //thin panels for item panels
    JPanel [] item_p=new JPanel[]{item_panel1,item_panel2,item_panel3,item_panel4,item_panel5,item_panel6,item_panel7};
    //labels
    JPanel tp1,tp2,tp3,tp4,tp5,tp6,tp7;
    JPanel [] tp=new JPanel[]{tp1,tp2,tp3,tp4,tp5,tp6,tp7};
    
    JLabel shopping_label,label1,label2,label3,lab_all,lab_books,lab_elec,lab_home,lab_mobile,lab_fashion,lab_trend,first_label;
   //labels for thin panels
    JLabel tl1,tl2,tl3,tl4,tl5,tl6,tl7,v1,v2,v3,v4,v5;
    JLabel [] tl=new JLabel[]{tl1,tl2,tl3,tl4,tl5,tl6,tl7};
    String [] tl_value={"Best of Mobiles","Best of Fashion","Best of Electronics","Best Of Books","Top picks on Home & Kitchen"};
    JLabel [] v=new JLabel[]{v1,v2,v3,v4,v5};
    //textpane
    JTextPane jtextpane1;
    JScrollPane scroll;
    //variable
    JLabel [] lab= new JLabel[]{lab_mobile,lab_fashion,lab_books,lab_trend,lab_all,lab_home,lab_elec};
    String [] lab_value={"MOBILES","FASHION","ELECTRONICS","BOOKS","HOME&KITCHEN","ALL","TRENDING"};
    int i, x,y,j,k;
    //Jlables for images and items
    JLabel rect_image1,rect_image2,price_lab,name_lab;
    JLabel [] rect_img=new JLabel[]{rect_image1,rect_image2};
    JLabel [][]t_all=new JLabel[5][20];
    String []rect_img_value={"ss1.png","ss2.png"};
    CardLayout c1;
    int check;
    boolean login_val;
    display_items diobj;
    String component_name;
       front_page1()
    {   
        setLayout(null);
        //setSize(600, 400);
        setPreferredSize(new Dimension(4000,4000));
        //setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        //top_head_panel=new JPanel();
        //front_panel2=new JPanel();
        //main_panel=new JPanel();
       
    }
    void front_panel()
    {  //
          main_panel=new JPanel();
        main_panel.setLayout(new GridBagLayout());
       // main_panel.setBounds(0,120,1500,1200);
        //main_panel.setBackground(Color.yellow);//new Color(240,240,240)
        GridBagConstraints gbc=new GridBagConstraints();
        //add(main_panel);
        //top panel
        top_head_panel=new JPanel();
        top_head_panel.setBounds(0,0,1600,50);
        top_head_panel.setBackground(new Color(40, 116, 240));
        add(top_head_panel);
        top_head_panel.setLayout(null);
        //front_panel2
        
        front_panel2=new JPanel();
        front_panel2.setLayout(null);
        front_panel2.setBounds(0,62,1600,40);
        front_panel2.setBackground(new Color(40, 116, 240));
        add(front_panel2);
        //front_panel2.setLayout(null);
        
        //front_panel3
        front_panel3=new JPanel();
        c1=new CardLayout();
        front_panel3.setLayout(c1);
        front_panel3.setBackground(Color.WHITE);
         gbc.gridx=0;gbc.gridy=0;
         gbc.insets=new Insets(0,0,20,0);
         gbc.ipadx=0;gbc.ipady=0;
         main_panel.add( front_panel3,gbc);
         //front_panel3.setSize(1470,300);
         //pack();
        //next and previous panels
      /*  prev_panel=new JPanel();
         prev_panel.setBounds(0,0,30,300);
        prev_panel.setBackground(Color.WHITE);
        main_panel.add(prev_panel);
        
        next_panel=new JPanel();
        next_panel.setBounds(1470,0,30,300);
        next_panel.setBackground(Color.WHITE);
        main_panel.add(next_panel);
     */
        //space for item panels
        x=10;y=0;j=0;k=0;
        int m=0,n=1;
        for (i=0;i<7;i++)
        {
            item_p[i]=new JPanel();
            item_p[i].setLayout(null); 
            //item_p[i].setBounds(x,y,j,k);
            gbc.gridx=m;gbc.gridy=n;
            gbc.ipadx=1470;gbc.ipady=400;
           // gbc.anchor=GridBagConstraints.PAGE_END;
            gbc.insets=new Insets(x,y,j,k);
            item_p[i].setBackground(Color.WHITE);
            main_panel.add(item_p[i],gbc);
            //x=;
            n=n+1;
        }
   
        pack();
        
        //thin panels for item panels
        x=0;y=55;j=1470;k=3;
        for (i=0;i<7;i++)
        {
            tp[i]=new JPanel();
            tp[i].setLayout(null); 
           tp[i].setBounds(x,y,j,k);
            tp[i].setBackground(new Color(40, 116, 240));
             item_p[i].add(tp[i]);
            //x=;
        }
     
     
        
    }
    void front_label()
    {
        shopping_label=new JLabel("OnlineShopping.com");
        shopping_label.setBounds(25, 15, 200, 25);
        shopping_label.setForeground(Color.WHITE);
        shopping_label.setFont(new Font("Segoe UI", 0, 16));
       shopping_label.addMouseListener(this);
        top_head_panel.add(shopping_label);
        //login order carts
        label1 = new JLabel("Login");
        label1.setBounds(1100, 15, 120, 25);
         label1.setForeground(Color.WHITE);
         label1.setFont(new Font("Segoe UI", 0, 16));
         top_head_panel.add(label1);
        label1.addMouseListener(this);
         
        label2 = new JLabel("Orders");
        label2.setBounds(1200, 15, 150, 25);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Segoe UI", 0, 16));
        top_head_panel.add(label2);
        
        label3 = new JLabel("Carts");
        label3.setBounds(1300, 15, 150, 25);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Segoe UI", 0, 16));
        top_head_panel.add(label3);
        label3.addMouseListener(this);
        
        //all,trending,moblies,books,fashion,home,electronics
        x=50;y=10;j=200;k=20;
        for (i=0;i<7;i++)
        { 
           
            lab[i]=new JLabel(lab_value[i]);
            lab[i].setBounds(x,y,j,k);
            lab[i].setForeground(Color.WHITE);
            lab[i].setFont(new Font("Segoe UI",1,16));
            front_panel2.add(lab[i]);
            lab[i].addMouseListener(this);
            lab[i].setName(lab_value[i]);
            x=x+220;    
            
            
        }
       // pack();
       //Labels for thin panels
        x=20;y=15;j=400;k=25;
        for (i=0;i<5;i++)
        { 
           
            tl[i]=new JLabel(tl_value[i]);
            tl[i].setBounds(x,y,j,k);
            tl[i].setForeground(Color.BLACK);
            tl[i].setFont(new Font("Segoe UI",0,25));
            item_p[i].add(tl[i]);   
            tl[i].addMouseListener(this);
            
            
        }
        // labels for view
          x=1350;y=13;j=90;k=35;
        for (i=0;i<5;i++)
        { 
           
            v[i]=new JLabel("    View");
            v[i].setBounds(x,y,j,k);
            v[i].setForeground(Color.WHITE);
            v[i].setBackground(new Color(40, 116, 240));
            v[i].setOpaque(true);
            v[i].setFont(new Font("Segoe UI",0,20));
            item_p[i].add(v[i]);    
            v[i].addMouseListener(this);
            v[i].setName(lab_value[i]);
            
            
        }
    
        
    }
    void text_pane()
    {
        jtextpane1 = new JTextPane();
        jtextpane1.setBounds(600, 10, 400, 30);
        top_head_panel.add(jtextpane1);
        
    }
    void scroll_pane()
    {
        scroll=new JScrollPane(main_panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(0,120,1530,650);
        add(scroll);
    }
    void images() 
    {
        ///rect_image
        for (i=0;i<2;i++)
        {
                
                rect_img[i]=new JLabel();
                rect_img[i].setIcon(new ImageIcon(getClass().getResource(rect_img_value[i])));
                rect_img[i].setPreferredSize(new Dimension(1470,300));
                front_panel3.add(rect_img[i],String.valueOf(i));
                //rect_img[i].setBounds(444, 0,40 ,300);
                c1.show(front_panel3,"1");
            }
            
                      
          
         diobj=new display_items();
         diobj.display_mob(this);
         
        
        }
        
       
    
      void action_method()
    {
             
    }
     public void mouseClicked(MouseEvent e) {  
        
    }  
    public void mouseEntered(MouseEvent e) {  
        shopping_label.setBackground(Color.WHITE);
        //shopping_label.setOpaque(true);
    }  
    public void mouseExited(MouseEvent e) {  
        
       //shopping_label.setOpaque(true);
    }  
    public void mousePressed(MouseEvent e) {  
        if (e.getSource()==shopping_label)
        { 
            front_page.main(tl_value);
            dispose();
            
        }
        if (e.getSource()==label1)
        {
             login_page lgobj1=new login_page(main_panel);
                lgobj1.login_panel(main_panel);
                lgobj1.login_labels();
                lgobj1.login_fields();
                lgobj1.dispose_fun(this);
                lgobj1.login_action(main_panel);
                //lgobj.new_login();
                main_panel.revalidate();
        }
        if (Arrays.asList(v).contains(e.getSource()))
        {
            String str=e.getComponent().getName();
            System.out.println(str);
            category_page cpobj=new category_page(this);
            cpobj.category_panel(this);
            cpobj.category_selection(str);
            cpobj.display_all_items(this);
            main_panel.revalidate();
        }
        if (Arrays.asList(t_all[0]).contains(e.getSource()) ||Arrays.asList(t_all[1]).contains(e.getSource())||Arrays.asList(t_all[2]).contains(e.getSource())||Arrays.asList(t_all[3]).contains(e.getSource())||Arrays.asList(t_all[4]).contains(e.getSource()))
        {
            try {
                String strn=e.getComponent().getName();
                component_name=strn;
               item_p iobj1=new item_p(this,strn);
                System.out.println(component_name);
                main_panel.revalidate();
            } catch (Exception ex) {
                Logger.getLogger(front_page1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource()==lab[0])
             scroll.getViewport().setViewPosition(new Point(0,300));
        if(e.getSource()==lab[1])
             scroll.getViewport().setViewPosition(new Point(0,300*2+100));
        if(e.getSource()==lab[2])
             scroll.getViewport().setViewPosition(new Point(0,300*3+200));
        if(e.getSource()==lab[3])
             scroll.getViewport().setViewPosition(new Point(0,300*4+300));
         if(e.getSource()==lab[4])
             scroll.getViewport().setViewPosition(new Point(0,300*5+400));
    }  
    public void mouseReleased(MouseEvent e) {  
        
    }  
    void login_status() throws Exception
    {
        user_account uobj=new user_account(this);
        uobj.options();
       // uobj.action_mehtod();
    }
            
    
}



class display_items
{
    
   int x,y,j,k,i;
   int x_=20;int y_=75;int j_=170;int k_=240;int i_=7;
   int a,b,c,d;
   int a_=50; int b_=320;int c_=150; int d_=50;
   int timg_w,timg_h,gap,diff;
   int timg_w_=130;int timg_h_=215;int gap_=200;int diff_=200;
   int suml=0,sumt=0;
   int n,row,col;
   int row_=0;int col_=7;int n_=5;
   int w_img=60;int h_img=90;int y_b=38;
   int w_lab=50;int h_lab=50;
   JLabel name_lab;
   backend obj;
   URL url;
   ImageIcon img;
   BufferedImage img1;
   display_items() 
   {
        obj=new backend();
        //diobj=new display_items();
   }
   ImageIcon get_image()
   {
       try {
            url = null;
           try {
               url = new URL(obj.rs.getString("product_image"));
           } catch (MalformedURLException ex) {
               Logger.getLogger(display_items.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(display_items.class.getName()).log(Level.SEVERE, null, ex);
           }
            img1 = ImageIO.read(url);
            img = new ImageIcon(img1);
            // System.out.println(obj.rs.getString("product_image"));
            Image si=img.getImage();
            Image new_img=si.getScaledInstance(timg_w,timg_h,Image.SCALE_SMOOTH);
            img =new ImageIcon(new_img);
   
       } catch (IOException ex) {
           Logger.getLogger(display_items.class.getName()).log(Level.SEVERE, null, ex);
       }
       return img;
   }
   JLabel get_label()
   {
       try {
           name_lab=new JLabel("<html>"+obj.rs.getString("product_name")+"<br/>Rs."+obj.rs.getString("product_price")+"</html>");
           name_lab.setBounds(a,b,c,d);
       } catch (SQLException ex) {
           System.out.println(ex);
       }
     return name_lab;    
   }
   void get_margin()
   {

    row=row_;
    timg_w=timg_w_;timg_h=timg_h_;
    x=x_;y=y_;j=j_;k=k_;   
    a=a_;b=b_;c=c_;d=d_;gap=gap_;diff=diff_ ;
     if (obj.q==1)
    {
        timg_w=timg_w_+w_img;
        timg_h=timg_h_+h_img;
        j=j_+w_lab;
        k=k_+h_lab;
        gap=gap_+30;
        diff=diff_+30;
        b=b_+y_b;
        col_=col_-2;
                
    }
       else
       {
           
       }
   }
    void display_mob(front_page1 ac)
    {   
         
        try {
            obj.getconnection();
            //obj.get_query();
        } catch (Exception ex) {
            System.out.println(ex);
        }
       // this.get_margin();
        
             for(n=0;n<n_;n++)
             {
            try {
                obj.get_query("select * from product_details where product_category="+obj.str[obj.q]);
            } catch (Exception ex) {
                System.out.println(ex);
            }
                this.get_margin();
            try {
                for (col=0;obj.rs.next();col++)
                    
                {
                    
                    try {
                        if (x>1340)
                        {
                            x=20;
                            a=85;
                            y=suml+570;
                            suml=y-220;
                            b=sumt+870;
                            sumt=b-530;
                        }
                        
                        
                        ac.t_all[row][col]=new JLabel("",this.get_image(),JLabel.CENTER);
                        ac.t_all[row][col].setBounds(x,y,j,k);
                        //ac.tmob[i].setBackground(Color.red);
                        //ac.tmob[i].setOpaque(true);
                        ac.item_p[n].add(ac.t_all[row][col]);
                        ac.t_all[row][col].setName(obj.rs.getString("product_name"));
                        x=x+gap;
                        //set product name and price
                        ac.item_p[n].add(this.get_label());
                        ac.t_all[row][col].addMouseListener(ac);
                        //ac.item_p[n].addMouseListener(ac);
                        //price
                        name_lab.addMouseListener(ac);
                        a=a+diff;
                        if (col==col_)
                        {
                            break;
                        }
                        //obj.rs.next();
                        //System.out.println(row+""+col);
                        //System.out.println(ac.t_all[row][col].getName());
                    } catch (SQLException ex) {
                        System.out.println(ex);
                    }
                } 
            } catch (SQLException ex) {
                Logger.getLogger(display_items.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                obj.q++;
                row_++;
                }
                 
             }
                      
    
}