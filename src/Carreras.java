
/**
 *
 * @author Nikos
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carreras {
    private String categoria;
    private String equipo;
    private String circuito;
    
    public Carreras(String categoria, String equipo, String circuito) {
        this.categoria = categoria;
        this.equipo = equipo;
        this.circuito = circuito;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public String getEquipo() {
        return equipo;
    }
    
    public String getCircuito() {
        return circuito;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carreras> carreras = new ArrayList<>();
        
        // Crear 5 objetos con sus valores
        carreras.add(new Carreras("Fórmula 1", "Mercedes", "Monaco"));
        carreras.add(new Carreras("NASCAR", "Chevrolet", "Daytona"));
        carreras.add(new Carreras("Rally", "Toyota", "Monte Carlo"));
        carreras.add(new Carreras("IndyCar", "Honda", "Indianapolis"));
        carreras.add(new Carreras("GT", "Ferrari", "Spa-Francorchamps"));
        
        // Pedir al usuario que cree un objeto de la clase
        System.out.println("Ingrese los datos de una carrera:");
        System.out.print("Categoría: ");
        String categoria = scanner.nextLine();
        System.out.print("Equipo: ");
        String equipo = scanner.nextLine();
        System.out.print("Circuito: ");
        String circuito = scanner.nextLine();
        Carreras carrera = new Carreras(categoria, equipo, circuito);
        carreras.add(carrera);
        
        // Imprimir la lista de carreras
        System.out.println("\nLista de carreras:");
        for (Carreras c : carreras) {
            System.out.println(c.getCategoria() + " - " + c.getEquipo() + " - " + c.getCircuito());
        }
    }
}
