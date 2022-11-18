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
}
