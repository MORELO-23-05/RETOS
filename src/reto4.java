import java.util.Random;
import java.util.Scanner;

public class reto4 {
    public static void main(String[] args){

        int saldo;
        int apuesta;
        int resultado;
        int seleccion;
        String nombre;

        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingresa tu nombre");
        nombre = lectura.nextLine();
        
        System.out.print("Introduce tu saldo inicial: ");
        saldo = lectura.nextInt();

       
            System.out.println("Tu saldo actual es: " + saldo);
            System.out.println("ingrese su eleccion (1 piedra) (2 papel) (3 tijeras)");   
            seleccion = lectura.nextInt();         

            if (seleccion == 1) {
                System.out.println("elegiste piedra");
                
            }else if(seleccion == 2){
                System.out.println("elegiste papel");
            }else{
                System.out.println("elegiste tijeras");
            }


            System.out.print("Introduce la cantidad que quieres apostar: ");
            apuesta = lectura.nextInt();

            if (apuesta > saldo) {
                System.out.println("No tienes suficiente saldo para realizar esa apuesta.");
            }

            resultado = random.nextInt(3)+1;
            switch (resultado) {
    case 1:
        System.out.println("La maquina eligio piedra");
             break;
    case 2:
    System.out.println("La maquina eligio papel");
            break;
    case 3:
    System.out.println("La maquina eligio tijeras");
            break;

    default:
             break;
}
            
            if ( resultado ==  seleccion) {
              System.out.println("Has empatado");
            } else if(seleccion ==1 && resultado == 3 || seleccion == 2 && resultado == 1 || seleccion == 3 && resultado == 2){
                
                saldo = saldo + apuesta ;
                System.out.println("Has ganado");
            }else{
                System.out.println("Perdiste");
                saldo = saldo - apuesta;
            }

            System.out.println("Hola "+ nombre +" Tu saldo final es de: " + saldo);

            if (saldo <= 0) {
                System.out.println("Has perdido todo tu dinero.");
                
            }
        
        lectura.close();
    }

}
