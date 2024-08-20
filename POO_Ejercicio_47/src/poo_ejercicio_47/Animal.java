package poo_ejercicio_47;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase abstracta denominada Animal modela un animal genérico
 * que cuenta con atributos como un sonido, alimentos que consume,
 * un habitat y un nombre cientifico.
 * @version 1.2/2020
 */
public abstract class Animal {

    // ATRIBUTOS

    // Identifica el sonido emitido por un animal
    protected String sonido;

    // Identifica los alimentos que consume un animal
    protected String alimentos;

    // Identifica el habitat de un animal
    protected String habitat;

    // Identifica el nombre cientifico de un animal
    protected String nombreCientifico;

    // MÉTODOS

    /**
     * Método abstracto que permite obtener el nombre cientifico del animal
     * @return El nombre cientifico del animal
     */
    public abstract String getNombreCientifico();

    /**
     * Método abstracto que permite obtener el sonido producido por el
     * animal
     * @return El sonido producido por el animal
     */
    public abstract String getSonido();

    /**
     * Método abstracto que permite obtener los alimentos que consume
     * un animal
     * @return Los alimentos que consume el animal
     */
    public abstract String getAlimentos();

    /**
     * Método abstracto que permite obtener el habitat de un animal
     * @return El habitat del animal
     */
    public abstract String getHabitat();
}
