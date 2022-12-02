/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boisset_bouzidi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class Partie {
    private joueur[] ListeJoueurs = new joueur[2];
    private joueur joueurCourant = ListeJoueurs[0];
    private PlateauDeJeu plateau  = new PlateauDeJeu();    
    
    public Partie (joueur joueur1, joueur joueur2) {
        ListeJoueurs[0]=joueur1;
        ListeJoueurs[1]=joueur2;
        this.plateau=new PlateauDeJeu();
    }
    
    public void attribuerCouleursAuxJoueurs() {
        double alea = Math.random();
        if (alea <= 0.5){
            ListeJoueurs[0].affecterCouleur("rouge");
            ListeJoueurs[1].affecterCouleur("jaune");
        }
        else{
            ListeJoueurs[1].affecterCouleur("rouge");
            ListeJoueurs[0].affecterCouleur("jaune");
        }
    }
    
    public void creerEtAffecterJeton(joueur Joueur){
        for (int i=0;i<30;i++){       
            Joueur.ajouterJeton(new Jeton(Joueur.getCouleur()));
        }
    }
    
    public void placerTrousNoirsEtDesintegrateurs(){
        Random r = new Random();
        int i=0;
        while (i!=3){
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,colonne)==false && plateau.presenceDesintegrateur(ligne,colonne)==false ){
                plateau.placerTrouNoir(ligne,colonne);
                plateau.placerDesintegrateur(ligne,colonne);
                i+=1;
            }
        }
        int j = 0 ;
        while (j!=3){
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,colonne)==false || plateau.presenceDesintegrateur(ligne,colonne)==false ){
                plateau.placerTrouNoir(ligne,colonne);
                i+=1;
            } 
        }
        int Z = 0 ;
        while (Z!=3){
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,colonne)==false || plateau.presenceDesintegrateur(ligne,colonne)==false ){
                plateau.placerDesintegrateur(ligne,colonne);
                i+=1;
            } 
        }        
    }
    
    public void initialiserPartie(){
        attribuerCouleursAuxJoueurs();
        creerEtAffecterJeton(ListeJoueurs[0]);
        creerEtAffecterJeton(ListeJoueurs[1]);
    }
    
    public void lancerPartie(){
        boolean FinPartie = false;
        joueurCourant=ListeJoueurs[0];
        while (FinPartie ==false){
            Scanner sc;
            sc = new Scanner(System.in);
            plateau.afficherGrilleSurConsole();


        }
    }
    
}


