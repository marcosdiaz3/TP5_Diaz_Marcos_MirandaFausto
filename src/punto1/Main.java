package punto1;

public class Main {
    public static void main(String[] args) throws Exception {

    
        // Variables
        String pais = "Argentina";
        int edad = 23;
        double alturaEdif= 35.7;
        double precioProduct= 2499.99;
        String telefono = "3814567890";
        double coseno = Math.cos(0.5);

         // mostrar variables
        System.out.println("País: " + pais);
        System.out.println("Edad: " + edad);
        System.out.println("Altura del edificio: " + alturaEdif);
        System.out.println("Precio del producto: " + precioProduct);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Coseno(0.5): " + coseno);

        // sacar promedio
        int n1 = 4;
         int n2 = 5;
          int n3 = 1;
           int n4 = 20;
           int  n5 = 9;
        double promedio = (n1 + n2 + n3 + n4 + n5) / 5.0;

        System.out.println("Valores: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);
        System.out.println("El promedio es: " + promedio);
    }
}