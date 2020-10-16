import java.util.Scanner;
import java.lang.Math;

public class ecuacionCuadratica {
    public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double A,B,C,Formula1,Formula2;

        System.out.print("\t Inserte valor de A: ");
        A=reader.nextDouble();
        System.out.print("\t Inserte valor de B: ");
        B=reader.nextDouble();
        System.out.print("\t Inserte valor de C: ");
        C=reader.nextDouble();
        
        Formula1=(-B+Math.sqrt(B*B-4*A*C))/(2*A);
        Formula2=(-B-Math.sqrt(B*B-4*A*C))/(2*A);
        
        System.out.println("\n \t El resultado de la ecuación cuadratica es de: "+Formula1+"\n \t El otro posible resultado es: "+Formula2);
    }
}
