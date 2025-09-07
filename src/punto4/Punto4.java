package punto4;
import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero entre 1 y 9 para ver su tabla de multiplicar: ");

        if (sc.hasNextInt()) {
        int numero = sc.nextInt();
        
        if (numero < 1 || numero > 9) {
            System.out.println("error. el numero debe estar entre 1 y 9 para que se vea su tabla de multiplicar");
        } else {
            construirTablaDelNroIngresado(numero);
        } 
        } else {
            System.out.println("error. Debe ser un numero entre 1 y 9 para que se vea su tabla de multiplicar");
        }


        sc.close();
    }
 
    public static void construirTablaDelNroIngresado(int e) {
        System.out.println("Tabla de Multiplicar por " + e);
        for(int i = 1; i <= 10; i++){
            System.out.println(e + " X " + i + " = " + e*i);
        }
    }
}