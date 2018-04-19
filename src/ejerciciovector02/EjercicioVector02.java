
package ejerciciovector02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: Ejercicio Vector 02
 * Version: 1.2
 * Fecha: 18/04/18
 * CopyRight: Home
 * @author Roxana
 */
public class EjercicioVector02 {

    public static void main(String[] args) 
    {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes a evaluar"));
        
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat df = new DecimalFormat("#.##");
        
        String carnet[] = new String[n];
        String nombre[] = new String[n];
        int edad[] = new int[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];
        double promE[] = new double[n];
        double promG=0;
        int promMayores=0;
        int reprobados=0;
        
        for (int i = 0; i <n; i++) 
        {
           int it=i+1;
            
           carnet[i]=JOptionPane.showInputDialog("Ingrese su carnet: ");
           nombre[i]=JOptionPane.showInputDialog("Ingrese su nombre: ");
           edad[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
           nota1[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1: "));
           nota2[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2: "));
           promE[i]=(nota1[i]+nota2[i])/2;
           
           if(nota1[i]<=10 && nota2[i]<=10)
           {
                promG=(promG+promE[i])/2;
                JOptionPane.showMessageDialog(null, "INFORMACION GENERAL"+it+
                   "\n Nombre: "+nombre[i]+
                   "\n Carnet: "+carnet[i]+
                   "\n Edad: "+edad[i]+
                   "\n Nota 1: "+df.format(nota1[i])+
                   "\n Nota 2: "+df.format(nota2[i])+
                   "\n Promedio: "+df.format(promE[i]));
                
                if(promE[i]>promG)
                {
                    promMayores++;
                }
                else if(promE[i]<7)
                {
                    reprobados++;
                }
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Ingrese una nota correcta"+1);
           }
        }
        JOptionPane.showMessageDialog(null,"promedio general de estudiantes: "+df.format(promG)+
                "\n Promedios superiores al global: "+promMayores+
                        "\n Alumnos reprobados: "+reprobados);
        
    }
    
}
