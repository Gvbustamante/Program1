
import java.util.Scanner;
import java.lang.Math;

public class NumerodeCDs {
    public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double numCDs,discoDuro,MB;

        System.out.print("\t Inserte los GB de la información  \n\t contenida en el Disco duro: ");
        discoDuro=reader.nextDouble();
                
        MB=discoDuro*1024;
        numCDs=MB/700;
                
        System.out.println("\n \t CDs Necesarios: "+numCDs);
    }
}
