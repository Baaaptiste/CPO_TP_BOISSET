/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_boisset;

/**
 *
 * @author bapti
 */


//  class Voiture
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
 // def du constructeur 
    public Voiture(String unModele, String uneMarque, int unePuissanceCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unePuissanceCV;
        Proprietaire = null;
        
    }
   
    @Override 
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Marque + " " + Modele + " " + PuissanceCV + "CV" ; 
        return chaine_a_retourner ; 
    }    
}