/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_heritage;

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
}
