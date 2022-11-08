/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author bapti
 */
public class Baton extends Arme{
    int Age;

    public Baton(String unNom, int unNvAttaque, int unAge) {
        super(unNom, unNvAttaque);
          Age = unAge;  
          if (Age > 100){
              Age = 100;
          }
          if (Age < 0){
              Age = 0;    
          }
        }   

   @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "Baton :" +Nom +" : "+ NvAttaque +"," + Age;
        return chaine_a_retourner ;
     
    }

}
