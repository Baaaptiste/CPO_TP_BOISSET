/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_heritage;

/**
 *
 * @author bapti
 */
public class Arme {
    String Nom;
    private int NvAttaque;
    
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
    
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom +" : "+ NvAttaque +"Pv";
        return chaine_a_retourner ;
     
    }
}