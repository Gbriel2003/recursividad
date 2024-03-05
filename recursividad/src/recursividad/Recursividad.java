package recursividad;

import java.util.Scanner;

public class Recursividad {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la tabla a multiplicar : ");
        int tabla = entrada.nextInt();
        multiplicacion(tabla, 1);
    }
    public static void multiplicacion(int tabla, int numero) {
        if (numero > 12) {
        } 
        else {
            System.out.println(tabla + " * " + numero + " = " + tabla * numero);
            multiplicacion(tabla, numero + 1);
            }
        
     }
}
       
