/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bapti
 */
public class Guerrier extends Personnage {
    boolean Cheval;
    
    public Guerrier(String unNom, int uneVie, String unCheval) {
        super(unNom, uneVie);
        if (unCheval=="a Cheval"){
            Cheval = true ;
        }
        else{
            Cheval = false ;
        }
        
    }
    
    
}
