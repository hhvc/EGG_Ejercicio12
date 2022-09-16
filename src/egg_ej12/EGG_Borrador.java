/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_ej12;

import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class EGG_Borrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase para imprimir con formato");
        String frase = leer.nextLine();        
        System.out.println("");
        
        ImprimirConAsteriscos(frase);
        System.out.println("");
        System.out.println("Felicitaciones, Ud. eligió la opción " + adornarFrase(frase));
        
}
    
    public static void ImprimirConAsteriscos (String fraseAImprimir){
        
        for (int i = 0; i < fraseAImprimir.length()+4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.println("* " + fraseAImprimir + " *");
        
        for (int i = 0; i < fraseAImprimir.length()+4; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static int adornarFrase(String frase) {
        
        ImprimirConAsteriscos("Elija qué adorno quiere usar");
        ImprimirConAsteriscos("Las opciones son: 1 para usar $ o 2 para usar #");
        Scanner leer = new Scanner(System.in); 
        int opcion = leer.nextInt();
        System.out.println("");
        System.out.println("El resultado es: ");
        
        switch (opcion){
            case (1):
                for (int i = 0; i < frase.length()+4; i++) {
                    System.out.print("$");
                }
                System.out.println("");
                System.out.println("$ " + frase + " $");
                for (int i = 0; i < frase.length()+4; i++) {
                    System.out.print("$");
                }
                System.out.println("");
                System.out.println("");
                return opcion;
                
            case (2):
                for (int i = 0; i < frase.length()+4; i++) {
                    System.out.print("#");
                }
                System.out.println("");
                System.out.println("# " + frase + " #");
                for (int i = 0; i < frase.length()+4; i++) {
                    System.out.print("#");
                }
                System.out.println("");
                System.out.println("");
                return opcion;
                
            default:
                System.out.println("Metiste cualquier cosa, menos 1 ó 2");
    }
 return opcion;
    
}
}