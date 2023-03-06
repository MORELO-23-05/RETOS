import java.util.Random;
import java.util.Scanner;

public class reto3 {
    public static void main(String[] args){

        int saldo;
        int apuesta;
        int resultado;
        int seleccion;
        String nombre;
        

        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite su nombre: ");
        nombre = lectura.next();
        
        System.out.print("Introduce tu saldo inicial: ");
        saldo = lectura.nextInt();

         
            System.out.println("Tu saldo actual es: " + saldo);
            System.out.print("Elige cara (0) o sello (1) (2 para salir): ");
            seleccion = lectura.nextInt();

            if (seleccion == 2) {
            }

            System.out.print("Introduce la cantidad que quieres apostar: ");
            apuesta = lectura.nextInt();

            if (apuesta > saldo) {
                System.out.println("No tienes suficiente saldo para realizar esa apuesta.");
            }

            resultado = random.nextInt(2); // generar un número aleatorio entre 0 y 1

            if (resultado == 0) {
                System.out.println("Ha salido cara.");
            } else {
                System.out.println("Ha salido sello.");
            }

            if (resultado == seleccion) {
                System.out.println("¡Has ganado!");
                saldo += apuesta; // incrementar el saldo si gana
            } else {
                System.out.println("Lo siento, has perdido.");
                saldo -= apuesta; // disminuir el saldo si pierde
            }

            if (saldo <= 0) {
                System.out.println("Has perdido todo tu dinero.");
                
            }
        

        System.out.println("Gracias por jugar."+nombre +" Tu saldo final es: "+ saldo);
        
        lectura.close();
    }

}