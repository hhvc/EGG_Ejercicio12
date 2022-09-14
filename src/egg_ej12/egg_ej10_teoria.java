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
public class egg_ej10_teoria {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, num3, num4;
        
        System.out.println("Por favor, ingrese el primer número");
        
        num1= leer.nextInt();
        
        System.out.println("Ingrese el 2do número");
        
        num2 = leer.nextInt();
        
        System.out.println("ingrese el 3er número");
        
        num3 = leer.nextInt();
        
        System.out.println("Ingrese el 4to y último número");
        
        num4 = leer.nextInt();
        
        System.out.print(num1 + " ");
        
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
           System.out.print(num2 + " ");
        
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
                System.out.print(num3 + " ");
        
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
                System.out.print(num4 + " ");
        
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }
    
}
