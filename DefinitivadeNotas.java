
import java.util.Scanner;


public class DefinitivadeNotas {
     public static void main (String[] args) {
        
        Scanner reader = new Scanner(System.in);
        
        Double Matematicas,mat1,mat2,mat3,Fisica,fis1,fis2,fis3, Quimica,qui1,qui2, defmat, deffis, defqui, promedioDeNotas ;

        System.out.print("\t Para conocer tu promedio general digita las notas del examen  \n\t de cada materia  \n\n\t Matemáticas  : ");
        Matematicas=reader.nextDouble();
        System.out.print("\n\t Física  : ");
        Fisica=reader.nextDouble();
        System.out.print("\n\t Química : ");
        Quimica=reader.nextDouble();
        System.out.print("\n\n\t Digita las notas de las actividades  \n\t de cada materia  \n\n\t Matemáticas Actividad #1  : ");
        mat1=reader.nextDouble();
        System.out.print("\t Matemáticas Actividad #2  : ");
        mat2=reader.nextDouble();
        System.out.print("\t Matemáticas Actividad #3  : ");
        mat3=reader.nextDouble();
        System.out.print("\n\t Física Actividad #1  : ");
        fis1=reader.nextDouble();
        System.out.print("\t Física Actividad #2  : ");
        fis2=reader.nextDouble();
        System.out.print("\t Física Actividad #3  : ");
        fis3=reader.nextDouble();
        System.out.print("\n\t Química Actividad #1  : ");
        qui1=reader.nextDouble();
        System.out.print("\t Química Actividad #2  : ");
        qui2=reader.nextDouble();
        
        defmat=Matematicas*0.90+((mat1+mat2+mat3)/3)+0.10;
        deffis=Fisica*0.80+((fis1+fis2+fis3)/3)+0.20;
        defqui=Quimica*0.85+((qui1+qui2)/2)+0.15;
        
        promedioDeNotas=(defmat+deffis+defqui)/3;
                
        System.out.println("\n\n\t Su promedio para cada materia quedo así \n\n\t Matemáticas: "+defmat+"\n\t Física:     "+deffis+"\n\t Química:    "+defqui+"\n \t Su promedio de Notas General es de: "+promedioDeNotas);
    }
}
