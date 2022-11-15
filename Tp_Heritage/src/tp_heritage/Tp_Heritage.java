/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_heritage;

import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import Personnages.Guerrier;
import Personnages.Magicien;
import java.util.ArrayList;

/**
 *
 * @author bapti
 */
public class Tp_Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee Epee1 = new Epee("Excalibur", 7,5);
        Epee Epee2 = new Epee("Durandal", 4,7);
        Baton Baton1 = new Baton("Chene", 4,5);
        Baton Baton2 = new Baton("Charme", 5,6);
        System.out.println(Epee1);
        System.out.println(Epee2);
        System.out.println(Baton1);
        System.out.println(Baton2);

    ArrayList<Arme> TabArme = new ArrayList<Arme>();
    TabArme.add(Epee1); 
    TabArme.add(Epee2);    
    TabArme.add(Baton1);    
    TabArme.add(Baton2);    
    
    
    for (int i =0; i<4 ;i++){
        System.out.println(TabArme.get(i));
        }
    
    // Partie 2
    
    
        Magicien Magicien1 = new Magicien("Gandalf",65,"Confirme");
        Magicien Magicien2 = new Magicien("Garcimore",44,"Novice");
        Guerrier Guerrier1 = new Guerrier("Conan",78,"a pied");
        Guerrier Guerrier2 = new Guerrier("Lannister",45,"a Cheval");
        System.out.println(Magicien1);
        System.out.println(Magicien2);
        System.out.println(Guerrier1);
        System.out.println(Guerrier2);
        
    } 
}
