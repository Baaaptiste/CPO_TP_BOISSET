/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_boisset;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP2_convertisseurObjet_BOISSET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
// Création de 2 objet de type Convertisseur et application de diverses convUtilisateurersions    
    Convertisseur FirstConv = new Convertisseur();
    FirstConv.CelciusVersFarenheit(30);
    //FirstConv.FarenheitVersKelvin(    FirstConv.CelciusVersFarenheit(30));
    FirstConv.KelvinVersCelcius(300);
    
    Convertisseur SecondConv = new Convertisseur();
    SecondConv.FarenheitVersCelcius(90);
    SecondConv.FarenheitVersKelvin(83);
    SecondConv.KelvinVersFarenheit(300);
    //System.out.println(SecondConv.FarenheitVersCelcius(SecondConv.KelvinVersFarenheit(300)));
    
    

//Affichage du nombre de convUtilisateurersion effectuées par chaque objet.
    //System.out.println(FirstConv);
    //System.out.println(SecondConv);

// création du menu
    Scanner sc = new Scanner(System.in);
    Convertisseur ThirdConversions = new Convertisseur();
    System.out.println("Bonjour, saisissez une températeur : ");
    double valeur = sc.nextDouble();
              
    System.out.println("1) Celcius Vers Kelvin");
    System.out.println("2) Kelvin Vers Celcius");
    System.out.println("3) Farenheit Vers Celcius");
    System.out.println("4) Celcius Vers Farenheit");
    System.out.println("5) Kelvin Vers Farenheit");
    System.out.println("6) Farenheit Vers Kelvin");
    System.out.println("Saisissez un type de conversion que vous souhaiter effectuer :"); 


    int ChoixUtilisateur = sc.nextInt();
    double answer;

    if (ChoixUtilisateur == 1) {
        answer = ThirdConversions.CelciusVersKelvin(valeur);
        System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Kelvin");
    }

    if (ChoixUtilisateur == 2) {
        answer = ThirdConversions.KelvinVersCelcius(valeur);
        System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Celcius");
    }

    if (ChoixUtilisateur == 3) {
        answer = ThirdConversions.FarenheitVersCelcius(valeur);
        System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Celcius");
    }

    if (ChoixUtilisateur == 4) {
        answer = ThirdConversions.CelciusVersFarenheit(valeur);
        System.out.println(valeur + " degrés Celcius est égal à "+answer+" degrés Farenheit");
    }

    if (ChoixUtilisateur == 5) {
        answer = ThirdConversions.KelvinVersFarenheit(valeur);
        System.out.println(valeur + " degrés Kelvin est égal à "+answer+" degrés Farenheit");
    }

    if (ChoixUtilisateur == 6) {
        answer = ThirdConversions.FarenheitVersKelvin(valeur);
        System.out.println(valeur + " degrés Farenheit est égal à "+answer+" degrés Kelvin");
    }
    }  
}
