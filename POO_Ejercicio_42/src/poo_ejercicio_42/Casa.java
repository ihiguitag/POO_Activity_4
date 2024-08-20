package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada Casa modela un tipo especifico de inmueble
 * destinado para la vivienda con atributos como el numero de pisos
 * que tiene una casa.
 * @version 1.2/2020
 */
public class Casa extends InmuebleVivienda {

    // ATRIBUTOS

    // Atributo que identifica el numero de pisos que tiene una casa
    protected int numeroPisos;

    // MÉTODOS

    /**
     * Constructor de la clase Casa
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de una casa
     * @param area Parametro que define el area de una casa
     * @param direccion Parametro que define la direccion donde se encuentra localizada una casa
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene una casa
     * @param numeroBaños Parametro que define el numero de baños que tiene una casa
     * @param numeroPisos Parametro que define el numero de pisos que tiene una casa
     */
    public Casa(int identificadorInmobiliario, int area, String direccion,
                int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    /**
     * Metodo que muestra en pantalla los datos de una casa
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Numero de pisos = " + numeroPisos);
    }
}
