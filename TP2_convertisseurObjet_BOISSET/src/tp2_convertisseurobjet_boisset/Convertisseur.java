/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_boisset;

/**
 *
 * @author bapti
 */
public class Convertisseur {
    
    int nbConversions  ;
            
    public Convertisseur () {
        nbConversions = 0 ;
    }
    
    // fonctions de convertions
    public double CelciusVersKelvin (double Celcius) {
    nbConversions++ ;
    return Celcius += 274.15;
    }
   
    public double KelvinVersCelcius (double Kelvin) {
    nbConversions++ ;
    return Kelvin -= 274.15;
    }
    
    public double FarenheitVersCelcius (double Farenheit) {
    nbConversions++ ;
    return Farenheit = ( Farenheit - 32 ) / 1.8;
    }
    
    public double CelciusVersFarenheit (double Celcius) {
    nbConversions=nbConversions+1;
    return Celcius = (Celcius*1.8) + 32;
    }
    
        
    public double KelvinVersFarenheit (double Kelvin) {
    nbConversions--;
    return Kelvin = CelciusVersFarenheit(KelvinVersCelcius(Kelvin));
    }
    
    public double FarenheitVersKelvin (double Farenheit) {
    return Farenheit = FarenheitVersCelcius (CelciusVersKelvin(Farenheit));
    }
    
        
    @Override 
    public String toString () { 
        return "nb de conversions "+ nbConversions;
    }
}
    
    
