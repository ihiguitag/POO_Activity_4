package poo_ejercicio_47;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase prueba diferentes animales y sus métodos.
 * @version 1.2/2020
 */
public class POO_Ejercicio_47 {

    /**
     * Método main que crea un array de varios animales y para cada uno
     * muestra en pantalla su nombre científico, su sonido, alimentos y
     * hábitat.
     * @param args Parámetros de entrada
     */
    public static void main(String[] args) {
        // Define un array de cuatro elementos de tipo Animal
        Animal[] animales = new Animal[4];

        // Inicializa el array con diferentes tipos de animales
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();

        // Recorre el array de animales
        for (int i = 0; i < animales.length; i++) {
            // Muestra el nombre científico del animal
            System.out.println(animales[i].getNombreCientifico());

            // Muestra el sonido producido por el animal
            System.out.println("Sonido: " + animales[i].getSonido());

            // Muestra los alimentos que consume el animal
            System.out.println("Alimentos: " + animales[i].getAlimentos());

            // Muestra el hábitat del animal
            System.out.println("Habitat: " + animales[i].getHabitat());

            System.out.println();
        }
    }
}