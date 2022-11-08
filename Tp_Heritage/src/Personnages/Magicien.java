/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author bapti
 */
public class Magicien extends Personnage {
    boolean Novice;
    
    public Magicien(String unNom, int uneVie, String unNovice) {
        super(unNom, uneVie);
        if (unNovice=="Novice"){
            Novice = true ;
        }
        else{
            Novice = false ;
        }
        
    }
}
