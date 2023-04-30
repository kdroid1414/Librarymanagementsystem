

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LoginBoard extends javax.swing.JFrame {
    public LoginBoard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel pbackgorund = new javax.swing.JPanel();
        javax.swing.JLabel lbRegister = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel lbFirstName = new javax.swing.JLabel();
        tfFullname = new javax.swing.JTextField();
        javax.swing.JLabel lbLastname = new javax.swing.JLabel();
        tfBranch = new javax.swing.JTextField();
        javax.swing.JLabel lbPRN = new javax.swing.JLabel();
        tfPRN = new javax.swing.JTextField();
        javax.swing.JButton btOK = new javax.swing.JButton();
        javax.swing.JButton btReset = new javax.swing.JButton();
        jDash = new javax.swing.JButton();
        javax.swing.JLabel lbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pbackgorund.setBackground(new java.awt.Color(0, 153, 153));
        pbackgorund.setBorder(new javax.swing.border.MatteBorder(null));

        lbRegister.setBackground(new java.awt.Color(255, 255, 255));
        lbRegister.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        lbRegister.setForeground(new java.awt.Color(255, 255, 255));
        lbRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRegister.setText("Register");
        lbRegister.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbFirstName.setBackground(new java.awt.Color(0, 204, 204));
        lbFirstName.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        lbFirstName.setText("Full Name");

        lbLastname.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        lbLastname.setText("Branch");

        lbPRN.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        lbPRN.setText("PRN");

        btOK.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btReset.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        btReset.setText("RESET");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        jDash.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jDash.setText("Dashboard");
        jDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfFullname)
                    .addComponent(lbLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfBranch)
                    .addComponent(lbPRN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPRN)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDash)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btReset)
                        .addGap(11, 11, 11))
                    .addComponent(lbFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btOK, btReset});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFirstName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbLastname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPRN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btOK)
                    .addComponent(btReset)
                    .addComponent(jDash))
                .addGap(17, 17, 17))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btOK, btReset});

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/491-4910202_law-faculty-symbiosis-international-university-pune-symbiosis.png"))); // NOI18N
        lbLogo.setText("jLabel1");

        javax.swing.GroupLayout pbackgorundLayout = new javax.swing.GroupLayout(pbackgorund);
        pbackgorund.setLayout(pbackgorundLayout);
        pbackgorundLayout.setHorizontalGroup(
            pbackgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgorundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pbackgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pbackgorundLayout.createSequentialGroup()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pbackgorundLayout.setVerticalGroup(
            pbackgorundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbackgorundLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(lbRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pbackgorund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pbackgorund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 234, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String PRN,name,bran;
    private int rn;
    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        int flag=0;
        boolean result=tfFullname.getText().matches("[a-zA-Z]+");
        if(!((result) ||(tfFullname.getText().isEmpty()))){
            JOptionPane.showMessageDialog(this, "Name should be alphabetic.");
            tfFullname.setText("");
            flag=1;

        }
        try{
            PRN=tfPRN.getText();
            if(!PRN.isEmpty()){
                rn=Integer.parseInt(PRN);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"PRN SHOULD BE A NUMBER");
            tfPRN.setText("");
            flag=1;
        }
        
        
        
        
        
        
        bran = tfBranch.getText();
        PRN= tfPRN.getText();
        
        name = tfFullname.getText();
        
        if((name.isEmpty() || bran.isEmpty() || PRN.isEmpty() )&& flag!=1)
        {
            JOptionPane.showMessageDialog(this,"Please Enter all fields","Try Again",JOptionPane.ERROR_MESSAGE);
        }
        else if(flag==1)
        {
            
        }
        else
        {
            try {
                StudentLogin Studentlogin=new StudentLogin();
                Connection con=Studentlogin.connect();
                Statement statement1=con.createStatement();
                
                int resultSet=statement1.executeUpdate("insert into students values("+PRN+",'"+name+"','"+bran+"',0,0);");
                System.out.println("Student registered successfully");
                this.dispose();
                StudentDashBoard.main(Integer.parseInt(PRN),name);
            } catch (SQLException ex) {
                Logger.getLogger(LoginBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        }
    }//GEN-LAST:event_btOKActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
         tfFullname.setText("");
         tfBranch.setText("");
         tfPRN.setText("");  
    }//GEN-LAST:event_btResetActionPerformed

    private void jDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDashActionPerformed
        LoginDashboard ld=new LoginDashboard();
        ld.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jDashActionPerformed

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoginBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDash;
    private javax.swing.JTextField tfBranch;
    private javax.swing.JTextField tfFullname;
    private javax.swing.JTextField tfPRN;
    // End of variables declaration//GEN-END:variables
}
