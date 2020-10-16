import java.util.Scanner;
import java.lang.Math;

public class areaparalelogramo {
    public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        int area,base,altura;

        System.out.print("\t Inserte la base del paralelogramo:  ");
        base=reader.nextInt();
        System.out.print("\t Inserte la altura del paralelogramo: ");
        altura=reader.nextInt();
        
        area=base*altura;
        
        System.out.println("\n \t  El área del paralelogramo es de:  "+area+ "  cm");
    }
}
