import java.util.Scanner;
import java.util.Random;

public class reto6 {
    public static void main(String[] args) {

        int vidas = 3;
        double dinero = 0;
        String respuesta;
        int resultado = 0;
        String nombre;
        double sumaGanada = 0;
        double sumaPerdida = 0;

        Scanner lectura = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese su nombre");
        nombre = lectura.next();

        System.out.println("ingrese la cantidad de dinero que desea apostar (minimo 10000)");
        dinero = lectura.nextDouble();
       

       while(vidas > 0 && dinero > 0) {
            System.out.println("¿Cara o sello? (c/s)");
            respuesta = lectura.next();
            if (respuesta.equals("c") ||respuesta.equals("s")) {
                resultado = rand.nextInt(2); 

                if ((respuesta.equals("c") && resultado == 0) || (respuesta.equals("s") && resultado == 1)) {
                    System.out.println("¡Ganaste!");
                    sumaGanada = 5000;
                    dinero = sumaGanada + dinero; 
                } else {
                    System.out.println("¡Perdiste!");
                    sumaPerdida = 10000;
                    dinero = dinero - sumaPerdida;
                    vidas--;
                }if (resultado ==0) {
                    System.out.println("Cayo cara");
                }else{
                    System.out.println("Cayo sello");
                }
                System.out.println("Dinero: $" + dinero);
                System.out.println("Vidas: " + vidas);
            }else {
                System.out.println("Entrada no válida. Inténtalo de nuevo.");
            }if (dinero <=0) {
                System.out.println("Ya no tienes dinero para apostar");
            }
        }
        System.out.println("Game over. "+nombre+" Quedaste con: $" + dinero + ".");
        lectura.close();
        }  
    }

