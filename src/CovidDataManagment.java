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
      jLabel1 = new javax.swing.JLabel();

      setTitle("Σύστημα Covid19-Stats");
      setPreferredSize(new java.awt.Dimension(800, 600));
      setSize(new java.awt.Dimension(800, 600));
      getContentPane().setLayout(null);

      jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton1.setText("Εισαγωγή χωρών");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      getContentPane().add(jButton1);
      jButton1.setBounds(270, 180, 238, 43);

      jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton2.setText("Εισαγωγή δεδομένων");
      getContentPane().add(jButton2);
      jButton2.setBounds(270, 240, 238, 43);

      jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton3.setText("Διαγραφή δεδομένων");
      getContentPane().add(jButton3);
      jButton3.setBounds(270, 300, 238, 43);

      jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton4.setText("Διαγραφή χωρών  ");
      getContentPane().add(jButton4);
      jButton4.setBounds(270, 360, 238, 43);

      jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton5.setText("Έξοδος διαχείρισης δεδομένων");
      jButton5.setToolTipText("Έξοδος διαχείρισης δεδομένων");
      jButton5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
         }
      });
      getContentPane().add(jButton5);
      jButton5.setBounds(520, 480, 238, 43);

      jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nick\\Desktop\\JavaCode\\3hGEnick\\src\\CovidPics\\covid19Background.png")); // NOI18N
      getContentPane().add(jLabel1);
      jLabel1.setBounds(-5, -2, 800, 600);

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
   private javax.swing.JLabel jLabel1;
   // End of variables declaration//GEN-END:variables
}
