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
public class EGG_Ej17_Java_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Favor, ingrese la cantidad de elementos de su vector");
        int qElementos=leer.nextInt();
        int[] miVector = new int[qElementos];
        miVector = rellenarVectorAleatorio(qElementos);
        contarDigitosDelVector(miVector, qElementos);
    }
    
    public static int[] rellenarVectorAleatorio(int qElementos){
        int[] miVector = new int[qElementos];
        for (int i = 0; i < qElementos; i++) {
            miVector[i]= ((int) Math.floor(Math.random()*11000));
        }
        return  miVector;
    }
    
    public static void contarDigitosDelVector(int[] miVector, int qElementos){
        int qNrosCon1Digito = 0;
        int qNrosCon2Digitos = 0;
        int qNrosCon3Digitos = 0;
        int qNrosCon4Digitos = 0;
        int qNrosCon5Digitos = 0;
        System.out.println("");
        System.out.println("Vector ingresado:");
        for (int i = 0; i < qElementos; i++) {
            System.out.print("["+miVector[i]+"]");
        }
        for (int i = 0; i < qElementos; i++) {
            switch (Integer.toString(miVector[i]).length()){
                case 1:
                    qNrosCon1Digito++;
                    break;
                case 2: 
                    qNrosCon2Digitos++;
                    break;
                case 3:
                    qNrosCon3Digitos++;
                    break;
                case 4:
                    qNrosCon4Digitos++;
                    break;
                case 5:
                    qNrosCon5Digitos++;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Apareci?? un n??mero de m??s de 5 d??gitos");
                    System.out.println("");
            }
        }
            System.out.println("");
            System.out.println("En este vector encontramos; ");
            System.out.println(qNrosCon1Digito + " n??meros con un d??gito");
            System.out.println(qNrosCon2Digitos + " n??meros con dos d??gitos");
            System.out.println(qNrosCon3Digitos + " n??meros con tres d??gitos");
            System.out.println(qNrosCon4Digitos + " n??meros con cuatro d??gitos");
            System.out.println(qNrosCon5Digitos + " n??meros con cinco d??gitos");
    }
}