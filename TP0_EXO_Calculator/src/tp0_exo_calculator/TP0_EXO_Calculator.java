/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_exo_calculator;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP0_EXO_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        int operateur= 0;
        float operand1= 0;
        float operand2= 0;
        
        
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un opérateur compris entre 1 et 5 inclus :");
        operateur = sc.nextInt();
        System.out.println();
        if (operateur == 5){
            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une première valeur entière :");
            operand1 = sc.nextInt();
            System.out.println();

            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une deuxième valeur entière :");
            operand2 = sc.nextInt();
            System.out.println();
            System.out.println("Le résultat deu nombre 1 modulo nombre 2 est "+(operand1%operand2));

        }
        
        if (operateur == 1){
            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une première valeur entière :");
            operand1 = sc.nextInt();
            System.out.println();

            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une deuxième valeur entière :");
            operand2 = sc.nextInt();
            System.out.println();
            System.out.println("Le résultat de la somme de vos 2 nombres est "+(operand1+operand2)); 
        }
        
        if (operateur == 2){
            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une première valeur entière :");
            operand1 = sc.nextInt();
            System.out.println();

            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une deuxième valeur entière :");
            operand2 = sc.nextInt();
            System.out.println();
            System.out.println("Le résultat de la soustraction de vos 2 nombres est "+(operand1-operand2)); 
        }
        
        if (operateur == 3){
            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une première valeur entière :");
            operand1 = sc.nextInt();
            System.out.println();

            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une deuxième valeur entière :");
            operand2 = sc.nextInt();
            System.out.println();
            System.out.println("Le résultat de la multiplication de vos 2 nombres est "+(operand1*operand2)); 
        }

        if (operateur == 4){
            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une première valeur entière :");
            operand1 = sc.nextInt();
            System.out.println();

            sc = new Scanner(System.in);
            System.out.println("Veuillez saisir une deuxième valeur entière :");
            operand2 = sc.nextInt();
            System.out.println();
            System.out.println("Le résultat de la divition de vos 2 nombres est "+(operand1/operand2)); 
        }

        
        else {
            System.out.println("Vous n'avez pas rentrer un opérateur compris entre 1 et 5 inclus.");
            System.exit(0);
        }           
        
    }
    
}
