package poo_ejercicio_41;

/**
 * @author Isabel Higuita Giraldo
 */

/**
* Esta clase denominada CuentaAhorros modela una cuenta de ahorros
* que es una subclase de Cuenta. Tiene un nuevo atributo: activa.
*/
public class CuentaAhorros extends Cuenta {

    // ATRIBUTOS
    
    /**
     * Atributo que identifica si una cuenta esta activa; lo esta si su saldo
     * es superior a 10000
     */
    private boolean activa;

    // MÉTODOS
    
    /**
     * Constructor de la clase CuentaAhorros
     *
     * @param saldo Parametro que define el saldo de la cuenta de ahorros
     * @param tasa Parametro que define la tasa anual de interes de la cuenta de
     * ahorros
     */
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
        // Si el saldo es menor a 10000, la cuenta no se activa
        if (saldo < 10000) {
            activa = false;
        } else {
            activa = true;
        }
    }

    /**
     * Metodo que recibe una cantidad de dinero a retirar y actualiza el saldo
     * de la cuenta
     *
     * @param cantidad Parametro que define la cantidad a retirar de una cuenta de
     * ahorros
     */
    @Override
    public void retirar(float cantidad) {
        // Si la cuenta esta activa, se puede retirar dinero
        if (activa)
        {
            // Invoca al metodo retirar de la clase padre
            super.retirar(cantidad);
        }
    }

    /**
     * Metodo que recibe una cantidad de dinero a consignar y actualiza el saldo
     * de la cuenta
     *
     * @param cantidad Parametro que define la cantidad a consignar en una cuenta
     * de ahorros
     */
    @Override
    public void consignar(float cantidad) {
        // Si la cuenta esta activa, se puede consignar dinero
        if (activa) 
            // Invoca al metodo consignar de la clase padre
            super.consignar(cantidad);
    }

    /**
     * Metodo que genera el extracto mensual de una cuenta de ahorros
     */
    @Override
    public void extractoMensual() {
        // Si la cantidad de retiros es superior a cuatro, se genera una comision mensual
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual(); // Invoca al metodo de la clase padre
        // Si el saldo actualizado de la cuenta es menor a 10000, la cuenta no se activa
        if (saldo < 10000) {
            activa = false;
        }
    }

    /**
     * Metodo que muestra en pantalla los datos de una cuenta de ahorros
     */
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comision mensual = $ " + comisionMensual);
        System.out.println("Numero de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
