package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada ApartamentoFamiliar modela un tipo especifico de apartamento 
 * con atributos como el valor por area y el valor de la administracion.
 * @version 1.2/2020
 */
public class ApartamentoFamiliar extends Apartamento {

    // ATRIBUTOS
    
    // Atributo que identifica el valor por area de un apartamento familiar
    protected static double valorArea = 2000000;
    // Atributo que identifica el valor de la administracion de un apartamento familiar
    protected int valorAdministracion;

    // MÉTODOS
    
    /**
     * Constructor de la clase ApartamentoFamiliar
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de un apartamento familiar
     * @param area Parametro que define el area de un apartamento familiar
     * @param direccion Parametro que define la direccion donde se encuentra localizado un apartamento familiar
     * @param numeroHabitaciones Parametro que define el numero de habitaciones que tiene un apartamento familiar
     * @param numeroBaños Parametro que define el numero de baños que tiene un apartamento familiar
     * @param valorAdministracion Parametro que define el valor de la administracion de un apartamento familiar
     */
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int valorAdministracion) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    /**
     * Metodo que muestra en pantalla los datos de un apartamento familiar
     */
    void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        // Muestra el valor de la administracion
        System.out.println("Valor de la administracion = $" + valorAdministracion);
        System.out.println();
    }
}
