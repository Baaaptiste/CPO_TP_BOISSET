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
    
    public Partie (joueur Joueur1, joueur Joueur2) {
        ListeJoueurs[0]=Joueur1;
        ListeJoueurs[1]=Joueur2;
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
        while (j!=2){
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,colonne)==false || plateau.presenceDesintegrateur(ligne,colonne)==false ){
                plateau.placerTrouNoir(ligne,colonne);
                j+=1;
            } 
        }
        int Z = 0 ;
        while (Z!=2){
            int ligne = r.nextInt(6);
            int colonne = r.nextInt(7);
            if (plateau.presenceTrouNoir(ligne,colonne)==false || plateau.presenceDesintegrateur(ligne,colonne)==false ){
                plateau.placerDesintegrateur(ligne,colonne);
                Z+=1;
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
        placerTrousNoirsEtDesintegrateurs();
        while (FinPartie ==false){
            Scanner sc;
            int NumeroColonneJouer;
            int NumeroLigneJouer;
            int Reponse;
            sc = new Scanner(System.in);
            System.out.println("");
            plateau.afficherGrilleSurConsole();
            System.out.println("");
            System.out.println("Joueur " + ListeJoueurs[0] +", il vous reste " + ListeJoueurs[0].getReserveJetons().size() + " jetons et "+ ListeJoueurs[0].getNombreDesintegrateurs()+" desintegrateurs");
            System.out.println("Joueur " + ListeJoueurs[1] +", il vous reste " + ListeJoueurs[1].getReserveJetons().size() + " jetonset "+ ListeJoueurs[1].getNombreDesintegrateurs()+" desintegrateurs");
            System.out.println("A toi de jouer " + joueurCourant + " (Jeton : " + joueurCourant.getCouleur() + ")");
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1) Jouer un Jeton");
            System.out.println("2) Recuperer un Jeton");
            System.out.println("3) Desintegrer un Jeton");
            Reponse = sc.nextInt();
            while (Reponse > 3 || Reponse < 1) {
                System.out.println("\nErreur : Entrer un choix qui existe :");
                Reponse = sc.nextInt();
            }
            if (Reponse==1){             
                
                System.out.println("\nSaisissez le numero de colonne de 0 a 6");
                plateau.afficherGrilleSurConsole();
                NumeroColonneJouer = sc.nextInt();           
                NumeroLigneJouer = plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(), NumeroColonneJouer);


                if (plateau.grilleRemplie()==true){
                    System.out.println("\nFin de partie, la grille est remplie");
                    FinPartie = true;
                }

                if (NumeroLigneJouer==-1){
                    System.out.println("\nLa colonne " +NumeroColonneJouer+" est pleine");
                    joueurCourant.ajouterJeton(new Jeton(joueurCourant.getCouleur()));                
                }
                else{             
                    if (plateau.presenceTrouNoir(NumeroLigneJouer, NumeroColonneJouer)==true){
                        plateau.supprimerJeton(NumeroLigneJouer, NumeroColonneJouer);
                        plateau.supprimerTrouNoir(NumeroLigneJouer, NumeroColonneJouer);
                    }
                    if (plateau.presenceDesintegrateur(NumeroLigneJouer, NumeroColonneJouer)==true){ 
                        joueurCourant.obtenirDesintegrateur();
                        plateau.supprimerDesintegrateur(NumeroLigneJouer, NumeroColonneJouer);
                    }
                }


                if (plateau.etreGagnantePourCouleur(joueurCourant.getCouleur())) {
                    System.out.println("\nBravo " + joueurCourant + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinPartie = true;
                }

                if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                }
                else if (joueurCourant == ListeJoueurs[1]) {
                    joueurCourant = ListeJoueurs[0];
                }
            }
            
            
            else if (Reponse==2){  
                
                System.out.println("\nSaisissez le numero de colonne de 0 a 6 du jeton");
                plateau.afficherGrilleSurConsole();
                NumeroColonneJouer = sc.nextInt();
                System.out.println("\nSaisissez le numero de ligne de 0 a 5 du jeton");
                NumeroLigneJouer = sc.nextInt();                
               
                if (joueurCourant.getCouleur() == "rouge") {
                    if (plateau.presenceJeton(NumeroLigneJouer, NumeroColonneJouer)== true ){
                        if (plateau.lireCouleurJeton(NumeroLigneJouer, NumeroColonneJouer)== "rouge" ){                      
                            plateau.supprimerJeton(NumeroLigneJouer, NumeroColonneJouer);          
                            joueurCourant.ajouterJeton(new Jeton(joueurCourant.getCouleur())); 
                            plateau.tasserColonne(NumeroColonneJouer);  
                        }
                        else {
                            System.out.println("\nMauvais couleur de jeton");
                        }
                    }
                    else {
                        System.out.println("\nAucun jeton present ici");                        
                    }
                }
                else{
                    if (plateau.presenceJeton(NumeroLigneJouer, NumeroColonneJouer)== true ){
                        if (plateau.lireCouleurJeton(NumeroLigneJouer, NumeroColonneJouer)== "jaune" ){                      
                            plateau.supprimerJeton(NumeroLigneJouer, NumeroColonneJouer);          
                            joueurCourant.ajouterJeton(new Jeton(joueurCourant.getCouleur())); 
                            plateau.tasserColonne(NumeroColonneJouer);  
                        }
                        else {
                            System.out.println("\nMauvais couleur de jeton");
                        }
                    }
                    else {
                        System.out.println("\nAucun jeton present ici");                        
                    }
                }
                  

                if (plateau.etreGagnantePourCouleur(ListeJoueurs[0].getCouleur())) {
                    System.out.println("\nBravo " + ListeJoueurs[0] + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinPartie = true;
                }
                if (plateau.etreGagnantePourCouleur(ListeJoueurs[1].getCouleur())) {
                    System.out.println("\nBravo " + ListeJoueurs[1] + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinPartie = true;
                }                

                if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                }
                else if (joueurCourant == ListeJoueurs[1]) { 
                    joueurCourant = ListeJoueurs[0];
                }
            }
            
            else if (Reponse==3){ 
                System.out.println("\nSaisissez le numero de colonne de 0 a 6 ou vous jouez votre desintegrateur");
                plateau.afficherGrilleSurConsole();
                NumeroColonneJouer = sc.nextInt();
                System.out.println("\nSaisissez le numero de ligne de 0 a 5 ou vous jouez votre desintegrateur");
                NumeroLigneJouer = sc.nextInt();
                
                if (joueurCourant.utiliserDesintegrateur()==true){
                    
                    if (joueurCourant.getCouleur() == "rouge") {  
                        if (plateau.presenceJeton(NumeroLigneJouer, NumeroColonneJouer)== true ){
                            if (plateau.lireCouleurJeton(NumeroLigneJouer, NumeroColonneJouer)== "jaune" ){  
                                plateau.supprimerJeton(NumeroLigneJouer, NumeroColonneJouer);
                                plateau.tasserColonne(NumeroColonneJouer);
                            }
                            else {
                                System.out.println("\nErreur c'est votre jeton");
                            }
                        }
                        else {
                            System.out.println("\nAucun jeton present ici");
                        }
                    }
                    else{
                        if (plateau.presenceJeton(NumeroLigneJouer, NumeroColonneJouer)== true ){
                            if (plateau.lireCouleurJeton(NumeroLigneJouer, NumeroColonneJouer)== "rouge" ){  
                                plateau.supprimerJeton(NumeroLigneJouer, NumeroColonneJouer);
                                plateau.tasserColonne(NumeroColonneJouer);
                            }
                            else {
                                System.out.println("\nErreur c'est votre jeton");
                            }
                        }
                        else {
                            System.out.println("\nAucun jeton present ici");
                        }
                    }
                }
                else{
                    System.out.println("\nVous n'avez pas de desintegrateur");
                }
       
                
                if (plateau.etreGagnantePourCouleur(ListeJoueurs[0].getCouleur())) {
                    System.out.println("\nBravo " + ListeJoueurs[0] + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinPartie = true;
                }
                if (plateau.etreGagnantePourCouleur(ListeJoueurs[1].getCouleur())) {
                    System.out.println("\nBravo " + ListeJoueurs[1] + " a gagne");
                    plateau.afficherGrilleSurConsole();
                    FinPartie = true;
                }                

                if (joueurCourant == ListeJoueurs[0]) {
                    joueurCourant = ListeJoueurs[1];
                }
                else if (joueurCourant == ListeJoueurs[1]) { 
                    joueurCourant = ListeJoueurs[0];
                }                
                
            }
                        

        }
    }
    
}



