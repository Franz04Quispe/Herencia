import java.util.Scanner;
/*Implementar una clase Persona que tenga como atributos el nombre y la edad. Definir como responsabilidades
un método que cargue los datos personales y otro que los imprima. Plantear una segunda clase Empleado que herede
de la clase Persona. Añadir un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear un objeto de la clase Empleado y
llamar a sus métodos (Añadir el enlace a su repositorio).*/
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void registroPersona(){
        Scanner XD = new Scanner(System.in);
        System.out.print("-Ingrese el nombre: ");
        nombre=XD.nextLine();
        System.out.print("-Ingrese la edad: ");
        edad=XD.nextInt();
    }
    public void imprimirPersona(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
    public static void main(String[] args) {
        System.out.println("PROGRAMACION III-EXAMEN FINAL");
        Persona p=new Persona();
        Empleado e=new Empleado();
        p.registroPersona();
        p.imprimirPersona();
        e.cargarSueldo();
        e.imprimirSueldo();
    }

}
