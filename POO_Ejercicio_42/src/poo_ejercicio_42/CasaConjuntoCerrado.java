package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada CasaConjuntoCerrado modela un tipo
 * especifico de casa urbana que se encuentra en un conjunto cerrado
 * con atributos como el valor por area, valor de la administracion y
 * valores booleanos para especificar si tiene piscina y campos deportivos.
 * @version 1.2/2020
 */
public class CasaConjuntoCerrado extends CasaUrbana {

    // ATRIBUTOS
    
    // Define el valor por area de una casa en conjunto cerrado
    protected static double valorArea = 2500000;
    // Define el valor de administracion de una casa en conjunto cerrado
    protected int valorAdministracion;
    // Define si una casa en conjunto cerrado tiene piscina
    protected boolean tienePiscina;
    // Define si una casa en conjunto cerrado tiene campos deportivos
    protected boolean tieneCamposDeportivos;

    // MÉTODOS
    
    /**
     * Constructor de la clase CasaConjuntoCerrado
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de una casa en conjunto cerrado
     * @param area Parametro que define el area de una casa en conjunto cerrado
     * @param direccion Parametro que define la direccion donde se encuentra localizada una casa en conjunto cerrado
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene una casa en conjunto cerrado
     * @param numeroBaños Parametro que define el numero de baños que tiene una casa en conjunto cerrado
     * @param numeroPisos Parametro que define el numero de pisos que tiene una casa en conjunto cerrado
     * @param valorAdministracion Parametro que define el valor de administracion para una casa en conjunto cerrado
     * @param tienePiscina Parametro que define si una casa en conjunto cerrado tiene o no piscina
     * @param tieneCamposDeportivos Parametro que define si una casa en conjunto cerrado tiene o no campos deportivos
     */
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    /**
     * Metodo que muestra en pantalla los datos de una casa en conjunto cerrado
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Valor de la administracion = $" + valorAdministracion);
        System.out.println("¿Tiene piscina? = " + tienePiscina);
        System.out.println("¿Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
}
