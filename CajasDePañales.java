
import java.util.Scanner;



public class CajasDePañales {
     public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        float cajas,produccion;

        System.out.print("\t Inserte la producción de pañales del día: ");
        produccion=reader.nextFloat();
                
        cajas=produccion/20;
                        
        System.out.println("\n \t Las cajas necesarias son de: "+cajas);
    }
}
