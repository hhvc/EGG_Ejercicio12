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
public class Egg_Ejj11Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores enteros:");
        int num1 = leer.nextInt(), num2 = leer.nextInt();
        String salida = "n";
        // Menu
        do{
            System.out.println("");
            System.out.println("A continuación, seleccione la operación aritmetica a realizar:");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("");
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                int suma = (num1 + num2);
                System.out.println("La suma total es:" + suma);
                System.out.println("");
                break;
            case 2:
                int resta = (num1 - num2);
                System.out.println("La resta total es:" + resta);
                System.out.println("");
                break;
            case 3:
                int multi = num1 * num2;
                System.out.println("La multiplicación es: " + multi);
                System.out.println("");
                break;
                        
             case 4:
                int div = (num1 / num2);
                System.out.println("La división de ambos valores es:" + div);
                System.out.println("");
                break;
            case 5:
                System.out.println("Está seguro que desea salir S/N ");
                salida = leer.next();
                if ("s".equals(salida)){
                System.out.println("Hasta luego");
                System.out.println("Fin del programa");
                System.out.println("");
                break;                        
                    }
            default:
                System.out.println("La opción ingresada no es correcta.");
        }
        } while (!salida.equals("s"));
    }
}

        
        
