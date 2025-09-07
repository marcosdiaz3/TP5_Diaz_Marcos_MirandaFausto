package punto3;

import java.util.Scanner;

public class Punto3 {
  public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar un numero entre el 0 y 10: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("error. el numero debe ser entre 0 y el 10");
        } else {
            int factorial = 1;
            int e = numero;

            while (e > 1) {
                factorial = factorial * e;
                e--;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        sc.close();
    }

}