package JFRAME;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
//import javax.swing.table.DefaultTableModel;
//import java.text.DateFormat;
//import java.text.MessageFormat;
//import java.text.SimpleDateFormat;
//import rojerusan.RSTableMetro;
//import java.util.Vector;

public class admin_MANAGE_BOOKS_PAGE_copy extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public final void Connect() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/lms", "root", "Devanshk$1104");
        } catch (ClassNotFoundException ex) {
        
            Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public final void table_load() {
        try {
            pst = con.prepareStatement("SELECT * FROM manage_books");
            rs = pst.executeQuery();
            tbl_bookDetails.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
        }
    }

    public admin_MANAGE_BOOKS_PAGE_copy() throws SQLException {
        initComponents();
        Connect();
        table_load();

    }
    
    //to set the book details into the table
    public void setBookDetailsToTable() {

    }
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bookDetails = new rojerusan.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_bookID = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_bookname = new app.bolivia.swing.JCTextField();
        txt_authorname = new app.bolivia.swing.JCTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_quantity = new app.bolivia.swing.JCTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rsupdate = new rojerusan.RSMaterialButtonCircle();
        rsadd = new rojerusan.RSMaterialButtonCircle();
        rsdelete = new rojerusan.RSMaterialButtonCircle();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_searchid = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle5 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_bookDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Name", "Author", "Quantity"
            }
        ));
        tbl_bookDetails.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_bookDetails.setColorBordeFilas(new java.awt.Color(102, 102, 255));
        tbl_bookDetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_bookDetails.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tbl_bookDetails.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 25)); // NOI18N
        tbl_bookDetails.setFuenteFilas(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        tbl_bookDetails.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        tbl_bookDetails.setFuenteHead(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        tbl_bookDetails.setRowHeight(40);
        tbl_bookDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bookDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bookDetails);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 680, 210));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, 48, 32));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 220, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel6.setText("Welcome , Admin");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 220, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFRAME/apsit_logo-removebg-preview.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 70));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel7.setText(" Home Page");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 60));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Features");
        jPanel9.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 340, 60));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel7MouseWheelMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel19.setText(" Issue Books");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(14, 14, 14))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 340, 60));

        jPanel10.setBackground(new java.awt.Color(255, 51, 51));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel20.setText(" Manage Books");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel20)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 340, 60));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel22.setText("View Registered Students");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel22)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 340, 60));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/icons8_Account_50px.png"))); // NOI18N
        jLabel13.setText("Add New Student");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 80));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 340, 100));

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jLabel24.setText(" Logout");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(15, 15, 15))
        );

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 340, 60));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel13MouseWheelMoved(evt);
            }
        });
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel23.setText(" Issue Books To Teacher");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel23)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 470, 360, 60));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 960));

        jLabel9.setForeground(new java.awt.Color(153, 255, 153));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 50, 50));

        txt_bookID.setBackground(new java.awt.Color(204, 204, 255));
        txt_bookID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookID.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_bookID.setPhColor(new java.awt.Color(255, 0, 51));
        txt_bookID.setPlaceholder("Enter Book ID...");
        txt_bookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookIDActionPerformed(evt);
            }
        });
        getContentPane().add(txt_bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 50, 50));

        txt_bookname.setBackground(new java.awt.Color(204, 204, 255));
        txt_bookname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bookname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_bookname.setPhColor(new java.awt.Color(255, 0, 51));
        txt_bookname.setPlaceholder("Enter Book Name...");
        getContentPane().add(txt_bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, 40));

        txt_authorname.setBackground(new java.awt.Color(204, 204, 255));
        txt_authorname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_authorname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_authorname.setPhColor(new java.awt.Color(255, 0, 51));
        txt_authorname.setPlaceholder("Enter Author Name...");
        getContentPane().add(txt_authorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/male_user_50px.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));

        txt_quantity.setBackground(new java.awt.Color(204, 204, 255));
        txt_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_quantity.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_quantity.setPhColor(new java.awt.Color(255, 0, 51));
        txt_quantity.setPlaceholder("Quantity");
        getContentPane().add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Unit_26px.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 50, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rsupdate.setBackground(new java.awt.Color(255, 51, 51));
        rsupdate.setText("UPDATE");
        rsupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rsupdateMouseClicked(evt);
            }
        });
        rsupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsupdateActionPerformed(evt);
            }
        });
        jPanel1.add(rsupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 120, 50));

        rsadd.setBackground(new java.awt.Color(255, 51, 51));
        rsadd.setText("ADD");
        rsadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rsaddMouseClicked(evt);
            }
        });
        rsadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsaddActionPerformed(evt);
            }
        });
        jPanel1.add(rsadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 120, 50));

        rsdelete.setBackground(new java.awt.Color(255, 51, 51));
        rsdelete.setText("DELETE");
        rsdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rsdeleteMouseClicked(evt);
            }
        });
        rsdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsdeleteActionPerformed(evt);
            }
        });
        jPanel1.add(rsdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, 120, 50));

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 51));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        jLabel25.setText("Manage Books");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 310, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        txt_searchid.setBackground(new java.awt.Color(204, 204, 255));
        txt_searchid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_searchid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        txt_searchid.setPhColor(new java.awt.Color(255, 0, 51));
        txt_searchid.setPlaceholder("Search ID...");
        txt_searchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchidActionPerformed(evt);
            }
        });
        txt_searchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchidKeyReleased(evt);
            }
        });
        jPanel1.add(txt_searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 1390, 760));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle4.setText("ADD");
        getContentPane().add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, 120, 50));

        rSMaterialButtonCircle5.setBackground(new java.awt.Color(255, 51, 51));
        rSMaterialButtonCircle5.setText("ADD");
        getContentPane().add(rSMaterialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 690, 120, 50));

        setBounds(0, 0, 1738, 831);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        admin_issue_books_page alp = new admin_issue_books_page();
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jPanel7MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel7MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseWheelMoved

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        admin_MANAGE_BOOKS_PAGE_copy alp = null;
        try {
            alp = new admin_MANAGE_BOOKS_PAGE_copy();
        } catch (SQLException ex) {
            Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(Level.SEVERE, null, ex);
        }
        alp.show();
        dispose();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        admin_issue_books_page alp = new admin_issue_books_page();
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        admin_view_registered_students alp = null;
        try {
            alp = new admin_view_registered_students();
        } catch (SQLException ex) {
            Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(Level.SEVERE, null, ex);
        }
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        admin_Home_Page alp = new admin_Home_Page();
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        student_login alp = new student_login();
        alp.show();
        dispose();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void rsaddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsaddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rsaddMouseClicked

    private void rsdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsdeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rsdeleteMouseClicked

    private void rsupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsupdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rsupdateMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        admin_Home_Page home = new admin_Home_Page();
        home.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txt_bookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookIDActionPerformed

    private void tbl_bookDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bookDetailsMouseClicked

// TDO add your handling code here:
    }//GEN-LAST:event_tbl_bookDetailsMouseClicked
//==================================================BOOK ADDED=============================================================================================
    private void rsaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsaddActionPerformed
        // TODO add your handling code here:
        String cdBId, cdBname, cdAuthorname, cdQuantity;
        cdBId = txt_bookID.getText();
        cdBname = txt_bookname.getText();
        cdAuthorname = txt_authorname.getText();
        cdQuantity = txt_quantity.getText();
        try {
            pst = con.prepareStatement("INSERT INTO manage_books(BookID, Name , Author , Quantity )VALUES(?,?,?,?)");
            pst.setString(1, cdBId);
            pst.setString(2, cdBname);
            pst.setString(3, cdAuthorname);
            pst.setString(4, cdQuantity);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, " BOOK ADDED !");
            table_load();
            txt_bookID.setText("");
            txt_bookname.setText("");
            txt_authorname.setText("");
            txt_quantity.setText("");
        } catch (SQLException e1) {
        }
    }//GEN-LAST:event_rsaddActionPerformed
//==================================================BOOK DELETED==============================================================================================
    private void rsdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsdeleteActionPerformed
        // TODO add your handling code here:
        String cdSId;
        cdSId = txt_searchid.getText();

        try {
            pst = con.prepareStatement("DELETE FROM manage_books WHERE ID = ?");
            pst.setString(1, cdSId);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "BOOK DELETED !");
            table_load();
            txt_bookID.setText("");
            txt_bookname.setText("");
            txt_authorname.setText("");
            txt_quantity.setText("");
            txt_bookID.requestFocus();
        } catch (SQLException e1) {
        }
    }//GEN-LAST:event_rsdeleteActionPerformed

    private void txt_searchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchidActionPerformed
    //==================================================SEARCH ID CODE==========================================================================================
    private void txt_searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchidKeyReleased
        // TODO add your handling code here:
        try {
            String cdSearchId = txt_searchid.getText();

            pst = con.prepareStatement("SELECT BookID, Name, Author, Quantity FROM manage_books WHERE ID = ?");
            pst.setString(1, cdSearchId);
            ResultSet rSet = pst.executeQuery();

            if (rSet.next() == true) {
                String cdtxt_bookid = rSet.getString(1);
                String cdtxt_bookname = rSet.getString(2);
                String cdtxt_authorname = rSet.getString(3);
                String cdtxt_quantity = rSet.getString(4);

                txt_bookID.setText(cdtxt_bookid);
                txt_bookname.setText(cdtxt_bookname);
                txt_authorname.setText(cdtxt_authorname);
                txt_quantity.setText(cdtxt_quantity);
            } else {
                txt_bookID.setText("");
                txt_bookname.setText("");
                txt_authorname.setText("");
                txt_quantity.setText("");
            }

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_txt_searchidKeyReleased
    //==================================================BOOK UPDATED==========================================================================================
    private void rsupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsupdateActionPerformed
        // TODO add your handling code here:
        String cdSId, cdBId, cdBName, cdAuthorName, cdQuantity;
        cdBId = txt_bookID.getText();
        cdBName = txt_bookname.getText();
        cdAuthorName = txt_authorname.getText();
        cdQuantity = txt_quantity.getText();
        cdSId = txt_searchid.getText();
        try {
            pst = con.prepareStatement("UPDATE manage_books SET BookID = ?, Name = ?, Author = ?, Quantity = ? WHERE ID = ?");
            pst.setString(1, cdBId);
            pst.setString(2, cdBName);
            pst.setString(3, cdAuthorName);
            pst.setString(4, cdQuantity);
            pst.setString(5, cdSId);
            pst.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, " BOOK UPDATED !");
            table_load();
            txt_bookID.setText("");
            txt_bookname.setText("");
            txt_authorname.setText("");
            txt_quantity.setText("");
        } catch (SQLException e1) {
        }

    }//GEN-LAST:event_rsupdateActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        admin_new_student dsk = null;
        try {
            dsk = new admin_new_student();
        } catch (SQLException ex) {
            Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(Level.SEVERE, null, ex);
        }
        dsk.show();
        dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        admin_issue_teacher alp = new admin_issue_teacher();
        alp.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jPanel13MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel13MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseWheelMoved

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel13MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new admin_MANAGE_BOOKS_PAGE_copy().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(admin_MANAGE_BOOKS_PAGE_copy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle5;
    private rojerusan.RSMaterialButtonCircle rsadd;
    private rojerusan.RSMaterialButtonCircle rsdelete;
    private rojerusan.RSMaterialButtonCircle rsupdate;
    private rojerusan.RSTableMetro tbl_bookDetails;
    private app.bolivia.swing.JCTextField txt_authorname;
    private app.bolivia.swing.JCTextField txt_bookID;
    private app.bolivia.swing.JCTextField txt_bookname;
    private app.bolivia.swing.JCTextField txt_quantity;
    private app.bolivia.swing.JCTextField txt_searchid;
    // End of variables declaration//GEN-END:variables

}
