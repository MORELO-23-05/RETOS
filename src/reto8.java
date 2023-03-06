import java.util.Random;
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {

        int numeroAleatorio = 0;
        int intentos = 0;
        boolean adivinado = false;
        int numeroDeI = 0;
        int numeroIngresado = 0;

        Scanner lectura = new Scanner(System.in);
        Random random = new Random();
        numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("Adivina un número del 1 al 100:");
        System.out.println("Ingrese el número de intentos que deseas tener:");
        numeroDeI = lectura.nextInt();
        
        while (!adivinado && intentos < numeroDeI) {
            numeroIngresado = lectura.nextInt();
            intentos++;

            if (numeroIngresado == numeroAleatorio) {
                System.out.println("Felicidades. Adivinaste el número en " + intentos + " intentos.");
                adivinado = true;
            } else if (numeroIngresado < numeroAleatorio) {
                System.out.println("El número es mayor que " + numeroIngresado);
            } else {
                System.out.println("El número es menor que " + numeroIngresado);
            }
        }   

        if (!adivinado) {
            System.out.println("Lo siento, has superado el número máximo de intentos.");
            System.out.println("El número era: " + numeroAleatorio);
        }

        lectura.close();
    }
}
