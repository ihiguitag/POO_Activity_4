package poo_ejercicio_47;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase concreta denominada Leon es una subclase de Felino.
 * @version 1.2/2020
 */
public class Leon extends Felino {

    // MÉTODOS

    /**
     * Método que devuelve un String con el sonido de un leon.
     * @return Un valor String con el sonido de un leon: "Rugido"
     */
    public String getSonido() {
        return "Rugido";
    }

    /**
     * Método que devuelve un String con los alimentos de un leon.
     * @return Un valor String con la alimentacion de un leon: "Carnivoro"
     */
    public String getAlimentos() {
        return "Carnivoro";
    }

    /**
     * Método que devuelve un String con el habitat de un leon.
     * @return Un valor String con el habitat de un leon: "Praderas"
     */
    public String getHabitat() {
        return "Praderas";
    }

    /**
     * Método que devuelve un String con el nombre cientifico de un leon.
     * @return Un valor String con el nombre cientifico de un leon: "Panthera leo"
     */
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
