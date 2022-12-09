/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boisset_bouzidi;

import java.util.logging.Logger;

/**
 *
 * @author bapti 
 */
public class Jeton {
    private String  couleur ;

    public Jeton(String couleur) {
        this.couleur = couleur;
    }

    public String lireCouleur() {
        return couleur;
    }

    public String getCouleur() {  
        if (couleur=="rouge"){
            return "\u001B[31m R ";
        }else return "\u001B[33m J ";        
    }
    
    @Override
    public String toString() {
        if (couleur == "rouge" ){
            return "\u001B[31m R " ;
    }
        else{
            return "\u001B[33m J "; 
        }
    }
    
    
    
}
