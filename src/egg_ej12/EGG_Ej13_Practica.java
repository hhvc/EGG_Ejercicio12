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
public class EGG_Ej13_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Haremos un cuadrado de asteriscos.");
        System.out.println("¿De cuántos asteriscos por lado lo quieres?");
        
        int N = leer.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < N; i++) {           
            for (int j = 0; j < N; j++) {
                if (i==0 || N-1==i || 0==j || N-1==j) {
                    System.out.print("* ");
                } else  System.out.print("  ");
            }
            System.out.println("");  
        }
    }
}
