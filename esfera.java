import java.util.Scanner;
import java.lang.Math;

public class esfera {
    public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double area,radio;

        System.out.print("\t Inserte el radio de la Esfera: ");
        radio=reader.nextDouble();
        
        area=Math.PI*radio*Math.pow(radio,2);
        
        System.out.println("\n\t La superficie de la Esfera es de: \n\t " +area+ "  cm");
    }
}
