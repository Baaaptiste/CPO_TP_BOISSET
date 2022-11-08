/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bapti
 */
public class Personnage {
    String Nom;
    int Vie;
 
    public Personnage (String unNom, int uneVie){
          Nom = unNom;
          Vie = uneVie;
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Personnage :" +Nom +" : "+ Vie;
        return chaine_a_retourner ;
     
    }
}
