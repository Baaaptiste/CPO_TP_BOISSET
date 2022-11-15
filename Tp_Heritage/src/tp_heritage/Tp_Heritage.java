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
import Personnages.Personnage;
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
    
    // Pa/rtie 2
    
    
        Magicien Magicien1 = new Magicien("Gandalf",65,"Confirme");
        Magicien Magicien2 = new Magicien("Garcimore",44,"Novice");
        Guerrier Guerrier1 = new Guerrier("Conan",78,"a Pied");
        Guerrier Guerrier2 = new Guerrier("Lannister",45,"a Cheval");
        
        ArrayList<Personnage> TabPersonnage = new ArrayList<Personnage>();
        TabPersonnage.add(Magicien1); 
        TabPersonnage.add(Magicien2);    
        TabPersonnage.add(Guerrier1);    
        TabPersonnage.add(Guerrier2);    
    
    
    for (int i =0; i<4 ;i++){
        System.out.println(TabPersonnage.get(i));
        }
        
    // Pa/rtie 3
    for (int i =0; i<10 ;i++){
        System.out.println("");
        }
    
        Guerrier Guerrier3 = new Guerrier("Boisset",100,"a Cheval");
        Magicien Magicien3 = new Magicien("Chabasseur",44,"Confirme");
        Epee Epee11 = new Epee("Sharpness", 1,10);
        Epee Epee22 = new Epee("Knockback", 5,50);
        Epee Epee33 = new Epee("Smite", 7,70);
        Baton Baton11 = new Baton("Knockback", 2,20);
        Baton Baton22 = new Baton("Unbreaking", 3,30);
        Baton Baton33 = new Baton("Mending", 8,80);
        
        Guerrier3.AjoutArme(Epee11);
        Guerrier3.AjoutArme(Epee22);
        Guerrier3.AjoutArme(Baton11);
        
        Guerrier3.EquipeArme("Sharpness");
        
        Magicien3.AjoutArme(Baton22);
        Magicien3.AjoutArme(Baton33);
        Magicien3.AjoutArme(Epee33);
        
        Magicien3.EquipeArme("Mending");

        System.out.println(Baton22);
        System.out.println(Baton33);
        System.out.println(Guerrier3);
        System.out.println(Magicien3);

       



        
    } 

}
