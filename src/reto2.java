import java.util.Scanner;

public class reto2 {
    public static void main(String[] args){
      
        double pesoBebe;
        double mesesBebe;
        double dosisVacuna;
        String nombreTutor;
        String nombreEnfermera;

    
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el nombre del tutor legal: ");
        nombreTutor = lectura.nextLine();

        System.out.println("Ingrese el nombre del enfermero(a) encargado de la vacunación:");
        nombreEnfermera = lectura.next();

        System.out.println("Ingrese el peso del bebé:");
        pesoBebe = lectura.nextFloat();

        System.out.println("Ingrese cuantos meses tiene el bebé:");
        mesesBebe = lectura.nextDouble();

   
        dosisVacuna = ((pesoBebe + 10)/(mesesBebe * 10)) * 8;

        
        System.out.println("Los meses del bebé son: " + mesesBebe);
        System.out.println("El bebé pesa: " + pesoBebe + " Kg");
        System.out.println("El tutor del bebé es: " + nombreTutor);
        System.out.println("El enfermero (a) de la dósis es: " + nombreEnfermera);
        System.out.println("La cantidad de dosis a aplicar es: " + dosisVacuna + " Mlg ");
        
 
        lectura.close();
    }
}
