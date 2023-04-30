/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class BookTable extends javax.swing.JFrame {
    boolean open;
    /**
     * Creates new form BookTable
     */
    void g(boolean b){
        this.open=b;
    }
    public BookTable() {
        
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

        Background = new javax.swing.JPanel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbSearch = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 153, 153));

        joutput.setColumns(20);
        joutput.setRows(5);
        jScrollPane1.setViewportView(joutput);

        scrollPane1.add(jScrollPane1);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bigsymbi.png"))); // NOI18N

        lbSearch.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        lbSearch.setText("Enter a Book You want to Search");

        tfSearch.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        btSearch.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 14)); // NOI18N
        btSearch.setText("Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(tfSearch))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(btSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSearch)
                    .addComponent(jButton1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        try {                                         
            ResultSet resultSet2=null;
            String st=tfSearch.getText();
            String str="";
            try {
                Connection con=StudentLogin.connect();
                Statement statement=con.createStatement();
                resultSet2=statement.executeQuery("SELECT * FROM books WHERE title LIKE '%"+st+"%'; ");
            } catch (SQLException ex) {
                Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
            }
            while(resultSet2.next()){
                int sl_no = resultSet2.getInt("sl_no");
                String title1 = resultSet2.getString("title").trim();
                int tot_copies = resultSet2.getInt("Total_Copies");
                int av_copies = resultSet2.getInt("Available_Copies");
                str+="Sl_No : " + sl_no + "    "
                        + " Title : " + title1+"    "
                        + "Total Copies: "+ tot_copies+"    "
                        + "Available Copies: "+av_copies+"\n";
            }
            joutput.setText(str);
        } catch (SQLException ex) {
            Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(this.open==true){
            StudentDashBoard sd=new StudentDashBoard();
            this.dispose();
            sd.setVisible(true);
        }
        else{
            AdminDashBoard ad=new AdminDashBoard();
            this.dispose();
            ad.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        String str = "";
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Connection con=StudentLogin.connect();
        ResultSet resultSet2;	
        Statement statement=con.createStatement();
        resultSet2 = statement.executeQuery(
            "select * from books");

        System.out.println("No worries");

        int sl_no;
        String title1;
        int tot_copies;
        int av_copies;

        while (resultSet2.next()) {
            try {
                sl_no = resultSet2.getInt("sl_no");
                title1 = resultSet2.getString("title").trim();
                tot_copies = resultSet2.getInt("Total_Copies");
                av_copies = resultSet2.getInt("Available_Copies");
                str+="Sl_No : " + sl_no + "    "
                        + " Title : " + title1+"    "
                        + "Total Copies: "+ tot_copies+"    "
                        + "Available Copies: "+av_copies+"\n";
            } catch (SQLException ex) {
                Logger.getLogger(BookTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        joutput.setText(str);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    static final javax.swing.JTextArea joutput = new javax.swing.JTextArea();
    private javax.swing.JLabel lbSearch;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}