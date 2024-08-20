package poo_ejercicio_48;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase denominada Equipo modela un equipo de ciclismo
 * conformado por una lista de ciclistas. La clase tiene atributos como
 * el nombre del equipo, el país del equipo y el tiempo total acumulado
 * del equipo.
 * @version 1.2/2020
 */
public class Equipo {

    // ATRIBUTOS

    // Define el nombre del equipo de ciclismo
    private String nombre;

    // Define el tiempo total obtenido por el equipo
    private static double totalTiempo;

    // Define el país al que pertenece el equipo
    private String pais;

    // Define una lista de objetos Ciclista
    private List<Ciclista> listaCiclistas;

    // MÉTODOS

    /**
     * Constructor de la clase Equipo
     * @param nombre Parámetro que define el nombre del equipo
     * @param pais Parámetro que define el país del equipo
     */
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0; // Se inicializa el tiempo del equipo en cero
        listaCiclistas = new ArrayList<>(); // Se crea la lista de ciclistas que conforma el equipo
    }

    /**
     * Método que devuelve el nombre del equipo
     * @return El nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de un equipo
     * @param nombre Parámetro que especifica el nombre de un equipo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el país del equipo
     * @return El país del equipo
     */
    private String getPais() {
        return pais;
    }

    /**
     * Método que establece el país de un equipo
     * @param pais Parámetro que especifica el país de un equipo
     */
    private void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Método que añade un ciclista a la lista de ciclistas de un equipo
     * @param ciclista Ciclista a agregar
     */
    void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista); // Se agrega el ciclista a la lista de ciclistas
    }

    /**
     * Método que muestra en pantalla los nombres de los ciclistas que
     * conforman un equipo
     */
    void listarEquipo() {
        // Se recorre la lista de ciclistas y para cada elemento se imprime el nombre del ciclista
        for (Ciclista ciclista : listaCiclistas) {
            System.out.println(ciclista.getNombre());
        }
    }

    /**
     * Método que busca un ciclista ingresado por teclado
     */
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in); // Se solicita texto ingresado por teclado
        String nombreCiclista = sc.next();
        for (Ciclista ciclista : listaCiclistas) {
            // Se obtiene un elemento de la lista
            if (ciclista.getNombre().equals(nombreCiclista)) { // Si el nombre ingresado se encuentra
                System.out.println(ciclista.getNombre());
            }
        }
    }

    /**
     * Método que calcula el tiempo total de un equipo acumulando el
     * tiempo obtenido por cada uno de sus ciclistas
     */
    void calcularTotalTiempo() {
        for (Ciclista ciclista : listaCiclistas) {
            // Se acumula el tiempo del ciclista en el tiempo del equipo
            totalTiempo += ciclista.getTiempoAcumulado();
        }
    }

    /**
     * Método que muestra en pantalla los datos de un equipo
     */
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
}
