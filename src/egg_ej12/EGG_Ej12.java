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
public class EGG_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num1= leer.nextInt();
        System.out.println("ingrese otro número");
        int num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
        
        System.out.println("Fin del programa");

    }
    
    public static void esMultiplo(int a, int b){
        
        if (a % b == 0 ){
            
            System.out.println("Es múltiplo: " + a + "/" + b + " = " + a/b);
        }
        else { 
            System.out.println("NO es múltiplo");
        }
        
    }
}
