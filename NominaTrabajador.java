import java.util.Scanner;
import java.lang.Math;

public class NominaTrabajador {
     public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        double salario, sueldoBase, ventas, comisiones, pension,salud,deducciones;

        System.out.print("\t Inserte el sueldo base del trabajador: ");
        sueldoBase=reader.nextDouble();
        System.out.print("\t Inserte las ventas que genero en el mes: ");
        ventas=reader.nextDouble();
        
        comisiones=ventas*0.07;
        pension=sueldoBase*0.08;
        salud=sueldoBase*0.04;
        deducciones=pension+salud;
        salario=sueldoBase+comisiones-deducciones;
        
        System.out.println("\n \t La nomina del trabajador es de: \n  \t "+salario+"  pesos \n Sus comisiones fueron de: "+comisiones+"  pesos \n sus deducciones son de: "+deducciones+"  pesos \n");
    }
    
}
