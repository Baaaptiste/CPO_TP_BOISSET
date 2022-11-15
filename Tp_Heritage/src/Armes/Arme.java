/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author bapti
 */
public class Arme {
    String Nom;
    int NvAttaque;
    
    public Arme (String unNom, int unNvAttaque){
          Nom = unNom;
          NvAttaque = unNvAttaque;  
          if (NvAttaque > 100){
              NvAttaque = 100;
          }
          if (NvAttaque < 0){
              NvAttaque = 0;    
          }
        }

    public String getNom() {
        return Nom;
    }
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Arme :" +Nom +" : "+ NvAttaque;
        return chaine_a_retourner ;
     
    }
}