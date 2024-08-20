package poo_ejercicio_47;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase concreta denominada Perro es una subclase de Canido.
 * @version 1.2/2020
 */
public class Perro extends Canido {

    // MÉTODOS

    /**
     * Método que devuelve un String con el sonido de un perro.
     * @return Un valor String con el sonido de un perro: "Ladrido"
     */
    public String getSonido() {
        return "Ladrido";
    }

    /**
     * Método que devuelve un String con los alimentos de un perro.
     * @return Un valor String con la alimentacion de un perro: "Carnivoro"
     */
    public String getAlimentos() {
        return "Carnivoro";
    }

    /**
     * Método que devuelve un String con el habitat de un perro.
     * @return Un valor String con el habitat de un perro: "Domestico"
     */
    public String getHabitat() {
        return "Domestico";
    }

    /**
     * Método que devuelve un String con el nombre cientifico de un perro.
     * @return Un valor String con el nombre cientifico de un perro: "Canis lupus familiaris"
     */
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}
