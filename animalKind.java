/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZOO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class animalKind extends javax.swing.JFrame {

    /**
     * Creates new form animalKind
     */
    public animalKind() {
        initComponents();
        table_update();
    }
    Connection conn;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("AKID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 80, 21);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 80, 21);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Zoo Region");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(6, 111, 110, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Diet");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 160, 80, 21);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Population");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(6, 225, 100, 21);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 20, 125, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(110, 60, 125, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(110, 110, 125, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(110, 160, 125, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(110, 220, 125, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AKID", "AName", "ZooRegion", "Diet", "Population"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 20, 670, 170);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 290, 80, 41);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(170, 290, 80, 41);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(70, 350, 80, 37);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(170, 350, 80, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\Zoo Management Project\\zoo pic\\tiger1.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-10, 0, 1000, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel dl = (DefaultTableModel)jTable1.getModel();
        
        int selectIndex = jTable1.getSelectedRow();
        
        String id = dl.getValueAt(selectIndex, 0).toString();
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Delete the record","Warning",JOptionPane.YES_NO_OPTION);
       
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            
            try{
           Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/zoo_management","root","");
             
             pst = conn.prepareStatement("delete from animal_kind where AKID = ?");
             
             pst.setString(1, id);
             pst.executeUpdate();
             
             JOptionPane.showMessageDialog(this, "Record deleted....");
             table_update();
             jButton1.setEnabled(true);
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             jTextField4.setText("");
             jTextField5.setText("");
             
             jTextField1.requestFocus();
             
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex) {
                Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE,null,ex);
            }    
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String akid=jTextField1.getText();
        String an=jTextField2.getText();
        String zr=jTextField3.getText();
        String di=jTextField4.getText();
        String pop=jTextField5.getText();
        if(akid.isEmpty()||an.isEmpty()||zr.isEmpty()||di.isEmpty()||pop.isEmpty())
        {
         JOptionPane.showMessageDialog(this, "One or more fields are empty");
        }
        else{
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/zoo_management","root","");
             pst = conn.prepareStatement("Insert into animal_kind(AKID,AName,ZooRegion,Diet,Population) values(?,?,?,?,?)");
             pst.setString(1, akid);
             pst.setString(2, an);
             pst.setString(3, zr);
             pst.setString(4, di);
             pst.setString(5, pop);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Animal kind added....");
                    
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             jTextField4.setText("");
             jTextField5.setText("");
             
             jTextField1.requestFocus();
             table_update();
             
             
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Main m = new Main();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dl = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        jTextField1.setText(dl.getValueAt(selectIndex, 0).toString());
        jTextField2.setText(dl.getValueAt(selectIndex, 1).toString());
        jTextField3.setText(dl.getValueAt(selectIndex, 2).toString());
        jTextField4.setText(dl.getValueAt(selectIndex, 3).toString());
        jTextField5.setText(dl.getValueAt(selectIndex, 4).toString());
        
        
     jButton1.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            String akid=jTextField1.getText();
        String an=jTextField2.getText();
        String zr=jTextField3.getText();
        String di=jTextField4.getText();
        String pop=jTextField5.getText();
        if(akid.isEmpty()||an.isEmpty()||zr.isEmpty()||di.isEmpty()||pop.isEmpty())
        {
         JOptionPane.showMessageDialog(this, "One or more fields are empty");
        }
        else{
        try {
        
            
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/zoo_management","root","");
             pst = conn.prepareStatement("update animal_kind set AName=?,ZooRegion=?,Diet=?,Population=? where AKID=?");
             
             pst.setString(1, an);
             pst.setString(2, zr);
             pst.setString(3, di);
             pst.setString(4, pop);
             pst.setString(5, akid);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Animal kind updated....");
                    jButton1.setEnabled(true);
             jTextField1.setText("");
             jTextField2.setText("");
             jTextField3.setText("");
             jTextField4.setText("");
             jTextField5.setText("");
             
             jTextField1.requestFocus();
             table_update();
             
             
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    
     public void table_update()
    {
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/zoo_management","root","");
            pst = conn.prepareStatement("select * from animal_kind");
            ResultSet rs= pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            c=rd.getColumnCount();
            DefaultTableModel df= (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++)
                {
                    v2.add(rs.getString("AKID"));
                     v2.add(rs.getString("AName"));
                      v2.add(rs.getString("ZooRegion"));
                       v2.add(rs.getString("Diet"));
                        v2.add(rs.getString("Population"));
                }
                df.addRow(v2);
                
                
            }
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Zoo.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(animalKind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(animalKind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(animalKind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(animalKind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new animalKind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
