package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada Apartamento modela un tipo de inmueble
 * especifico destinado para la vivienda.
 * @version 1.2/2020
 */
public class Apartamento extends InmuebleVivienda {

    // MÉTODOS

    /**
     * Constructor de la clase Apartamento
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de un apartamento
     * @param area Parametro que define el area de un apartamento
     * @param direccion Parametro que define la direccion donde se encuentra localizado un apartamento
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene un apartamento
     * @param numeroBaños Parametro que define el numero de baños que tiene un apartamento
     */
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    /**
     * Metodo que muestra en pantalla los datos de un apartamento
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
    }
}
