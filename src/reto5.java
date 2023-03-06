import java.util.Scanner;

public class reto5 {

    public static void main(String[] args) {

        int cantidadProducto = 0;
        int precioProducto = 0; 
        double valorCompra = 0;

        Scanner lectura = new Scanner(System.in);
    
        System.out.println("Ingrese la cantidad de productos a comprar:");
        cantidadProducto = lectura.nextInt();

        for (int i = 0; i < cantidadProducto; i++) {

            System.out.println("Digite el nombre del producto:");
            String nombreProducto = lectura.next();

            System.out.println("Su producto es: " + nombreProducto);
            System.out.println("Ingrese el valor del producto:");
            precioProducto = lectura.nextInt();

            valorCompra += precioProducto;
        }

        valorCompra = valorCompra * 19;
        System.out.println("El total de su compra es: " + valorCompra);

        lectura.close();
    }
}