/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_heritage;

/**
 *
 * @author bapti
 */
public class Epee extends Arme{
    int Finesse;

    public Epee(String unNom, int unNvAttaque, int uneFinesse) {
        super(unNom, unNvAttaque);
          Finesse = uneFinesse;  
          if (Finesse > 100){
              Finesse = 100;
          }
          if (Finesse < 0){
              Finesse = 0;    
          }
        }   

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom +" : "+ NvAttaque +"," + Finesse;
        return chaine_a_retourner ;
     
    }
    
}
