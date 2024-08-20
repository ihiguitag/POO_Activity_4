package poo_ejercicio_48;

/**
 * @author Isabel Higuita Giraldo
 */

/**
 * Esta clase prueba diferentes acciones realizadas por un equipo ciclístico
 * y sus diferentes corredores.
 * @version 1.2/2020
 */
public class POO_Ejercicio_48 {
    
    /**
     * Método main que crea un equipo. Luego, crea un escalador, un
     * velocista y un contrarrelojista. Estos tipos de ciclistas son añadidos
     * al equipo. Se asignan tiempos a cada ciclista para al final obtener el
     * tiempo total del equipo.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        // Crea un equipo
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");

        // Crea ciclistas de diferentes tipos
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);

        // Añade ciclistas al equipo
        equipo1.anadirCiclista(velocista1);
        equipo1.anadirCiclista(escalador1);
        equipo1.anadirCiclista(contrarrelojista1);

        // Establece tiempos acumulados para los ciclistas
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);

        // Calcula el tiempo total del equipo
        equipo1.calcularTotalTiempo();

        // Imprime la información del equipo
        equipo1.imprimir();

        // Lista los ciclistas del equipo
        equipo1.listarEquipo();
    }
}
