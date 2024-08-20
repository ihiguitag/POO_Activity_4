package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada CasaRural modela un tipo especifico de casa
 * ubicada en el sector rural.
 * @version 1.2/2020
 */
public class CasaRural extends Casa {

    // ATRIBUTOS

    // Atributo que identifica el valor por area para una casa rural
    protected static double valorArea = 1500000;

    // Atributo que identifica la distancia a la que se encuentra la casa rural de la cabecera municipal
    protected int distanciaCabera;

    // Atributo que identifica la altitud a la que se encuentra una casa rural
    protected int altitud;

    // MÉTODOS

    /**
     * Constructor de la clase CasaRural
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de una casa rural
     * @param area Parametro que define el area de una casa rural
     * @param direccion Parametro que define la direccion donde se encuentra localizada una casa rural
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene una casa rural
     * @param numeroBaños Parametro que define el numero de baños que tiene una casa rural
     * @param numeroPisos Parametro que define el numero de pisos que tiene una casa rural
     * @param distanciaCabera Parametro que define la distancia de la casa rural a la cabecera municipal
     * @param altitud Parametro que define la altitud sobre el nivel del mar en que se encuentra una casa rural
     */
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabera, int altitud) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, 
              numeroBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    /**
     * Metodo que muestra en pantalla los datos de una casa rural
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal = " + distanciaCabera + " km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + " metros.");
        System.out.println();
    }
}
