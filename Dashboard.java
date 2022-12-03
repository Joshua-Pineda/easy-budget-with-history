


import java.awt.Color;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HP
 */
public class Dashboard extends javax.swing.JFrame {

    public static String userName;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        jLabel_report = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_spending = new javax.swing.JLabel();
        jLabel_AddBudget = new javax.swing.JLabel();
        jLabel_logo = new javax.swing.JLabel();
        jButton_logout = new javax.swing.JButton();
        jLabel_greeting = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 222, 89));
        jPanel4.setPreferredSize(new java.awt.Dimension(1920, 900));

        jPanel5.setBackground(new java.awt.Color(37, 150, 190));

        jLabel_spending.setBackground(new java.awt.Color(97, 44, 9));
        jLabel_spending.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_spending.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_spending.setText("MANAGE SPENDING");
        jLabel_spending.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_spending.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_ManageBudgetMouseMoved(evt);
            }
        });
        jLabel_spending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ManageBudgetMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ManageBudgetMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ManageBudgetMouseExited(evt);
            }
        });

        jLabel_AddBudget.setBackground(new java.awt.Color(97, 44, 9));
        jLabel_AddBudget.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_AddBudget.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AddBudget.setText("ADD BUDGET");
        jLabel_AddBudget.setToolTipText("");
        jLabel_AddBudget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_AddBudget.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_AddBudgetMouseMoved(evt);
            }
        });
        jLabel_AddBudget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_AddBudgetMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_AddBudgetMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_AddBudgetMouseExited(evt);
            }
        });

        jLabel_report.setBackground(new java.awt.Color(97, 44, 9));
        jLabel_report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_report.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_report.setText("MONTHLY REPORT");
        jLabel_report.setToolTipText("");
        jLabel_report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_reportMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ReportEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ReportExited(evt);
            }

        });

        jLabel_greeting.setBackground(new java.awt.Color(117, 50, 1));
        jLabel_greeting.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel_greeting.setForeground(new java.awt.Color(117, 50, 1));
        jLabel_greeting.setText("Hi " + userName + "! Welcome to...");

        jButton_logout.setBackground(new java.awt.Color(117, 50, 1));
        jButton_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_logout.setForeground(new java.awt.Color(255, 255, 255));
        jButton_logout.setText("Logout");
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed();
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X ");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("EasyBudget.png")));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);

        jPanel5.setLayout(jPanel5Layout);

        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(100)
                                .addComponent(jLabel_spending, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200)
                                .addComponent(jLabel_AddBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200)
                                .addComponent(jLabel_report, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelMin)
                                                .addComponent(jLabelClose)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_report, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_AddBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_spending, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);

        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(350)
                                .addComponent(jLabel_greeting)
                        )
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(250)
                                .addComponent(jLabel_logo)
                                .addGap(90)
                                .addComponent(jButton_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        )
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(95)
                                .addComponent(jLabel_greeting)
                        )
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(60)
                                .addComponent(jLabel_logo)
                                //.addGap(100)
                                .addComponent(jButton_logout)
                        )
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_logoutActionPerformed() {
        LoginFrame log = new LoginFrame();
        log.setVisible(true);
        this.dispose();
    }

    private void jLabel_ManageBudgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBudgetMouseClicked
        ManageBudget mb = new ManageBudget();
        mb.setVisible(true);
        mb.pack();
        mb.setLocationRelativeTo(null);
        mb.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jLabel_ManageBudgetMouseClicked

    private void jLabel_AddBudgetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseMoved

    }//GEN-LAST:event_jLabel_AddBudgetMouseMoved

    private void jLabel_AddBudgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseClicked
        AddBudget ab = new AddBudget();
        ab.setVisible(true);
        ab.pack();
        ab.setLocationRelativeTo(null);
        ab.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jLabel_AddBudgetMouseClicked

    private void jLabel_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseClicked
        report r = new report();
        r.getFrame().setVisible(true);

    }

    private void jLabel_ManageBudgetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBudgetMouseMoved

    }//GEN-LAST:event_jLabel_ManageBudgetMouseMoved

    private void jLabel_ManageBudgetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBudgetMouseEntered
        jLabel_spending.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_ManageBudgetMouseEntered

    private void jLabel_ManageBudgetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ManageBudgetMouseExited
        jLabel_spending.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_ManageBudgetMouseExited

    private void jLabel_AddBudgetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseEntered
        jLabel_AddBudget.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_AddBudgetMouseEntered

    private void jLabel_AddBudgetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseExited
        jLabel_AddBudget.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_AddBudgetMouseExited

    private void jLabel_ReportEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseEntered
        jLabel_report.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_AddBudgetMouseEntered

    private void jLabel_ReportExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_AddBudgetMouseExited
        jLabel_report.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_AddBudgetMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_report;
    private javax.swing.JLabel jLabel_AddBudget;
    private javax.swing.JLabel jLabel_spending;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabel_greeting;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    // End of variables declaration//GEN-END:variables
}
