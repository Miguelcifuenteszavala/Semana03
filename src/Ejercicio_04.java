import java.util.Scanner;


public class Ejercicio_04 {

    public static void main(String[] args) 
    {
        int aprobados=0;
        int reprobados=0;
        
        float calif=0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        while(i<=7)
        { 
            System.out.println("Mostrar Promedio de cada estudiante: ");
            calif=sc.nextFloat();
            if(calif>=20 && calif<=20)
            {
               
            }
            else if (calif>=11)
            {
                aprobados++;
            }
            else
                reprobados++;
            i++;
            
            
        }
            System.out.println("Alumnos aprovados:"+aprobados);
            System.out.println("Alumnos reprobados:"+reprobados);
            
            
 }
       
}