package punto5.Model;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private int dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;


    // costr vacio
    public Persona() {}

//constr con parametros
public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;}

//constr inicializado
    public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Tucuman"; }

    
    //getter y setter
     public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    

    // Metodo para calcular la edad
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Metodo para verificar si es mayor de edad
     public boolean mayorDeEdad() {
        if (calcularEdad() >= 18) {
            System.out.println("La persona es mayor de edad.");
            return true;
        } else {
            System.out.println("La persona NO es mayor de edad.");
            return false;
        }
     }

    // Metodo para mostrar los datos
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());

        mayorDeEdad();
    }

}