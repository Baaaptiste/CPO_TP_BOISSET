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
    boolean Confirme;
    
    public Magicien(String unNom, int uneVie, String unConfirme) {
        super(unNom, uneVie);
        if (unConfirme=="Confirme"){
            Confirme = true ;
        }
        else{
            Confirme = false ;
        }
        
    }
}
