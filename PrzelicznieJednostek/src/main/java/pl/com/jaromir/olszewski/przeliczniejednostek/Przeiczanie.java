/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.jaromir.olszewski.przeliczniejednostek;

import java.util.Scanner;

/**
 *
 * @author lawio
 */
public class Przeiczanie extends javax.swing.JFrame {

    /**
     * Creates new form Przeiczanie
     */
    public Przeiczanie() {
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

        jo_jTabbedPanemain = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jo_jTextFieldcm = new javax.swing.JTextField();
        jo_jTextFieldm = new javax.swing.JTextField();
        jo_jTextFieldkm = new javax.swing.JTextField();
        jo_jLabelcm = new javax.swing.JLabel();
        jo_jLabelm = new javax.swing.JLabel();
        jo_jLabelkm = new javax.swing.JLabel();
        jo_jButtonO = new javax.swing.JButton();
        jo_jLabelK = new javax.swing.JPanel();
        jo_jTextFieldK = new javax.swing.JTextField();
        jo_jLabelC = new javax.swing.JLabel();
        jo_jButtonT = new javax.swing.JButton();
        jo_jTextFieldC = new javax.swing.JTextField();
        K = new javax.swing.JLabel();
        jo_jLabelF = new javax.swing.JLabel();
        jo_jTextFieldF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jo_jMenumain = new javax.swing.JMenu();
        jo_jMenuItemzamknij = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jo_jTabbedPanemain.setBackground(new java.awt.Color(255, 51, 0));
        jo_jTabbedPanemain.setForeground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jo_jTextFieldcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jTextFieldcmActionPerformed(evt);
            }
        });

        jo_jTextFieldm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jTextFieldmActionPerformed(evt);
            }
        });

        jo_jLabelcm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jo_jLabelcm.setText("cm");

        jo_jLabelm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jo_jLabelm.setText("m");

        jo_jLabelkm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jo_jLabelkm.setText("km");

        jo_jButtonO.setText("przelicz");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jo_jTextFieldcm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jo_jTextFieldm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jo_jTextFieldkm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jo_jButtonO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jo_jLabelcm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jo_jLabelm, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(jo_jLabelkm)
                .addGap(151, 151, 151))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jo_jLabelm)
                    .addComponent(jo_jLabelkm)
                    .addComponent(jo_jLabelcm))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jo_jTextFieldcm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jo_jTextFieldm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jo_jTextFieldkm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jo_jButtonO)
                .addGap(36, 36, 36))
        );

        jo_jTabbedPanemain.addTab("miara", jPanel2);

        jo_jLabelK.setBackground(new java.awt.Color(255, 153, 0));

        jo_jTextFieldK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jTextFieldKActionPerformed(evt);
            }
        });

        jo_jLabelC.setText("C");

        jo_jButtonT.setText("przelicz");

        K.setText("K");

        jo_jLabelF.setText("F");

        jo_jTextFieldF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jTextFieldFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jo_jLabelKLayout = new javax.swing.GroupLayout(jo_jLabelK);
        jo_jLabelK.setLayout(jo_jLabelKLayout);
        jo_jLabelKLayout.setHorizontalGroup(
            jo_jLabelKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jo_jLabelKLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jo_jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164)
                .addComponent(jo_jTextFieldK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(jo_jTextFieldF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(jo_jLabelKLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jo_jLabelC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(K)
                .addGap(233, 233, 233)
                .addComponent(jo_jLabelF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jo_jLabelKLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jo_jButtonT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jo_jLabelKLayout.setVerticalGroup(
            jo_jLabelKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jo_jLabelKLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jo_jLabelKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jo_jLabelC)
                    .addComponent(K)
                    .addComponent(jo_jLabelF))
                .addGap(18, 18, 18)
                .addGroup(jo_jLabelKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jo_jTextFieldK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jo_jTextFieldC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jo_jTextFieldF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jo_jButtonT)
                .addGap(57, 57, 57))
        );

        jo_jTabbedPanemain.addTab("Temp", jo_jLabelK);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Przelicznie jednostek");

        jo_jMenumain.setText("plik");

        jo_jMenuItemzamknij.setText("zamknij");
        jo_jMenuItemzamknij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jo_jMenuItemzamknijActionPerformed(evt);
            }
        });
        jo_jMenumain.add(jo_jMenuItemzamknij);

        jMenuBar1.add(jo_jMenumain);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jo_jTabbedPanemain)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jo_jTabbedPanemain, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jo_jMenuItemzamknijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jMenuItemzamknijActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jo_jMenuItemzamknijActionPerformed

    private void jo_jTextFieldmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jTextFieldmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jo_jTextFieldmActionPerformed

    private void jo_jTextFieldcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jTextFieldcmActionPerformed
     
    }//GEN-LAST:event_jo_jTextFieldcmActionPerformed

    private void jo_jTextFieldKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jTextFieldKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jo_jTextFieldKActionPerformed

    private void jo_jTextFieldFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jo_jTextFieldFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jo_jTextFieldFActionPerformed

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
            java.util.logging.Logger.getLogger(Przeiczanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Przeiczanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Przeiczanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Przeiczanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Przeiczanie().setVisible(true);
            }
        });
    }
       private void liczenie (){
           String c = jo_jTextFieldcm.getText();
           double cm = Double.parseDouble(c);

           

           
           
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel K;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jo_jButtonO;
    private javax.swing.JButton jo_jButtonT;
    private javax.swing.JLabel jo_jLabelC;
    private javax.swing.JLabel jo_jLabelF;
    private javax.swing.JPanel jo_jLabelK;
    private javax.swing.JLabel jo_jLabelcm;
    private javax.swing.JLabel jo_jLabelkm;
    private javax.swing.JLabel jo_jLabelm;
    private javax.swing.JMenuItem jo_jMenuItemzamknij;
    private javax.swing.JMenu jo_jMenumain;
    private javax.swing.JTabbedPane jo_jTabbedPanemain;
    private javax.swing.JTextField jo_jTextFieldC;
    private javax.swing.JTextField jo_jTextFieldF;
    private javax.swing.JTextField jo_jTextFieldK;
    private javax.swing.JTextField jo_jTextFieldcm;
    private javax.swing.JTextField jo_jTextFieldkm;
    private javax.swing.JTextField jo_jTextFieldm;
    // End of variables declaration//GEN-END:variables
}
