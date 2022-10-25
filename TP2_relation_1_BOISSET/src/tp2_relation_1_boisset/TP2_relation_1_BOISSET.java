/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_boisset;

/**
 *
 * @author bapti
 */
public class TP2_relation_1_BOISSET {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
       // création objet voiture, personne 
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture uneAudi = new Voiture ("RSQ8", "Audi", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 


        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines"); 

        // liste des voitures
        System.out.println("liste des voitures disponibles "+ uneClio  + 
        "\n" + uneAudi   + "\n" + une2008   + "\n" + uneMicra ) ; 

        // Relation personne et voiture
        bob.liste_voitures[0] = uneClio ;
        bob.liste_voitures[1] = uneAudi ;
        bob.nbVoitures = 2 ; 
        
        reno.liste_voitures[0] = une2008 ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ; 
        
        //méthode ajouter_voiture
        reno.ajouter_voiture(uneClio);
        
        System.out.println("les voitures de Bob sont une " + bob.liste_voitures[0] + " et une " + bob.liste_voitures[1] ) ;
        System.out.println("les voitures de Reno sont une " + reno.liste_voitures[0]  + ", une " + reno.liste_voitures[1] + " et une " + reno.liste_voitures[2] ) ;
    }
}
