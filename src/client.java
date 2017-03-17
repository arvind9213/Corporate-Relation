
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvind
 */
public class client extends javax.swing.JInternalFrame {

    /**
     * Creates new form client
     */
       Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    public client() {
        initComponents();
    }
     public void getidname(String id,String name)
    {
        jLabel25.setText(id);
        jLabel26.setText(name);
    }
     public void updatetable()
{
     try
        {
            
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
       
            String sql="select * from client";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
               
             // JOptionPane.showMessageDialog(null, "Database created");
                      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
         finally
            {
                try
                {
                                    con.close();
                                    pst.close();
                                     rs.close();
                }
                catch(Exception e)
                {
                    //   JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clients");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton13.setText("Create client Database");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel25.setText("jLabel1");

        jLabel26.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel30.setText("Client name");

        jLabel31.setText("Owner name");

        jLabel32.setText("Contact person");

        jLabel33.setText("Address");

        jLabel34.setText("Telephone");

        jLabel35.setText("Email");

        jLabel36.setText("TIN");

        jLabel37.setText("PAN");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Extract-object-icon.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User-Interface-Available-Updates-icon.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Extract-object-icon2.png"))); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel27.setText("Add");

        jLabel28.setText("Refresh");

        jLabel29.setText("Update");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete-Database-icon.png"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel38.setText("Delete");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField13))
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel28)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(53, 53, 53))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton16))
                    .addComponent(jButton17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel38))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1246, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try
        {

            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
                st=con.createStatement();

                String sql="create table $tablename"+
                "(Clientname varchar(40), "+
                "owner varchar(40) ,"+
                "contactperson varchar(40) ,"+
                "address varchar(100),"+
                 "telephone double,"+
                 "email varchar(40),"+
                 "tin double,"+
                "pan double)";
                String sql2=sql.replace("$tablename","client");
                st.executeUpdate(sql2);
                JOptionPane.showMessageDialog(null, "Database created");

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            finally
            {
                try
                {
                    con.close();
                    pst.close();
                    rs.close();
                }
                catch(Exception e)
                {
                    //   JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
       updatetable();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
           try
        {
            
            String clientname=jTextField13.getText();
          
            String owner=jTextField14.getText();
            String contactperson=jTextField15.getText();
            String address=jTextArea1.getText();
            String telephone=jTextField16.getText();
            String email=jTextField17.getText();
            String tin=jTextField18.getText();
            String pan=jTextField19.getText();
            
             Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
           String sql="update client set clientname='"+clientname+"',owner='"+owner+"',contactperson='"+contactperson+"',address='"+address+"',telephone='"+telephone+"',email='"+email+"',tin='"+tin+"',pan='"+pan+"' where clientname='"+clientname+"'";           
           pst=con.prepareStatement(sql);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null,"Info Updated");
             
             
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         finally
          {
             try
             {
                con.close();
                pst.close();
                 rs.close();
             }
             catch(Exception e)
            {
//            JOptionPane.showMessageDialog(null, e.getMessage());
            }
          }  
           updatetable();
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         try
        {
            int row=jTable1.getSelectedRow();
            String click=(String) (jTable1.getModel().getValueAt(row,0));
              
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
       
            String sql="select * from client where clientname='"+click+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                jTextField13.setText(rs.getString("clientname"));
                 jTextField14.setText(rs.getString("owner"));
                  jTextField15.setText(rs.getString("contactperson"));
                    jTextArea1.setText(rs.getString("address"));
                    jTextField16.setText(rs.getString("telephone"));
                      jTextField17.setText(rs.getString("email"));
              jTextField18.setText(rs.getString("tin"));
                jTextField19.setText(rs.getString("pan"));
            }
        }
         catch(Exception e)
                {
                       JOptionPane.showMessageDialog(null, e.getMessage());
                }
        finally
            {
                try
                {
                                    con.close();
                                    pst.close();
                                     rs.close();
                }
                catch(Exception e)
                {
                    //   JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_DOWN||evt.getKeyCode()==KeyEvent.VK_UP)
        {
             try
        {
            int row=jTable1.getSelectedRow();
            String click=(String) (jTable1.getModel().getValueAt(row,0));
              
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
       
            String sql="select * from client where clientname='"+click+"'";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                jTextField13.setText(rs.getString("clientname"));
                 jTextField14.setText(rs.getString("owner"));
                  jTextField15.setText(rs.getString("contactperson"));
                    jTextArea1.setText(rs.getString("address"));
                    jTextField16.setText(rs.getString("telephone"));
                      jTextField17.setText(rs.getString("email"));
              jTextField18.setText(rs.getString("tin"));
                jTextField19.setText(rs.getString("pan"));
            }
        }
         catch(Exception e)
                {
                       JOptionPane.showMessageDialog(null, e.getMessage());
                }
        finally
            {
                try
                {
                                    con.close();
                                    pst.close();
                                     rs.close();
                }
                catch(Exception e)
                {
                    //   JOptionPane.showMessageDialog(null, e.getMessage());
                }
            } 
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
          try
        {
            
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
             st=con.createStatement();
          
            String sql="insert into client (clientname,owner,contactperson,address,telephone,email,tin,pan) values (?,?,?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1, jTextField13.getText());
              pst.setString(2, jTextField14.getText());
                pst.setString(3, jTextField15.getText());
                  pst.setString(4, jTextArea1.getText());
                    pst.setString(5, jTextField16.getText());
                      pst.setString(6, jTextField17.getText());
                        pst.setString(7, jTextField18.getText());
                          pst.setString(8, jTextField19.getText());
             pst.execute();
            JOptionPane.showMessageDialog(null, "Client added");
                      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
         finally
            {
                try
                {
                                    con.close();
                                    pst.close();
                                     rs.close();
                }
                catch(Exception e)
                {
                    //   JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
         updatetable();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
     try
        {
            
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ARVIND\\Documents\\NetBeansProjects\\corporaterelation\\"+jLabel26.getText()+".sqlite");
       
            String sql="delete from client where clientname=?";
            pst=con.prepareStatement(sql);
            pst.setString(1, jTextField13.getText());
            pst.execute();
            
               
             JOptionPane.showMessageDialog(null, "Client deleted");
                      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
         finally
            {
                try
                {
                                    con.close();
                                    pst.close();
                                     rs.close();
                }
                catch(Exception e)
                {
                    //   JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
     updatetable();
    }//GEN-LAST:event_jButton17ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    // End of variables declaration//GEN-END:variables
}
