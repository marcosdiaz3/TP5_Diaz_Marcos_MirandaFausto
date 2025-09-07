package punto5;

import punto5.Model.Persona;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    // Objeto con constructor vacío
    Persona persona1 = new Persona();
    persona1.setDni(43551233);  
    persona1.setNombre("Pedro");
    persona1.setFechaNacimiento(LocalDate.of(2001, 5, 11));
    persona1.setProvincia("Tucuman");

    System.out.println("Persona 1");
    persona1.mostrarDatos();

    // Objeto con constructor parametrizado
    Persona persona2 = new Persona(39654321, "Joaco", LocalDate.of(1991, 2, 3), "Cordoba");

    System.out.println("Persona 2");
    persona2.mostrarDatos();

    // Objeto con constructor que inicializa
    Persona persona3 = new Persona(40223344, "Oli", LocalDate.of(2008, 6, 11));

    System.out.println("Persona 3");
    persona3.mostrarDatos();

    // Prueba
    Persona persona4 = new Persona(40223342, "Mabel", LocalDate.of(2005, 2, 14));

    System.out.println("Persona 4");
    persona4.mostrarDatos();
}
}