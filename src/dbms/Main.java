/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Jay Roslindo Donguines @ 2016
 */
public class Main extends javax.swing.JFrame implements WindowListener, ActionListener, KeyListener, ItemListener {
Connection con;
PreparedStatement pst;
ResultSet rs;
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        yearbox = new javax.swing.JComboBox();
        searchtxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("jMenu2");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Student Information System By : Jay Roslindo Donguines");
        addWindowListener(this);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setFloatable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Profiles");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(this);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator2);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText(" Accounts");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(this);
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator3);

        usertxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usertxt.setText("Username");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons2/exit.png"))); // NOI18N
        jButton2.addActionListener(this);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Logged in as :");

        leveltxt.setText("Level");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leveltxt)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usertxt)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(leveltxt))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        list_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(list_table);

        jLabel1.setText("Search :");

        yearbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", " " }));
        yearbox.addItemListener(this);

        searchtxt.setToolTipText("Search by student id,last name, first name, or year");
        searchtxt.addKeyListener(this);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1467696628_BT_print.png"))); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(this);

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setFloatable(false);

        timetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timetxt.setText("Time :");
        jToolBar2.add(timetxt);
        jToolBar2.add(jSeparator4);

        datetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datetxt.setText("Date :");
        jToolBar2.add(datetxt);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1475861187_view-refresh.png"))); // NOI18N
        jButton5.setText("Refresh");
        jButton5.addActionListener(this);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close.png"))); // NOI18N
        jButton6.setText("Delete All");
        jButton6.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(233, 233, 233)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(yearbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 507, Short.MAX_VALUE)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        jMenu1.setText("Settings");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1467696584_list-add-user.png"))); // NOI18N
        jMenuItem1.setText("Account Settings");
        jMenuItem1.addActionListener(this);
        jMenu1.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1475564973_gnome-session-logout.png"))); // NOI18N
        jMenuItem3.setText("Log out");
        jMenuItem3.addActionListener(this);
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == jButton1) {
            Main.this.jButton1ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton4) {
            Main.this.jButton4ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton2) {
            Main.this.jButton2ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton3) {
            Main.this.jButton3ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton5) {
            Main.this.jButton5ActionPerformed(evt);
        }
        else if (evt.getSource() == jMenuItem1) {
            Main.this.jMenuItem1ActionPerformed(evt);
        }
        else if (evt.getSource() == jMenuItem3) {
            Main.this.jMenuItem3ActionPerformed(evt);
        }
        else if (evt.getSource() == jButton6) {
            Main.this.jButton6ActionPerformed(evt);
        }
    }

    public void itemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getSource() == yearbox) {
            Main.this.yearboxItemStateChanged(evt);
        }
    }

    public void keyPressed(java.awt.event.KeyEvent evt) {
    }

    public void keyReleased(java.awt.event.KeyEvent evt) {
    }

    public void keyTyped(java.awt.event.KeyEvent evt) {
        if (evt.getSource() == searchtxt) {
            Main.this.searchtxtKeyTyped(evt);
        }
    }

    public void windowActivated(java.awt.event.WindowEvent evt) {
        if (evt.getSource() == Main.this) {
            Main.this.formWindowActivated(evt);
        }
    }

    public void windowClosed(java.awt.event.WindowEvent evt) {
    }

    public void windowClosing(java.awt.event.WindowEvent evt) {
    }

    public void windowDeactivated(java.awt.event.WindowEvent evt) {
    }

    public void windowDeiconified(java.awt.event.WindowEvent evt) {
    }

    public void windowIconified(java.awt.event.WindowEvent evt) {
    }

    public void windowOpened(java.awt.event.WindowEvent evt) {
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
con=(com.mysql.jdbc.Connection)connection.ConnectDb();
List();
Year();
Time();
Date();

    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//this code is under the copyright of Jay Roslindo Donguines MIT(3 years from now :D)
System.gc();
java.awt.Window win[] = java.awt.Window.getWindows(); 
for(int i=1;i<win.length;i++){ 
    win[i].dispose(); 
    win[i]=null;
}
        login x=new login();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Calendar c = Calendar.getInstance();
        String month1 = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        GregorianCalendar gc = new GregorianCalendar();

        int day1 = gc.get(Calendar.DAY_OF_MONTH);
        int year1 = gc.get(Calendar.YEAR);

        try {
            this.setAlwaysOnTop(false);
            MessageFormat headerFormat = new MessageFormat("Students List ");
            MessageFormat footerFormat = new MessageFormat(month1 + " " + day1 + "," + year1 + "        page {0}");
            list_table.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
            this.setAlwaysOnTop(true);
        } catch (PrinterException pe) {
            JOptionPane.showMessageDialog(rootPane, pe.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//this code is under the copyright of Jay Roslindo Donguines MIT(3 years from now :D)
System.gc();
java.awt.Window win[] = java.awt.Window.getWindows(); 
for(int i=2;i<win.length;i++){ 
    win[i].dispose(); 
    win[i]=null;
}
        Register x= new Register();
                x.pack();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
                x.setResizable(false);
                x.setAlwaysOnTop(true);
                x.toFront();
                x.requestFocus();                           
                x.setTitle("STUDENTS FORM");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//this code is under the copyright of Jay Roslindo Donguines MIT(3 years from now :D)
System.gc();
java.awt.Window win[] = java.awt.Window.getWindows(); 
for(int i=2;i<win.length;i++){ 
    win[i].dispose(); 
    win[i]=null;
} 
String a = leveltxt.getText();
if(a.equals("admin")){
   
        accounts x= new accounts();
                x.pack();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
                x.setResizable(false);
                x.setAlwaysOnTop(true);
                x.toFront();
                x.requestFocus();                           
                x.setTitle("Account Settings");
}else{
        warning x = new warning();
                x.pack();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
                x.setResizable(false);
                x.setAlwaysOnTop(true);
                x.toFront();
                x.requestFocus();
                x.setTitle("Access Denied!");
}            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void searchtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyTyped
String a = (String) yearbox.getSelectedItem();
    if(a.equals("Year")){
                
        String sql = "select concat(id,'')as '"+"Student ID"+"',concat(lname,', ',fname, ' ',mi,'.') as Name,gender,concat(course, ' - ',year) as '"+"Course & Year"+"' from list where lname LIKE ? or fname LIKE ?";
        try {
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, searchtxt.getText() + "%");
            pst.setString(2, searchtxt.getText() + "%");
            rs = pst.executeQuery();
            list_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }else{
        
        String sql = "select concat(id,'')as '"+"Student ID"+"',concat(lname,', ',fname, ' ',mi,'.') as Name,gender,concat(course, ' - ',year) as '"+"Course & Year"+"'from list where lname LIKE ? and year LIKE ? or fname LIKE ? and year LIKE ? or id LIKE ? and year LIKE ?";
        try {
            pst = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
            pst.setString(1, searchtxt.getText() + "%");
            pst.setString(2, (String)yearbox.getSelectedItem() + "%");
            pst.setString(3, searchtxt.getText() + "%");
            pst.setString(4, (String)yearbox.getSelectedItem() + "%");
            pst.setString(5, searchtxt.getText() + "%");
            pst.setString(6, (String)yearbox.getSelectedItem() + "%");
            rs = pst.executeQuery();
            list_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }        
    }//GEN-LAST:event_searchtxtKeyTyped

    private void yearboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearboxItemStateChanged
String year = (String) yearbox.getSelectedItem();
        if(year.equals("Year")){
            List();
        }else{
            try{String sql = "select concat(id,'')as '"+"Student ID"+"',concat(lname,', ',fname, ' ',mi,'.') as Name,gender,concat(course, ' - ',year) as '"+"Course & Year"+"' from list where year = ?";
                pst=con.prepareStatement(sql);
                pst.setString(1,year);
                rs=pst.executeQuery();
                list_table.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception ex){JOptionPane.showMessageDialog(rootPane, ex);}
        }
    }//GEN-LAST:event_yearboxItemStateChanged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//this code is under the copyright of Jay Roslindo Donguines MIT(3 years from now :D)
System.gc();
java.awt.Window win[] = java.awt.Window.getWindows(); 
for(int i=1;i<win.length;i++){ 
    win[i].dispose(); 
    win[i]=null;
}
        login x=new login();
        x.setVisible(true);
        x.setLocationRelativeTo(null);
        this.dispose();
            
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//this code is under the copyright of Jay Roslindo Donguines MIT(3 years from now :D)
System.gc();
java.awt.Window win[] = java.awt.Window.getWindows(); 
for(int i=2;i<win.length;i++){ 
    win[i].dispose(); 
    win[i]=null;
} 
String a = leveltxt.getText();
if(a.equals("admin")){
   
        accounts x= new accounts();
                x.pack();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
                x.setResizable(false);
                x.setAlwaysOnTop(true);
                x.toFront();
                x.requestFocus();                           
                x.setTitle("Account Settings");
}else{
        warning x = new warning();
                x.pack();
                x.setVisible(true);
                x.setLocationRelativeTo(null);
                x.setResizable(false);
                x.setAlwaysOnTop(true);
                x.toFront();
                x.requestFocus();
                x.setTitle("Access Denied!");
} 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
List();
searchtxt.setText("");
yearbox.setSelectedItem("Year");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 int reply = JOptionPane.showConfirmDialog(rootPane, "Doing this action might get the system hanging","Are you sure?", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {  
                try{String del = "truncate list";
                    pst = con.prepareStatement(del);
                    pst.execute();
                    List();
                    JOptionPane.showMessageDialog(rootPane, "All data cleared!");
                }catch(Exception ex){}

        }else{
            JOptionPane.showMessageDialog(rootPane, "Action canceled!");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel datetxt = new javax.swing.JLabel();
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JButton jButton5;
    javax.swing.JButton jButton6;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenu jMenu2;
    javax.swing.JMenu jMenu3;
    javax.swing.JMenu jMenu4;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JMenuBar jMenuBar2;
    javax.swing.JMenuItem jMenuItem1;
    javax.swing.JMenuItem jMenuItem2;
    javax.swing.JMenuItem jMenuItem3;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JToolBar.Separator jSeparator2;
    javax.swing.JToolBar.Separator jSeparator3;
    javax.swing.JToolBar.Separator jSeparator4;
    javax.swing.JToolBar jToolBar1;
    javax.swing.JToolBar jToolBar2;
    public static final javax.swing.JLabel leveltxt = new javax.swing.JLabel();
    javax.swing.JTable list_table;
    javax.swing.JTextField searchtxt;
    public static final javax.swing.JLabel timetxt = new javax.swing.JLabel();
    public static final javax.swing.JLabel usertxt = new javax.swing.JLabel();
    javax.swing.JComboBox yearbox;
    // End of variables declaration//GEN-END:variables

public void List(){
    try{String list = "select concat(id,'')as '"+"Student ID"+"',concat(lname,', ',fname, ' ',mi,'.') as Name,gender,concat(course, ' - ',year) as '"+"Course & Year"+"' from list order by lname ASC";
        pst=con.prepareStatement(list);
        rs=pst.executeQuery();
        list_table.setModel(DbUtils.resultSetToTableModel(rs));
    
    }catch(Exception ex){}
}

public void Year(){
    
    //division drop down
try{    String sql = "Select * from year order by cid ASC";
    pst=con.prepareStatement(sql);
    rs=pst.executeQuery();
Vector nameitem = new Vector();
            while(rs.next()){
                nameitem.add( rs.getString("year"));
                yearbox.setModel(new DefaultComboBoxModel(nameitem));
            }    
}catch(Exception ex){
    JOptionPane.showMessageDialog(rootPane, ex);
}
}

public void Date(){
                  //system date    
    int day,year;
Calendar c = Calendar.getInstance();
String month = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );    
GregorianCalendar gc=new GregorianCalendar();


 day = gc.get(Calendar.DAY_OF_MONTH);
 year = gc.get(Calendar.YEAR);
 

 datetxt.setText(month+" "+day+","+year);

}

public void Time(){
    final DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
ActionListener timerListener = new ActionListener()
    {
        public void actionPerformed(ActionEvent e){
         java.util.Date date = new java.util.Date();
         String time = timeFormat.format(date);
         timetxt.setText(time);
            }    
    };
Timer timer = new Timer(1000, timerListener);
timer.setInitialDelay(0);
timer.start();
}

}
