/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5). 
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

   
    public static void main(String[] args) {
        
               Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en °C ");

        float temp = leer.nextFloat();

        float F = 32 + (9 * temp / 5);
        
        System.out.println("La temperatura convertida es:" + F + " °F");

    }

}
