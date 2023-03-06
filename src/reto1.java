import java.util.Scanner;

public class reto1 {
    public static void main(String[] args){

        double tempF = 0;
        double tempC = 0;
        double tempK = 0;

        Scanner lectura = new Scanner(System.in);
    
        System.out.print("Ingresa la temperatura para precalentar el horno en grados Fahrenheit: ");
        tempF = lectura.nextDouble();
        
        // Aplicamos la fórmula de conversión
        tempC = (tempF - 32) / 1.8;
        tempK = (tempF + 459.67) * 5 / 9;
        
        System.out.println(tempF + " grados Fahrenheit equivale a " + tempC + "  en grados Centígrados.");
        System.out.println("grados Fahrenheit equivale a "+ tempK +" en grados Kelvins");

        lectura.close();
}
}