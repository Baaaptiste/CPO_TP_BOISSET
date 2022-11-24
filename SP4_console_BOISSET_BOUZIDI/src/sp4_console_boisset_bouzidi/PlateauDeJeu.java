/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boisset_bouzidi;

/**
 *
 * @author bapti
 */
public class PlateauDeJeu {
    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7] ;
    
    public PlateauDeJeu() {
        for (int i=0; i<7; i++){
            for (int j=0; j<6; j++){
                grille[i][j] = new CelluleDeGrille();
            }
        }
    }
    
    public int ajouterJetonDansColonne(Jeton jeton, int colonne){
        for (int i=0; i<6;i++){
            if (grille[i][colonne].presenceJeton()==false){
                grille[i][colonne].affecterJeton(jeton);
                return i;
            }
        }
        return 0;
    }
    
    public boolean grilleRemplie(){
        for (int colonne = 0 ; colonne<7 ; colonne++){
            if (grille[5][colonne].presenceJeton() == false){
                return false ;
            }
        }
        return true;
        
    }
    
    public boolean presenceJeton(int x, int y){
        return grille [x][y].presenceJeton();
    }

    public String lireCouleurJeton(int x, int y){
        return grille[x][y].lireCouleurDuJeton();
    }    
    
    public boolean ligneGagnantePourCouleur(String couleur){
         for (int ligne=0;ligne<6;ligne++){
             for (int colonne=0;colonne<4;colonne++){
                 if (grille[ligne][colonne].lireCouleurDuJeton()==couleur){
                     if (grille[ligne][colonne+1].lireCouleurDuJeton()==couleur){
                         if (grille[ligne][colonne+2].lireCouleurDuJeton()==couleur){
                             if (grille[ligne][colonne+3].lireCouleurDuJeton()==couleur){
                                 return true;
                             }
                         }
                     }
                 }
             }
         }
         return false;     
    }
    
    
    
    
    
}
