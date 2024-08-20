package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada Apartaestudio modela un tipo especifico de
 * apartamento que tiene una sola habitacion.
 * @version 1.2/2020
 */
public class Apartaestudio extends Apartamento {

    // ATRIBUTOS
    
    // Atributo que identifica el valor por area de un apartaestudio
    protected static double valorArea = 1500000;

    // MÉTODOS
    
    /**
     * Constructor de la clase Apartaestudio
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de un apartaestudio
     * @param area Parametro que define el area de un apartaestudio
     * @param direccion Parametro que define la direccion donde se encuentra localizado un apartaestudio
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene un apartaestudio
     * @param numeroBaños Parametro que define el numero de baños que tiene un apartaestudio
     */
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        // Invoca al constructor de la clase padre
        // Los apartaestudios tienen una sola habitacion y un solo baño
        super(identificadorInmobiliario, area, direccion, 1, 1);
    }

    /**
     * Metodo que muestra en pantalla los datos de un apartaestudio
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println();
    }
}
