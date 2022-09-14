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
public class EGG_EJ13_GUIA6_TEORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de jugadores de su equipo");
        
        int cantidadJugadores = leer.nextInt();
        
        String[] equipo = new String[cantidadJugadores];
        
        for (int i = 0; i < cantidadJugadores; i++) {
            
            System.out.println("Ingrese nombre del jugador " +(i));
            
            equipo[i] = leer.nextLine();
        }
        
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < cantidadJugadores; i++) {
                    System.out.println(equipo[i]);
        }

    }
    
}
