import java.util.Scanner;
import java.lang.Math;

public class areacirculo {
    public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double area,radio;

        System.out.print("\t Inserte el radio del círculo: ");
        radio=reader.nextDouble();
        
        area=Math.PI*Math.pow(radio,2);
        
        System.out.println("\n \t El área del círculo es: \n  \t "+area+ "  cm" );
    }
    
}