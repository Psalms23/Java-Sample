/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anonymous
 */
public class accounts extends javax.swing.JFrame implements WindowListener, ActionListener, KeyListener, MouseListener {

Connection con;
PreparedStatement pst;
ResultSet rs;
        public accounts() {
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        usertxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passtxt1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        accounts = new javax.swing.JTable();
        createbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(this);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Accounts Settings");

        jLabel2.setText("User ID. :");

        idtxt.setEditable(false);

        jLabel3.setText("Password :");

        passtxt.addActionListener(this);
        passtxt.addKeyListener(this);

        jLabel4.setText("Username :");

        jLabel5.setText("Confirm Password :");

        passtxt1.addActionListener(this);

        accounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        accounts.getTableHeader().setReorderingAllowed(false);
        accounts.addMouseListener(this);
        jScrollPane1.setViewportView(accounts);

        createbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1467696584_list-add-user.png"))); // NOI18N
        createbtn.setText("Create");
        createbtn.addActionListener(this);

        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(this);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close.png"))); // NOI18N
        jButton3.setText("Remove");
        jButton3.addActionListener(this);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(passtxt)
                                    .addComponent(passtxt1)
                                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(createbtn)
                                .addGap(30, 30, 30)
                                .addComponent(updatebtn)
                                .addGap(37, 37, 37)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createbtn)
                    .addComponent(updatebtn)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == passtxt) {
            accounts.this.passtxtActionPerformed(evt);
        }
        else if (evt.getSource() == passtxt1) {
            accounts.this.passtxt1ActionPerformed(evt);
        }
        else if (evt.getSource() == createbtn) {
            accounts.this.createbtnActionPerformed(evt);
        }
        else if (evt.getSource() == updatebtn) {
            accounts.this.updatebtnActionPerformed(evt);
        }
        else if (evt.getSource() == jButton3) {
            accounts.this.jButton3ActionPerformed(evt);
        }
    }

    public void keyPressed(java.awt.event.KeyEvent evt) {
    }

    public void keyReleased(java.awt.event.KeyEvent evt) {
    }

    public void keyTyped(java.awt.event.KeyEvent evt) {
        if (evt.getSource() == passtxt) {
            accounts.this.passtxtKeyTyped(evt);
        }
    }

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == accounts) {
            accounts.this.accountsMouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }

    public void windowActivated(java.awt.event.WindowEvent evt) {
        if (evt.getSource() == accounts.this) {
            accounts.this.formWindowActivated(evt);
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
con = (com.mysql.jdbc.Connection) connection.ConnectDb();
Accounts();
    }//GEN-LAST:event_formWindowActivated

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

    private void passtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxt1ActionPerformed

    private void passtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtxtKeyTyped
  
    }//GEN-LAST:event_passtxtKeyTyped

    private void accountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountsMouseClicked
try{    int row=accounts.getSelectedRow();
        String Table_click = (accounts.getModel().getValueAt(row, 0).toString());
        String click = "Select * from log where cid = '"+Table_click+"'";
        pst=con.prepareStatement(click);
        rs=pst.executeQuery();
            while(rs.next()){
                String id = rs.getString("cid");
                String user = rs.getString("username");
                String pass = rs.getString("password");
                
                idtxt.setText(id);
                usertxt.setText(user);
                passtxt.setText(pass);
                passtxt1.setText(pass);
            }
}catch(Exception ex){}
    }//GEN-LAST:event_accountsMouseClicked

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
String pass =passtxt.getText();
if(usertxt.getText().isEmpty()||pass.isEmpty()||passtxt1.getText().isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Please fill form correctly!");
}else if(passtxt.getText().equals(passtxt1.getText())){
    try{String validation = "select * from log where username = '"+usertxt.getText()+"'";
            pst = con.prepareStatement(validation);
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Account is already registered!");
            }else{
                        try{String create = "insert into log(username,password) values('"+usertxt.getText()+"' , '"+passtxt.getText()+"')";
                            pst = con.prepareStatement(create);
                            pst.execute();
                            Accounts();
                            idtxt.setText("");
                            usertxt.setText("");
                            passtxt.setText("");
                            passtxt1.setText("");
                            JOptionPane.showMessageDialog(rootPane, "Account successfully created");
                        }catch(Exception ex){JOptionPane.showMessageDialog(rootPane, ex);}
            }
        }catch(Exception ex){}
}else{
    JOptionPane.showMessageDialog(rootPane, "Password does not match!");
}
    }//GEN-LAST:event_createbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
String pass =passtxt.getText();
if(usertxt.getText().isEmpty()||pass.isEmpty()||passtxt1.getText().isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Please fill form correctly!");
}else if(passtxt.getText().equals(passtxt1.getText())){
    try{String validation = "select * from log where cid = '"+idtxt.getText()+"'";
            pst = con.prepareStatement(validation);
            rs = pst.executeQuery();
            if(rs.next()){
                try{String update = "update log set username = '"+usertxt.getText()+"' , password = '"+passtxt.getText()+"' where cid = '"+idtxt.getText()+"'";
                    pst = con.prepareStatement(update);
                    pst.execute();
                            idtxt.setText("");
                            usertxt.setText("");
                            passtxt.setText("");
                            passtxt1.setText("");
                    Accounts();
                    JOptionPane.showMessageDialog(rootPane, "Account details updated!");
                }catch(Exception ex){JOptionPane.showMessageDialog(rootPane , ex);}
            }else{
                JOptionPane.showMessageDialog(rootPane, "Account not found!");
            }
        }catch(Exception ex){}
}else{
    JOptionPane.showMessageDialog(rootPane, "Password does not match!");
}
    }//GEN-LAST:event_updatebtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String a,b,c,d,e,f;
a=idtxt.getText();
b= usertxt.getText();
c=passtxt.getText();
d=passtxt1.getText();

if(a.isEmpty()||b.isEmpty()||c.isEmpty()||d.isEmpty()){
    JOptionPane.showMessageDialog(rootPane, "Invalid data detected!");
}else if(c.equals(d)){
    int reply = JOptionPane.showConfirmDialog(rootPane,"Are you sure?", "Remove account from database??", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try{String validation = "select * from log where cid = '"+a+"' and username = '"+b+"' and password = '"+c+"'";
                pst = con.prepareStatement(validation);
                rs = pst.executeQuery();
                while(rs.next()){
                   String lvl = rs.getString("level");
                   
                   if(lvl.equals("admin")){
                       JOptionPane.showMessageDialog(rootPane,"administrator account should not be deleted!");
                   }else{
                       try{String del = "delete from log where cid = '"+a+"' and username = '"+b+"' and password = '"+c+"'";
                                pst=con.prepareStatement(del);
                                pst.execute();
                                        idtxt.setText("");
                                        usertxt.setText("");
                                        passtxt.setText("");
                                        passtxt1.setText("");
                                Accounts();
                                JOptionPane.showMessageDialog(rootPane, "Account deleted!");
                            }catch(Exception ex){}
                   }
                }
                
            }catch(Exception ex){}    
                            
        }else{
                JOptionPane.showMessageDialog(rootPane, "Action canceled!");
        }
}else{
    JOptionPane.showMessageDialog(rootPane, "Password does not match!");
}
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accounts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTable accounts;
    javax.swing.JButton createbtn;
    javax.swing.JTextField idtxt;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    javax.swing.JPasswordField passtxt;
    javax.swing.JPasswordField passtxt1;
    javax.swing.JButton updatebtn;
    javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
public void Accounts(){
try{String list = "Select concat(cid, '')as '"+"User ID"+"',concat(username,'')as '"+"User name"+"',concat(password,'') as '"+"Password"+"' from log order by cid";
    pst=con.prepareStatement(list);
    rs=pst.executeQuery();
    accounts.setModel(DbUtils.resultSetToTableModel(rs));
    
}catch(Exception ex){JOptionPane.showMessageDialog(rootPane, ex);}    
}
}
