
//import helper.EconometricaRunable;
import com.google.gson.Gson;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Frame;
import static java.awt.SystemColor.text;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import model.Country;
import model.CountryJpaController;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Covid19Stats extends javax.swing.JFrame {

   /**
    * Creates new form Covid19Stats
    */
   public Covid19Stats() {
      initComponents();
      // set JFrame to appear centered, regardless of monitor resolution
      // Ορίσετε το JFrame να εμφανίζεται στο κέντρο,
      // ανεξάρτητα από την ανάλυση της οθόνης
      super.pack();
      super.setLocationRelativeTo(null);
      //this.setState(Frame.NORMAL);
      // this maximizes the jframe
      //myFrame.setState(Frame.NORMAL);
      // minimize
      //myFrame.setState(Frame.ICONIFIED);
      //super.setState(super.NORMAL);
      
   }

//   private void makeFrameFullSize(JFrame aFrame) {
//      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      aFrame.setSize(screenSize.width, screenSize.height);
//   }
   
   
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
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Σύστημα Covid19-Stats");
      setPreferredSize(new java.awt.Dimension(800, 600));
      setSize(new java.awt.Dimension(0, 0));
      getContentPane().setLayout(null);

      jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton1.setText("Διαχείριση δεδομένων Covid19");
      jButton1.setToolTipText("Διαχείριση δεδομένων Covid19");
      jButton1.setMaximumSize(new java.awt.Dimension(50, 14));
      jButton1.setMinimumSize(new java.awt.Dimension(50, 14));
      jButton1.setPreferredSize(new java.awt.Dimension(50, 14));
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });
      getContentPane().add(jButton1);
      jButton1.setBounds(270, 190, 238, 43);

      jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton2.setText("Προβολή δεδομένων Covid19 ανά χώρα");
      jButton2.setToolTipText("Προβολή δεδομένων Covid19 ανά χώρα");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });
      getContentPane().add(jButton2);
      jButton2.setBounds(270, 250, 238, 43);

      jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton3.setText("Προβολή δεδομένων Covid19 σε χάρτη");
      jButton3.setToolTipText("Προβολή δεδομένων Covid19 σε χάρτη");
      jButton3.setMaximumSize(new java.awt.Dimension(220, 23));
      jButton3.setMinimumSize(new java.awt.Dimension(220, 23));
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });
      getContentPane().add(jButton3);
      jButton3.setBounds(270, 310, 238, 43);

      jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
      jButton4.setText("Έξοδος Προγράμματος");
      jButton4.setToolTipText("Έξοδος Προγράμματος.");
      jButton4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
         }
      });
      getContentPane().add(jButton4);
      jButton4.setBounds(540, 500, 238, 43);

      jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nick\\Desktop\\JavaCode\\3hGEnick\\src\\CovidPics\\covid19Background.png")); // NOI18N
      getContentPane().add(jLabel1);
      jLabel1.setBounds(0, 0, 800, 600);

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // TODO add your handling code here:
      new CovidDataManagment().setVisible(true);
      
   }//GEN-LAST:event_jButton1ActionPerformed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      // TODO add your handling code here:
      new CovidViewData().setVisible(true);
   }//GEN-LAST:event_jButton2ActionPerformed

   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      // TODO add your handling code here:
      // Εξοδος απο την εφαρμογη   
      closeWindowApp();

      //System.exit(0);
      // Covid19Stats.setDefaultCloseOperation(Covid19Stats.EXIT_ON_CLOSE);
   }//GEN-LAST:event_jButton4ActionPerformed

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // TODO add your handling code here:
      new CovidViewData().setVisible(true);
   }//GEN-LAST:event_jButton3ActionPerformed

   

   /**
    *
    */
   // Μέθοδος κλεισίματος εφαρμογής από κουμπί
   public void closeWindowApp(){
      WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
      
      
   }
   
   
  
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
         java.util.logging.Logger.getLogger(Covid19Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Covid19Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Covid19Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Covid19Stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            
            //*****************************************************************
            // Http connection για τράβηγμα δεδομένων από το site που 
            // παρέχει πληροφορίες για τον Covid19
            
            // I want to do some tests for json format so i crate a new String
            // to put the data from the web link
            String CountryInJsonFormat = null;
 
            //String urlToCall = "https://covid2019-api.herokuapp.com/countries";
            //String urlToCall = "https://covid2019-api.herokuapp.com/timeseries/confirmed";
            String urlToCall = "https://covid2019-api.herokuapp.com/v2/confirmed";
            OkHttpClient client=new OkHttpClient();
        
            Request request = new Request.Builder().url(urlToCall).build();
        
            try (Response response = client.newCall(request).execute()) {
               if (response.isSuccessful() && response.body() != null) {
                   String responseString=response.body().string();
                   CountryInJsonFormat = responseString;
                  System.out.println(responseString);
               }
            }
            catch (IOException e){
               e.printStackTrace();
            }           
            
            //*****************************************************************
            
            // display again the String
            // I want to do some tests for json format so i crate a new String
            // System.out.println(CountryInJsonFormat);
            // εμφάνιση του κομμένου string αφού αφαιρέσουμε τα διπλά εισαγωγικά
            // CountryInJsonFormat = CountryInJsonFormat.replaceAll("\"", ""); 
            // System.out.println(CountryInJsonFormat);
             
             
// example             
//            String strMain = "Alpha\" Beta\" Delta\" Gamma\" Sigma";
//            String[] arrSplit_2 = strMain.split("\"", 5);
//            for (int i=0; i < arrSplit_2.length; i++){
//            System.out.println(arrSplit_2[i]);
//            }
             
            
            
            
            
            
            new Covid19Stats().setVisible(true);
            //SwingUtilities.invokeLater(new EconometricaRunable());
            //SwingUtilities invokeLater;
            //invokeLater = SwingUtilities.invokeLater(new Covid19Stats().setVisible(true));
            
            // Δημιουργώ μια μεταβλητή EntityManagerFactory 
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("3hGEnickPU"); 
            EntityManager em = emf.createEntityManager();//EntityManager em; 
            CountryJpaController sjc = new CountryJpaController(emf);
            
                        
//            //Δημιουργώ μία Οντότητα
            Country newCountry1 = new Country( 4, "France");
            Country newCountry2 = new Country( 5, "Italy");
//            try {
//               //Με τον Controller στέλνω την Οντότητα στην βάση δεδομένων
//               sjc.create(newCountry1);
//               sjc.create(newCountry2);
//               
//            } catch (Exception ex) {
//               Logger.getLogger(Covid19Stats.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            

 Gson gson = new Gson();  
 //TestData testdata = gson.fromJson(CountryInJsonFormat,TestData.class);
 Country country = gson.fromJson(CountryInJsonFormat,Country.class);
   //ObjectMapper mapper = new ObjectMapper();
   Map<String,Object> map = mapper.readValue(json, Map.class);
 try{
            em = emf.createEntityManager();
            em.getTransaction().begin();
//            for(CountryDataset cdslist: countryDatasetList){            
//                em.persist(cdslist);                        
//            }

            
            em.persist(newCountry1);  
            
            em.getTransaction().commit();
            em.clear();
        }catch(PersistenceException ex){
            System.out.println(ex.getMessage());
                             
        }catch(Exception ex){
          
        }finally {
            em.close();
        }




            
            
             
                 
                  
            

              
             
             
             
             
            
            
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JLabel jLabel1;
   // End of variables declaration//GEN-END:variables
}
