/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_boisset;

/**
 *
 * @author bapti
 */
public class TP2_manip_BOISSET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
// Initialisation des tartiflettes
    Tartiflette assiette1 = new Tartiflette(500) ;
    Tartiflette assiette2 = new Tartiflette(600) ;
    
    Tartiflette assiette3 = assiette2 ; 

// affichage des nb de Calories des tartiflettes
    System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories);
    System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;

    assiette2 = assiette1 ; 
    assiette1 = assiette3 ; 

    System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories);
    System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
    System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;    
    
    //Q6: Moussaka assiette666 = assiette1 ;
    //    Moussaka assiette667 = new Tartiflette() ;
    //    Les deux lignes sont fausses

    
    Moussaka [] tab = new Moussaka [10];
    
    for (int i=0;i<10;i++){
        tab[i] = new Moussaka(i);
        System.out.println(tab[i].nbCalories);
    }
    
    }   
}
