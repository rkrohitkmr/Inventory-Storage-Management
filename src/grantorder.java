
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohit
 */
public class grantorder extends javax.swing.JFrame {

    /**
     * Creates new form grantorder
     */
    public grantorder() {
        initComponents();
        getContentPane().setBackground( Color.WHITE);
       int count=0;
        try{  
       Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","240");
            Statement stmt=con.createStatement();
        
            ResultSet rs=stmt.executeQuery("SELECT DISTINCT REQN FROM REQ ");  
            
            String id;
            while(rs.next()){  
                             
                             id=rs.getString("REQN");
                            jComboBox1.addItem(id);
                         System.out.println(id);
                            count++;
            } 
            
            if(count==0){
         
                System.out.println("error");}
              
                     
      }
      catch(Exception e)
      {
       // jTextArea1.setText("NO DATA FOUND"+e);
      System.out.println("error"+e);
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Request no");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setEditable(false);

        jButton1.setText("grant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bk.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lgout.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton1)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
                int q; 
             String n,dept , cat;
        
        if(evt.getSource()==jComboBox1)
        {
             String str= jComboBox1.getSelectedItem().toString();
             System.out.println("0try");
      try{  
       Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","240");
          Statement stmt=con.createStatement();
        
        ResultSet rs=stmt.executeQuery("select * from REQ WHERE REQN='"+str+"'");
       
         System.out.println("1try");
          jTextArea1.setText(null);
          
        int a;
            while(rs.next()){  
                             n=rs.getString("NAME");
                             cat=rs.getString("CAT");
                             dept=rs.getString("DEPT");
                             q=rs.getInt("QT");
                                                   
                            jTextArea1.append(n+"\t"+cat+"\t"+dept+"\t"+q+"\n");
                            ResultSet rs1=stmt.executeQuery("select QT from ITEM WHERE NAME='"+n+"'");
                            rs1.next();
                                a=rs1.getInt("QT");
                                if(a>q){
                                jTextField1.setText("CAN BE GRANTED");}
                                else
                                {jTextField1.setText("CAN NOT BE GRANTED");}
                                
                            
                            
            } 
          
            
                   }
      catch(Exception e)
      {
        jTextArea1.setText("NO DATA FOUND"+e);
      System.out.println("error"+e);
      }
            
            
        }//if ends here         
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        NewJFrame2 ob= new NewJFrame2();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login ob= new login();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            int q,od=1; 
             String n,dept , cat;
             String grant= jTextField1.getText();
        System.out.println("button");
        String stat="Successful";
        System.out.println("SUCESS");     
          System.out.println(grant);
        
            
            if(grant.equals("CAN BE GRANTED"))
             {
                 System.out.println("2 if");
                 String str= jComboBox1.getSelectedItem().toString();
             
      try{  
       Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","240");
          Statement stmt=con.createStatement();
        
        ResultSet rs=stmt.executeQuery("select * from REQ WHERE REQN='"+str+"'");
            
   int a,b;
        
            while(rs.next()){  
                             n=rs.getString("NAME");
                             cat=rs.getString("CAT");
                             dept=rs.getString("DEPT");
                             q=rs.getInt("QT");
                                        
             
                             stmt.executeQuery("INSERT INTO APR VALUES('"+od+"','"+n+"','"+q+"','"+dept+"','"+cat+"','"+str+"','"+stat+"')");
                               stmt.executeQuery("DELETE FROM REQ WHERE REQN='"+str+"'");
                                jTextField1.setText("GRANTED");
                             ResultSet rs1=stmt.executeQuery("select QT from ITEM WHERE NAME='"+n+"'");
                                rs1.next();
                               a=rs1.getInt("QT");
                               b=a-q;
                                stmt.executeQuery("UPDATE ITEM SET QT='"+b+"' WHERE NAME='"+n+"'");
                                
                             System.out.println("sucess");
            } 
            
                   }
      catch(Exception e)
      {
        jTextArea1.setText("NO DATA FOUND"+e);
      System.out.println("error"+e);
      }
   
      
        }
             
             
             
             
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */  
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
