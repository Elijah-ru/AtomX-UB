/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gb346159
 */
package atomx_1_1;

import java.awt.*;
import javax.swing.*;

public class AjoutJoueurDlg extends javax.swing.JDialog {
    // Attributs
    private Joueur nj;
    private boolean ok;
    
    public AjoutJoueurDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal); // Appel du constructeur de la super classe
        initComponents();
        this.setSize(500,500);
        this.nj = new Joueur(); // Création d'une instance de nouveau joueur "par défaut"
        this.ok = false; // Indique l'état de la fenêtre
        setTitle("Ajout d'un joueur");
        this.setIconImage(new ImageIcon(getClass().getResource("../Images/Joueur.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        Panneau = new javax.swing.JPanel();
        LPseudo = new javax.swing.JLabel();
        Pseudo = new javax.swing.JTextField();
        LSolde = new javax.swing.JLabel();
        Solde = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel1.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel1.add(Valider);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        Panneau.setLayout(new java.awt.GridLayout(4, 2));

        LPseudo.setText("Pseudo ?");
        Panneau.add(LPseudo);
        Panneau.add(Pseudo);

        LSolde.setText("Solde ?");
        Panneau.add(LSolde);
        Panneau.add(Solde);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));
        Panneau.add(jPanel4);

        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean getOk()
    {
        return this.ok;
    }
    
    public Joueur getJoueur()
    {
        return this.nj;
    }
    
    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
       this.nj.setPseudo(Pseudo.getText());
       this.nj.setSolde(Integer.parseInt(Solde.getText())); 
       this.ok=true; 
       //fermeture de la fenêtre
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_ValiderActionPerformed

    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
       this.setVisible(false);
       this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutJoueurDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AjoutJoueurDlg dialog = new AjoutJoueurDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JLabel LPseudo;
    private javax.swing.JLabel LSolde;
    private javax.swing.JPanel Panneau;
    private javax.swing.JTextField Pseudo;
    private javax.swing.JTextField Solde;
    private javax.swing.JButton Valider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
