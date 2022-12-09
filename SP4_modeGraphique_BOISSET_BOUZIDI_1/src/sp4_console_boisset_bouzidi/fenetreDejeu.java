/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_boisset_bouzidi;

import java.util.Random;

/**
 *
 * @author bapti
 */
public class fenetreDejeu extends javax.swing.JFrame {

    private joueur[] ListeJoueurs = new joueur[2];
    private joueur joueurCourant = ListeJoueurs[0];
    private PlateauDeJeu plateau = new PlateauDeJeu();

    public fenetreDejeu() {
        initComponents();
        panneau_info_joueur.setVisible(false);
        panneau_info_partie.setVisible(false);
        btn_col_0.setEnabled(false);
        btn_col_1.setEnabled(false);
        btn_col_2.setEnabled(false);
        btn_col_3.setEnabled(false);
        btn_col_4.setEnabled(false);
        btn_col_5.setEnabled(false);
        btn_col_6.setEnabled(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(plateau.grille[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {

                        CelluleDeGrille c = cellGraph.celluleAssociee;
                        if (c.presenceJeton() == false) {
                            return;
                        }
                        if (c.lireCouleurDuJeton() == joueurCourant.getCouleur()) {
                            textemessage.setText("Le joueur " + joueurCourant.getNom() + " récupère un de ses jeton.");
                            c.supprimerJeton();           //
                            joueurCourant.ajouterJeton(new Jeton(joueurCourant.getCouleur()));
                            panneau_grille.repaint();
                            for (int k = 0; k < 7; k++) {
                                plateau.tasserColonne(k);
                            }
                            DebloquerBoutonColonne();

                            joueurSuivant();
                        } else {
                            if (joueurCourant.utiliserDesintegrateur() == true) {
                                textemessage.setText("Le joueur " + joueurCourant.getNom() + " veut désintégrer un jeton.");
                                c.supprimerJeton();
                                lbl_j1_desint.setText(ListeJoueurs[0].getNombreDesintegrateurs() + "");
                                lbl_j2_desint.setText(ListeJoueurs[1].getNombreDesintegrateurs() + "");
                                panneau_grille.repaint();
                                for (int k = 0; k < 7; k++) {
                                    plateau.tasserColonne(k);
                                    
                                }
                                DebloquerBoutonColonne();
                                joueurSuivant();

                            } else {
                                textemessage.setText("Le joueur " + joueurCourant.getNom() + " n'a pas de désintégrateur!.");

                            }

                        }
                        lbl_j1_desint.setText(ListeJoueurs[0].getNombreDesintegrateurs() + "");
                        lbl_j2_desint.setText(ListeJoueurs[1].getNombreDesintegrateurs() + "");

                        boolean vict_j1 = plateau.etreGagnantePourCouleur(ListeJoueurs[0].getCouleur());
                        boolean vict_j2 = plateau.etreGagnantePourCouleur(ListeJoueurs[1].getCouleur());

                        if (vict_j1 && !vict_j2) {
                            textemessage.setText("Victoire de " + ListeJoueurs[0].getNom());
                            btn_col_0.setEnabled(false);
                            btn_col_1.setEnabled(false);
                            btn_col_2.setEnabled(false);
                            btn_col_3.setEnabled(false);
                            btn_col_4.setEnabled(false);
                            btn_col_5.setEnabled(false);
                            btn_col_6.setEnabled(false);
                            bnt_start.setEnabled(true);
                        }
                        if (vict_j2 && !vict_j1) {
                            textemessage.setText("Victoire de " + ListeJoueurs[1].getNom());
                            btn_col_0.setEnabled(false);
                            btn_col_1.setEnabled(false);
                            btn_col_2.setEnabled(false);
                            btn_col_3.setEnabled(false);
                            btn_col_4.setEnabled(false);
                            btn_col_5.setEnabled(false);
                            btn_col_6.setEnabled(false);
                            bnt_start.setEnabled(true);
                        }
                        if (vict_j1 && vict_j2) {
                            if (joueurCourant == ListeJoueurs[0]) {
                                textemessage.setText("Victoire de " + ListeJoueurs[1].getNom() + "(faute de jeu de l'autre joueur");
                                btn_col_0.setEnabled(false);
                                btn_col_1.setEnabled(false);
                                btn_col_2.setEnabled(false);
                                btn_col_3.setEnabled(false);
                                btn_col_4.setEnabled(false);
                                btn_col_5.setEnabled(false);
                                btn_col_6.setEnabled(false);
                                bnt_start.setEnabled(true);
                            } else {
                                textemessage.setText("Victoire de " + ListeJoueurs[0].getNom() + "(faute de jeu de l'autre joueur");
                                btn_col_0.setEnabled(false);
                                btn_col_1.setEnabled(false);
                                btn_col_2.setEnabled(false);
                                btn_col_3.setEnabled(false);
                                btn_col_4.setEnabled(false);
                                btn_col_5.setEnabled(false);
                                btn_col_6.setEnabled(false);
                                bnt_start.setEnabled(true);
                            }
                        }
                    }

                });
                panneau_grille.add(cellGraph);
                panneau_grille.repaint();
            }
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

        panneau_grille = new javax.swing.JPanel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur2 = new javax.swing.JTextField();
        nom_joueur1 = new javax.swing.JTextField();
        bnt_start = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        btn_col_6 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 672, 576));

        panneau_info_partie.setBackground(new java.awt.Color(255, 153, 51));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Infos Joueurs");
        panneau_info_partie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel9.setText("joueur courant :");
        panneau_info_partie.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lbl_jcourant.setText("nomjouer");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, -1, 30));

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_info_partie.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 70));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 310, 140));

        panneau_creation_partie.setBackground(new java.awt.Color(255, 153, 51));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 10));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, -1));

        bnt_start.setText("Démarrer Partie");
        bnt_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(bnt_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 310, 150));

        panneau_info_joueur.setBackground(new java.awt.Color(255, 153, 51));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("desintégrateur :");
        panneau_info_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        lbl_j1_desint.setText("nbdesintegrateur1");
        panneau_info_joueur.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel6.setText("couleur :");
        panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setText("joueur 1 :");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_j1_nom.setText("nomjouer1");
        panneau_info_joueur.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        lbl_j1_couleur.setText("couleurjouer1");
        panneau_info_joueur.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 153, 270, 10));

        jLabel5.setText("desintégrateur :");
        panneau_info_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lbl_j2_desint.setText("nbdesintegrateur1");
        panneau_info_joueur.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel8.setText("couleur :");
        panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lbl_j2_couleur.setText("couleurjouer2");
        panneau_info_joueur.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Infos Joueurs");
        panneau_info_joueur.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel11.setText("joueur 2 :");
        panneau_info_joueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lbl_j2_nom.setText("nomjouer2");
        panneau_info_joueur.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 310, 290));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 20, -1, -1));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 20, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 20, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 20, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 20, -1, -1));

        setBounds(0, 0, 1042, 671);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(6);
        if (plateau.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();    }//GEN-LAST:event_btn_col_6ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        jouerDansColonne(2);
        if (plateau.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(3);
        if (plateau.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(5);
        if (plateau.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(1);
        if (plateau.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        jouerDansColonne(4);
        if (plateau.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        jouerDansColonne(0);
        if (plateau.colonneRemplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void bnt_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_startActionPerformed
        panneau_info_joueur.setVisible(true);
        panneau_info_partie.setVisible(true);
        textemessage.setText("");
        initialiserPartie();
        panneau_grille.repaint();
        bnt_start.setEnabled(true);
        btn_col_0.setEnabled(true);
        btn_col_1.setEnabled(true);
        btn_col_2.setEnabled(true);
        btn_col_3.setEnabled(true);
        btn_col_4.setEnabled(true);
        btn_col_5.setEnabled(true);
        btn_col_6.setEnabled(true);
    }//GEN-LAST:event_bnt_startActionPerformed
    public boolean jouerDansColonne(int indice_colonne) {
        int NumeroLigneJouer = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), indice_colonne);

        if (plateau.grilleRemplie() == true) {
            textemessage.setText("Fin de partie, la grille est remplie. \nCliquez sur démarrer partie pour rejouer.");
            panneau_grille.repaint();
            btn_col_0.setEnabled(false);
            btn_col_1.setEnabled(false);
            btn_col_2.setEnabled(false);
            btn_col_3.setEnabled(false);
            btn_col_4.setEnabled(false);
            btn_col_5.setEnabled(false);
            btn_col_6.setEnabled(false);
            bnt_start.setEnabled(true);
            return false;
        }

        if (NumeroLigneJouer == -1) {
            textemessage.setText("La colonne " + indice_colonne + " est pleine.");
        }

        if (plateau.presenceTrouNoir(NumeroLigneJouer, indice_colonne) == true) {
            plateau.supprimerJeton(NumeroLigneJouer, indice_colonne);
            plateau.supprimerTrouNoir(NumeroLigneJouer, indice_colonne);
        }
        if (plateau.presenceDesintegrateur(NumeroLigneJouer, indice_colonne) == true) {
            joueurCourant.obtenirDesintegrateur();
            plateau.supprimerDesintegrateur(NumeroLigneJouer, indice_colonne);
            lbl_j1_desint.setText(ListeJoueurs[0].getNombreDesintegrateurs() + "");
            lbl_j2_desint.setText(ListeJoueurs[1].getNombreDesintegrateurs() + "");
        }
        lbl_j1_desint.setText(ListeJoueurs[0].getNombreDesintegrateurs() + "");
        lbl_j2_desint.setText(ListeJoueurs[1].getNombreDesintegrateurs() + "");

        boolean vict_j1 = plateau.etreGagnantePourCouleur(ListeJoueurs[0].getCouleur());
        boolean vict_j2 = plateau.etreGagnantePourCouleur(ListeJoueurs[1].getCouleur());

        if (vict_j1 && !vict_j2) {
            textemessage.setText("Victoire de " + ListeJoueurs[0].getNom());
            btn_col_0.setEnabled(false);
            btn_col_1.setEnabled(false);
            btn_col_2.setEnabled(false);
            btn_col_3.setEnabled(false);
            btn_col_4.setEnabled(false);
            btn_col_5.setEnabled(false);
            btn_col_6.setEnabled(false);
            bnt_start.setEnabled(true);
        }
        if (vict_j2 && !vict_j1) {
            textemessage.setText("Victoire de " + ListeJoueurs[1].getNom());
            btn_col_0.setEnabled(false);
            btn_col_1.setEnabled(false);
            btn_col_2.setEnabled(false);
            btn_col_3.setEnabled(false);
            btn_col_4.setEnabled(false);
            btn_col_5.setEnabled(false);
            btn_col_6.setEnabled(false);
            bnt_start.setEnabled(true);
        }
        if (vict_j1 && vict_j2) {
            if (joueurCourant == ListeJoueurs[0]) {
                textemessage.setText("Victoire de " + ListeJoueurs[1].getNom() + "(faute de jeu de l'autre joueur");
                btn_col_0.setEnabled(false);
                btn_col_1.setEnabled(false);
                btn_col_2.setEnabled(false);
                btn_col_3.setEnabled(false);
                btn_col_4.setEnabled(false);
                btn_col_5.setEnabled(false);
                btn_col_6.setEnabled(false);
                bnt_start.setEnabled(true);
            } else {
                textemessage.setText("Victoire de " + ListeJoueurs[0].getNom() + "(faute de jeu de l'autre joueur");
                btn_col_0.setEnabled(false);
                btn_col_1.setEnabled(false);
                btn_col_2.setEnabled(false);
                btn_col_3.setEnabled(false);
                btn_col_4.setEnabled(false);
                btn_col_5.setEnabled(false);
                btn_col_6.setEnabled(false);
                bnt_start.setEnabled(true);
            }
        }

        panneau_grille.repaint();
        if (NumeroLigneJouer == 0 && NumeroLigneJouer == 1 && NumeroLigneJouer == 2 && NumeroLigneJouer == 3 && NumeroLigneJouer == 4 && NumeroLigneJouer == 5) {
            return true;
        } else {
            return true;
        }
    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];
        } else {
            joueurCourant = ListeJoueurs[0];
        }
        lbl_jcourant.setText(joueurCourant.getNom());
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
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDejeu().setVisible(true);
            }
        }); 
    }

    void initialiserPartie() {
        //plateau.viderGrille();

        String nomJoueur1 = nom_joueur1.getText();
        joueur J1 = new joueur(nomJoueur1);
        String nomJoueur2 = nom_joueur2.getText();
        joueur J2 = new joueur(nomJoueur2);
        ListeJoueurs[0] = J1;
        ListeJoueurs[1] = J2;

        attribuerCouleursAuxJoueurs();

        //System.out.println("Joueur " + J1.getNom() + " (Jeton : " + J1.getCouleur() + ")");;
        //System.out.println("Joueur " + J2.getNom() + " (Jeton : " + J2.getCouleur() + ")");
        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        lbl_j1_couleur.setText(J1.getCouleur());
        lbl_j2_couleur.setText(J2.getCouleur());
        lbl_j1_desint.setText(J1.getNombreDesintegrateurs() + "");
        lbl_j2_desint.setText(J2.getNombreDesintegrateurs() + "");

        creerEtAffecterJeton(ListeJoueurs[0]);
        creerEtAffecterJeton(ListeJoueurs[1]);

        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }

        lbl_jcourant.setText(joueurCourant.getNom());

        placerTrousNoirsEtDesintegrateurs();

    }

    void attribuerCouleursAuxJoueurs() {
        double alea = Math.random();
        if (alea <= 0.5) {
            ListeJoueurs[0].affecterCouleur("rouge");
            ListeJoueurs[1].affecterCouleur("jaune");
        } else {
            ListeJoueurs[1].affecterCouleur("rouge");
            ListeJoueurs[0].affecterCouleur("jaune");
        }
    }

    void creerEtAffecterJeton(joueur Joueur) {
        for (int i = 0; i < 30; i++) {
            Joueur.ajouterJeton(new Jeton(Joueur.getCouleur()));
        }
    }

    void placerTrousNoirsEtDesintegrateurs() {
        Random r = new Random();
        int i = 0;
        while (i != 3) {
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
                plateau.placerDesintegrateur(ligne, colonne);
                i += 1;
            }
        }
        int j = 0;
        while (j != 2) {
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false || plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerTrouNoir(ligne, colonne);
                j += 1;
            }
        }
        int Z = 0;
        while (Z != 2) {
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false || plateau.presenceDesintegrateur(ligne, colonne) == false) {
                plateau.placerDesintegrateur(ligne, colonne);
                Z += 1;
            }
        }
    }

    public void DebloquerBoutonColonne() {
        for (int i = 0; i<7; i++) {
            if (plateau.colonneRemplie(i) == false) {
                if (i == 0) {
                    if (btn_col_0.isEnabled() == false) {
                        btn_col_0.setEnabled(true);
                    }
                }
                if (i == 1) {
                    if (btn_col_1.isEnabled() == false) {
                        btn_col_1.setEnabled(true);
                    }
                }
                if (i == 2) {
                    if (btn_col_2.isEnabled() == false) {
                        btn_col_2.setEnabled(true);
                    }
                }
                if (i == 3) {
                    if (btn_col_3.isEnabled() == false) {
                        btn_col_3.setEnabled(true);
                    }
                }
                if (i == 4) {
                    if (btn_col_4.isEnabled() == false) {
                        btn_col_4.setEnabled(true);
                    }
                }
                if (i == 5) {
                    if (btn_col_5.isEnabled() == false) {
                        btn_col_5.setEnabled(true);
                    }
                }
                if (i == 6) {
                    if (btn_col_6.isEnabled() == false) {
                        btn_col_6.setEnabled(true);
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_start;
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables
}
