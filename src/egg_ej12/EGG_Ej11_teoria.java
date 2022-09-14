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
public class EGG_Ej11_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Favor, ingrese una frace. Solo leeremos hasta el primer punto");
       
        String frase = leer.nextLine();
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(frase);
        
//        String fraseOk = amasadora(frase);
        
        System.out.println(amasadora(frase));
    }
    
    public static String amasadora (String caracteres){
    
        String fraseValidada = "";
        
        for (int i = 0; i < caracteres.length()-1; i++) {
            
            switch (caracteres.charAt(i)) {
                case 'a':
                    fraseValidada = fraseValidada.concat("@");
                    break;
                case 'e':
                    fraseValidada = fraseValidada.concat("#");
                    break;
                    
                case 'i':
                    fraseValidada = fraseValidada.concat("$");
                    break;
                    
                case 'o':
                    fraseValidada = fraseValidada.concat("&");
                    break;
                    
                case 'u':
                    fraseValidada = fraseValidada.concat("*");
                    break;
                
                case '.':
                    fraseValidada = fraseValidada.concat(".");
                    return fraseValidada;
                    
                default:
                    fraseValidada = fraseValidada.concat(caracteres.substring(i, i+1));
            }
        }
        return fraseValidada;
    }
}