/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class CovidDataManagment extends javax.swing.JFrame {

   /**
    * Creates new form CovidDataManagment
    */
   public CovidDataManagment() {
      initComponents();
      // set JFrame to appear centered, regardless of monitor resolution
      // Ορίσετε το JFrame να εμφανίζεται στο κέντρο,
      // ανεξάρτητα από την ανάλυση της οθόνης
      this.pack();
      this.setLocationRelativeTo(null);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jButton4 = new javax.swing.JButton();
      jButton5 = new javax.swing.JButton();

      setTitle("Σύστημα Covid19-Stats");
      setPreferredSize(new java.awt.Dimension(800, 600));

      jButton1.setText("Εισαγωγή χωρών");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jButton2.setText("Εισαγωγή δεδομένων");

      jButton3.setText("Διαγραφή δεδομένων");

      jButton4.setText("Διαγραφή χωρών  ");

      jButton5.setText("Έξοδος διαχείρισης δεδομένων");
      jButton5.setToolTipText("Έξοδος διαχείρισης δεδομένων");
      jButton5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(269, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(288, 288, 288))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(106, Short.MAX_VALUE)
            .addComponent(jButton1)
            .addGap(18, 18, 18)
            .addComponent(jButton2)
            .addGap(18, 18, 18)
            .addComponent(jButton3)
            .addGap(18, 18, 18)
            .addComponent(jButton4)
            .addGap(18, 18, 18)
            .addComponent(jButton5)
            .addGap(107, 107, 107))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      // TODO add your handling code here:
      //Closing JFrame with button click
      // Κλείσιμο του JFrame με κλικ στο κουμπί
      //this.dispose();
      //frameToClose.dispose();
      //super.dispose();
      //setVisible(false); //you can't see me!
      //dispose(); //Destroy the JFrame object
      //System.exit(0); // stop program      
      super.setVisible(false);
           
   }//GEN-LAST:event_jButton5ActionPerformed

   /**
    * @param args the command line arguments
    */
      // Βάζω σε σχόλια την Public static void main Γιατί δεν χρειάζεται να καλείτε
//   public static void main(String args[]) {
//      /* Set the Nimbus look and feel */
//      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//       */
//      try {
//         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//            if ("Nimbus".equals(info.getName())) {
//               javax.swing.UIManager.setLookAndFeel(info.getClassName());
//               break;
//            }
//         }
//      } catch (ClassNotFoundException ex) {
//         java.util.logging.Logger.getLogger(CovidDataManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      } catch (InstantiationException ex) {
//         java.util.logging.Logger.getLogger(CovidDataManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      } catch (IllegalAccessException ex) {
//         java.util.logging.Logger.getLogger(CovidDataManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//         java.util.logging.Logger.getLogger(CovidDataManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      }
//      //</editor-fold>
//
//      /* Create and display the form */
//      java.awt.EventQueue.invokeLater(new Runnable() {
//         public void run() {
//            new CovidDataManagment().setVisible(true);
//         }
//      });
//   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   // End of variables declaration//GEN-END:variables
}
