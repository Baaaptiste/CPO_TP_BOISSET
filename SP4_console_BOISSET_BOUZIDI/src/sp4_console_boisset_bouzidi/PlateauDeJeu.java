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
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
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
    
    
    public void afficherGrilleSurConsole(){
        for (int ligne=5; ligne>=0; ligne--){
            for (int colonne=0; colonne<7; colonne++){
               System.out.print(grille[ligne][colonne]);               
            }
        System.out.println();
        }
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

 
    public boolean colonneGagnantePourCouleur(String couleur){
         for (int colonne=0;colonne<7;colonne++){
             for (int ligne=0;ligne<3;ligne++){
                 if (grille[ligne][colonne].lireCouleurDuJeton()==couleur){
                     if (grille[ligne+1][colonne].lireCouleurDuJeton()==couleur){
                         if (grille[ligne+2][colonne].lireCouleurDuJeton()==couleur){
                             if (grille[ligne+3][colonne].lireCouleurDuJeton()==couleur){
                                 return true;
                             }
                         }
                     }
                 }
             }
         }
         return false;     
    }
    
    
    public boolean diagonaleMontanteGagnantePourCouleur(String couleur){
          for (int colonne=0;colonne<4;colonne++){
             for (int ligne=0;ligne<3;ligne++){
                 if (grille[ligne][colonne].lireCouleurDuJeton()==couleur){
                     if (grille[ligne+1][colonne+1].lireCouleurDuJeton()==couleur){
                         if (grille[ligne+2][colonne+2].lireCouleurDuJeton()==couleur){
                             if (grille[ligne+3][colonne+3].lireCouleurDuJeton()==couleur){
                                 return true;
                             }
                         }
                     }
                 }
             }
         }
         return false;     
    }           

        public boolean diagonaleDesendanteGagnantePourCouleur(String couleur){
          for (int colonne=0;colonne<4;colonne++){
             for (int ligne=3;ligne<6;ligne++){
                 if (grille[ligne][colonne].lireCouleurDuJeton()==couleur){
                     if (grille[ligne-1][colonne+1].lireCouleurDuJeton()==couleur){
                         if (grille[ligne-2][colonne+2].lireCouleurDuJeton()==couleur){
                             if (grille[ligne-3][colonne+3].lireCouleurDuJeton()==couleur){
                                 return true;
                             }
                         }
                     }
                 }
             }
         }
         return false;     
    }
        
    public boolean etreGagnantePourCouleur(String couleur){
        if ( ligneGagnantePourCouleur ( couleur ) == true || 
             colonneGagnantePourCouleur ( couleur ) == true ||
             diagonaleMontanteGagnantePourCouleur ( couleur ) == true || 
             diagonaleDesendanteGagnantePourCouleur ( couleur ) == true ) {
            return  true ;
        }
        else {
            return  false ;
        }
    }
    
        
    public void tasserColonne(int lacolonne){
        for (int ligne=0; ligne<7;ligne++){
            if (grille[ligne][lacolonne].presenceJeton()==false){
                if (grille[ligne+1][lacolonne].presenceJeton()==true){
                    grille[ligne][lacolonne].affecterJeton(grille[ligne+1][lacolonne].recupererJeton());
                }              
            }
        }
    }
       
    public boolean colonneRemplie(int colonne){
        if (grille[5][colonne].presenceJeton() == true){
            return true ;
        }
        return false;        
    } 
    
    public void placerTrouNoir(int x, int y){
        grille[x][y].placerTrouNoir();
    }
    
    public void supprimerTrouNoir(int x, int y){
        grille[x][y].supprimerTrouNoir();
    }
    
    public void placerDesintegrateur(int x, int y){
        grille[x][y].placerDesintegrateur();
    }    
    
    public void supprimerJeton(int x, int y){
        grille[x][y].supprimerJeton();
    }
    
    public Jeton recupererJeton(int x, int y){
        return grille[x][y].recupererJeton();    
    }   
    
    public boolean presenceTrouNoir(int x, int y){
        if (grille[x][y].presenceTrouNoir()==true){
            return true;
        }
        else{
            return false;
        }     
    }
    
    public boolean presenceDesintegrateur(int x, int y){
        if (grille[x][y].presenceDesintegrateur()==true){
            return true;
        }
        else{
            return false;
        }     
    }
}
