/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_boisset_bouzidi;

/**
 *
 * @author bapti
 */
public class SP4_console_BOISSET_BOUZIDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       joueur J1 = new joueur("Baptiste");
       joueur J2 = new joueur("Nawfel");
       Partie game = new Partie (J1,J2);
       game.initialiserPartie();
       game.lancerPartie();

    }
    
}
