/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_heritage;

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

    ArrayList<Arme> Tab = new ArrayList<Arme>();
    Tab.add(Epee1); 
    Tab.add(Epee2);    
    Tab.add(Baton1);    
    Tab.add(Baton2);    

        
        
    }
    
}
