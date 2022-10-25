/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_boisset;

/** 
 *
 * @author bapti 
 */
public class TP2_Bieres_BOISSET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",
    7.0 ,"Dubuisson") ;
    uneBiere.lireEtiquette();

    BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",
    6.6 ,"Abbaye de Leffe") ;
    deuxBiere.lireEtiquette();

    BouteilleBiere troisBiere = new BouteilleBiere("HI",
    90 ,"Nazi") ; 
    troisBiere.lireEtiquette();
   
    BouteilleBiere quatreBiere = new BouteilleBiere("Hourra",
    40 ,"Russe") ;
    quatreBiere.lireEtiquette();

    BouteilleBiere cinqBiere = new BouteilleBiere("Bazouzou",
    10 ,"France") ;
    cinqBiere.lireEtiquette();
    
    System.out.println(cinqBiere);

    }
}
