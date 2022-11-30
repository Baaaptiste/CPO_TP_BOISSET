/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boisset_bouzidi;

import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class joueur {
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons = new ArrayList<Jeton>();
    private int nombreDesintegrateurs;
    
    public void Joueur(String nomJoueur){
        nom = nomJoueur;
        nombreDesintegrateurs = 0;                
    }
    
    public void affecterCouleur(String lacouleur){
        couleur = lacouleur;
    }
    
    public int nombreDeJetons(){
        return reserveJetons.size();
    }

    public void ajouterJeton(String unJeton){
        
    }
    
    public void ajouterJeton(Jeton jeton) {
        reserveJetons.add(jeton);
    }
            
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs += 1;
    }

    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs > 0) {
            nombreDesintegrateurs -= 1;
            return true;
        }
        else {
            return false;
        }
    }
}
