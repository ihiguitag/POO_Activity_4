package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada InmuebleVivienda modela un inmueble
 * destinado para la vivienda con atributos como el numero de
 * habitaciones y el numero de baños que posee.
 * @version 1.2/2020
 */
public class InmuebleVivienda extends Inmueble {

    // ATRIBUTOS

    // Atributo que identifica el numero de habitaciones de un inmueble para vivienda
    protected int numeroHabitaciones;
    
    // Atributo que identifica el numero de baños de un inmueble para vivienda
    protected int numeroBaños;

    // MÉTODOS

    /**
     * Constructor de la clase InmuebleVivienda
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de un inmueble para la vivienda
     * @param area Parametro que define el area de un inmueble para la vivienda
     * @param direccion Parametro que define la direccion donde se encuentra localizado un inmueble para la vivienda
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene un inmueble para la vivienda
     * @param numeroBaños Parametro que define el numero de baños que tiene un inmueble para la vivienda
     */
    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    /**
     * Metodo que muestra en pantalla los datos de un inmueble para la vivienda
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Numero de habitaciones = " + numeroHabitaciones);
        System.out.println("Numero de baños = " + numeroBaños);
    }
}
