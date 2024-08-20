package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada Local modela un tipo especifico de inmueble
 * que no esta destinado para la vivienda. Tiene como atributos un
 * tipo que especifica si es un local interno o que da a la calle.
 * @version 1.2/2020
 */
public class Local extends Inmueble {

    // Enumeracion que define los tipos de local
    public enum Tipo {
        INTERNO, CALLE
    }

    // Atributo que identifica el tipo de local
    protected Tipo tipoLocal;

    /**
     * Constructor de la clase Local
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de un local
     * @param area Parametro que define el area de un local
     * @param direccion Parametro que define la direccion donde se encuentra localizado un local
     * @param tipoLocal Parametro que define el tipo de local (interno o que da a la calle)
     */
    public Local(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    /**
     * Metodo que muestra en pantalla los datos de un local
     */
    @Override
    public void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
