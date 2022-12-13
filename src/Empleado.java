import java.util.Scanner;

/*Implementar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades
un método que cargue los datos personales y otro que los imprima. Plantear una segunda clase Empleado que herede
de la clase Persona. Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear un objeto de la clase Empleado y
llamar a sus métodos (Añadir el enlace a su repositorio).*/
public class Empleado extends Persona{
    private double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public void cargarSueldo(){
        Scanner XD = new Scanner(System.in);
        System.out.print("-Ingrese el sueldo del empleado: ");
        sueldo=XD.nextDouble();
    }

    public void imprimirSueldo(){
        System.out.println("El sueldo es:"+sueldo);
    }
}
