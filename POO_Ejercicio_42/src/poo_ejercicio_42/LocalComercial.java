package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada LocalComercial modela un tipo especifico de
 * Local destinado para un uso comercial. Incluye atributos como el valor
 * por area y el centro comercial al cual pertenece.
 * @version 1.2/2020
 */
public class LocalComercial extends Local {

    // Atributo que identifica el valor por area de un local comercial
    protected static double valorArea = 3000000;

    // Atributo que identifica el centro comercial donde esta ubicado el local comercial
    protected String centroComercial;

    /**
     * Constructor de la clase LocalComercial
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de un local comercial
     * @param area Parametro que define el area de un local comercial
     * @param direccion Parametro que define la direccion donde se encuentra localizado un local comercial
     * @param tipoLocal Parametro que define el tipo de local comercial (interno o que da a la calle)
     * @param centroComercial Parametro que define el nombre del centro comercial donde esta ubicado el local comercial
     */
    public LocalComercial(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, String centroComercial) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    /**
     * Metodo que muestra en pantalla los datos de un local comercial
     */
    @Override
    public void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
