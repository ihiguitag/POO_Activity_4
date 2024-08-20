package poo_ejercicio_81;

/**
 * @author Isabel Higuita Giraldo
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;

/**
 * Esta clase denominada VentanaPrincipal define una interfaz gráfica
 * que permitirá crear una persona y agregarla a un vector de personas.
 * Luego, se puede eliminar una persona seleccionada o borrar todas las
 * personas.
 * @version 1.2/2020
 */
public class VentanaPrincipal extends JFrame implements ActionListener {

    // ATRIBUTOS

    // El objeto ListaPersonas de la aplicación
    private ListaPersonas lista;

    // Un contenedor de elementos gráficos
    private Container contenedor;

    // Etiquetas estáticas para los nombres de los atributos
    private JLabel nombre, apellidos, teléfono, dirección;

    // Campos de ingreso de texto
    private JTextField campoNombre, campoApellidos, campoTeléfono, campoDirección;

    // Botones
    private JButton añadir, eliminar, borrarLista;

    // Lista de personas
    private JList listaNombres;

    // Objeto que modela la lista
    private DefaultListModel modelo;

    // Barra de desplazamiento vertical
    private JScrollPane scrollLista;

    /**
     * Constructor de la clase VentanaPrincipal
     */
    public VentanaPrincipal() {
        lista = new ListaPersonas(); // Crea la lista de personas
        inicio();
        setTitle("Personas"); // Establece el título de la ventana
        setSize(270, 350); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); // La ventana se posiciona en el centro de la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece que el botón de cerrar permitirá salir de la aplicación
        setResizable(false); // Establece que el tamaño de la ventana no se puede cambiar
    }

    /**
     * Método que crea la ventana con sus diferentes componentes gráficos
     */
    private void inicio() {
        contenedor = getContentPane(); // Obtiene el panel de contenidos de la ventana
        contenedor.setLayout(null); // Establece que el panel no tiene asociado ningún layout

        // Establece la etiqueta y el campo nombre
        nombre = new JLabel("Nombre:");
        nombre.setBounds(20, 20, 135, 23); // Establece la posición de la etiqueta nombre
        campoNombre = new JTextField();
        campoNombre.setBounds(105, 20, 135, 23); // Establece la posición del campo de texto nombre

        // Establece la etiqueta y el campo apellidos
        apellidos = new JLabel("Apellidos:");
        apellidos.setBounds(20, 50, 135, 23); // Establece la posición de la etiqueta apellidos
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 135, 23); // Establece la posición del campo de texto apellidos

        // Establece la etiqueta y el campo teléfono
        teléfono = new JLabel("Teléfono:");
        teléfono.setBounds(20, 80, 135, 23); // Establece la posición de la etiqueta teléfono
        campoTeléfono = new JTextField();
        campoTeléfono.setBounds(105, 80, 135, 23); // Establece la posición del campo de texto teléfono

        // Establece la etiqueta y el campo dirección
        dirección = new JLabel("Dirección:");
        dirección.setBounds(20, 110, 135, 23); // Establece la posición de la etiqueta dirección
        campoDirección = new JTextField();
        campoDirección.setBounds(105, 110, 135, 23); // Establece la posición del campo de texto dirección

        // Establece el botón Añadir persona
        añadir = new JButton("Añadir");
        añadir.setBounds(105, 150, 80, 23); // Establece la posición del botón Añadir persona
        añadir.addActionListener(this); // Agrega al botón un ActionListener para que gestione eventos del botón

        // Establece el botón Eliminar persona
        eliminar = new JButton("Eliminar");
        eliminar.setBounds(20, 280, 80, 23); // Establece la posición del botón Eliminar persona
        eliminar.addActionListener(this); // Agrega al botón un ActionListener para que gestione eventos del botón

        // Establece el botón Borrar lista
        borrarLista = new JButton("Borrar Lista");
        borrarLista.setBounds(120, 280, 120, 23); // Establece la posición del botón Borrar lista
        borrarLista.addActionListener(this); // Agrega al botón un ActionListener para que gestione eventos del botón

        // Establece la lista gráfica de personas
        listaNombres = new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Establece que se pueda seleccionar solamente un elemento de la lista

        modelo = new DefaultListModel();
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190, 220, 80); // Establece la posición de la barra de desplazamiento vertical
        scrollLista.setViewportView(listaNombres); // Asocia la barra de desplazamiento vertical a la lista de personas

        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(teléfono);
        contenedor.add(campoTeléfono);
        contenedor.add(dirección);
        contenedor.add(campoDirección);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
    }

    /**
     * Método que gestiona los eventos generados en la ventana principal
     */
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) { // Si se pulsa el botón añadir
            añadirPersona(); // Se invoca añadir persona
        }

        if (evento.getSource() == eliminar) { // Si se pulsa el botón eliminar
            eliminarNombre(listaNombres.getSelectedIndex()); // Se invoca el método eliminarNombre que elimina el elemento seleccionado
        }

        if (evento.getSource() == borrarLista) { // Si se pulsa el botón borrar lista
            borrarLista(); // Se invoca borrar lista
        }
    }

    /**
     * Método que agrega una persona al vector de personas y a la lista gráfica de personas
     */
    private void añadirPersona() {
        // Se obtienen los campos de texto ingresados y se crea una persona
        Persona p = new Persona(campoNombre.getText(), campoApellidos.getText(), campoTeléfono.getText(), campoDirección.getText());
        lista.añadirPersona(p); // Se añade una persona al vector de personas

        String elemento = campoNombre.getText() + "-" +
                          campoApellidos.getText() + "-" +
                          campoTeléfono.getText() + "-" +
                          campoDirección.getText();
        modelo.addElement(elemento); // Se agrega el texto con los datos de la persona al JList

        listaNombres.setModel(modelo);

        // Se colocan todos los campos de texto nulos
        campoNombre.setText("");
        campoApellidos.setText("");
        campoTeléfono.setText("");
        campoDirección.setText("");
    }

    /**
     * Método que elimina una persona del vector de personas y de la lista gráfica de personas en la ventana
     * @param indice Parámetro que define la posición de la persona a eliminar
     */
    private void eliminarNombre(int indice) {
        if (indice >= 0) { // Si la posición existe
            modelo.removeElementAt(indice); // Se elimina la persona seleccionada de la lista gráfica
            lista.eliminarPersona(indice); // Se elimina la persona seleccionada del vector de personas
        } else { // Si no se seleccionó ninguna persona, se genera un mensaje de error
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método que elimina todas las personas del vector de personas
     */
    private void borrarLista() {
        lista.borrarLista(); // Se eliminan todas las personas del vector
        modelo.clear(); // Limpia el JList, la lista gráfica de personas
    }
}
