/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class Personnage {
    String Nom;
    int Vie;
    ArrayList<Arme> Inventaire = new ArrayList<Arme>();
    Arme arme_en_main;
 
    public Personnage (String unNom, int uneVie){
          Nom = unNom;
          Vie = uneVie;
          arme_en_main = null;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Personnage :" +Nom +" : "+ Vie;
        return chaine_a_retourner ;
     
    }
    
    public void AjoutArme (Arme arme_a_ajouter){
        if (Inventaire.size()<=5){
                Inventaire.add(arme_a_ajouter);
        }
    }

    public Arme getArme_en_main() {
        return arme_en_main;
    }
    
    public void EquipeArme (String unNomdArme){
        for ( int i=0; i< Inventaire.size(); i++){
            if(Inventaire.get(i).getNom().equals(unNomdArme)) {
                arme_en_main = Inventaire.get(i);
                System.out.println("Arme trouvee et affectee");
                break;
            }
            else{
                System.out.println("Arme pas trouvee et non affectee");

            }
        }
    }
    
    
    
}
