package poo_ejercicio_42;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase denominada Oficina modela un tipo especifico de local
 * con atributos como el valor por area y un valor booleano para
 * determinar si pertenece o no al gobierno.
 * @version 1.2/2020
 */
public class Oficina extends Local {

    // Atributo que identifica el valor por area de una oficina
    protected static double valorArea = 3500000;

    // Atributo que identifica si una oficina pertenece o no al gobierno
    protected boolean esGobierno;

    /**
     * Constructor de la clase Oficina
     * 
     * @param identificadorInmobiliario Parametro que define el identificador inmobiliario de una oficina
     * @param area Parametro que define el area de una oficina
     * @param direccion Parametro que define la direccion donde se encuentra localizada una oficina
     * @param tipoLocal Parametro que define el tipo de una oficina (interna o que da a la calle)
     * @param esGobierno Parametro que define un valor booleano para determinar si la oficina es del gobierno o no
     */
    public Oficina(int identificadorInmobiliario, int area, String direccion, Tipo tipoLocal, boolean esGobierno) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    /**
     * Metodo que muestra en pantalla los datos de una oficina
     */
    @Override
    public void imprimir() {
        // Invoca al metodo imprimir de la clase padre
        super.imprimir();
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
