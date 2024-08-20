package poo_ejercicio_41;

/**
 * @author Isabel Higuita Giraldo
 */

/**
* Esta clase denominada CuentaCorriente modela una cuenta bancaria
* que es una subclase de Cuenta. Tiene un nuevo atributo: sobregiro.
*/
public class CuentaCorriente extends Cuenta {

    /**
     * Atributo que define un sobregiro de la cuenta que surge cuando el
     * saldo de la cuenta es negativo
     */
    float sobregiro;

    /**
    * Constructor de la clase CuentaCorriente
    * @param saldo Parametro que define el saldo de la cuenta corriente
    * @param tasa Parametro que define la tasa anual de interes de la
    * cuenta corriente
    */
    public CuentaCorriente(float saldo, float tasa) {
        // Invoca al constructor de la clase padre
        super(saldo, tasa);
        // Inicializa el sobregiro en cero
        sobregiro = 0;
    }

    /**
    * Metodo que recibe una cantidad de dinero a retirar y actualiza el
    * saldo de la cuenta
    * @param cantidad Parametro que define la cantidad de dinero a
    * retirar de la cuenta corriente
    */
    @Override
    public void retirar(float cantidad) {
        // Se calcula un saldo temporal
        float resultado = saldo - cantidad; 
        /* Si el valor a retirar supera el saldo de la cuenta, el valor
        excedente se convierte en sobregiro y el saldo es cero */
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            // Si no hay sobregiro, se realiza un retiro normal
            super.retirar(cantidad);
        }
    }

    /**
    * Metodo que recibe una cantidad de dinero a consignar y actualiza
    * el saldo de la cuenta
    * @param cantidad Parametro que define la cantidad de dinero a
    * consignar en la cuenta corriente
    */
    @Override
    public void consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        // Si existe sobregiro la cantidad consignada se resta al sobregiro
        if (sobregiro > 0) {
            if ( residuo > 0) {
                // Si el residuo es mayor que cero, se libera el sobregiro
                sobregiro = 0;
                saldo = residuo;
            } else {
                // Si el residuo es menor que cero, el saldo es cero y surge un sobregiro
                sobregiro = -residuo;
                saldo = 0;
            }
        } else {
            // Si no hay sobregiro, se realiza una consignacion normal
            super.consignar(cantidad); 
        }
    }
    
    /**
    * Metodo que genera el extracto mensual de la cuenta
    */
    @Override
    public void extractoMensual() {
        // Invoca al metodo de la clase padre
        super.extractoMensual(); 
    }

    /**
    * Metodo que muestra en pantalla los datos de una cuenta corriente
    */
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Numero de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sogregiro = $" + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}