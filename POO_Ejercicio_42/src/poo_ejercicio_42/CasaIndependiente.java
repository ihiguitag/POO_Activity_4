package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada CasaIndependiente modela un tipo especifico
 * de casa urbana que no esta en conjunto cerrado y es completamente
 * independiente de otras casas. Tiene un atributo estatico para
 * especificar un valor del area del inmueble.
 * @version 1.2/2020
 */
public class CasaIndependiente extends CasaUrbana {

    // ATRIBUTOS
    
    // Atributo que identifica el valor por area de una casa independiente
    protected static double valorArea = 3000000;

    // MÉTODOS

    /**
     * Constructor de la clase CasaIndependiente
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de una casa independiente
     * @param area Parametro que define el area de una casa independiente
     * @param direccion Parametro que define la direccion donde se encuentra localizada una casa independiente
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene una casa independiente
     * @param numeroBaños Parametro que define el numero de baños que tiene una casa independiente
     * @param numeroPisos Parametro que define el numero de pisos que tiene una casa independiente
     */
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }

    /**
     * Metodo que muestra en pantalla los datos de una casa independiente
     */
    @Override
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println();
    }
}
