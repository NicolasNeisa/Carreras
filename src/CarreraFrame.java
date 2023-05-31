
/**
 *
 * @author Nikos
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CarreraFrame extends JFrame implements ActionListener {

    private JLabel categoriaLabel, equipoLabel, circuitoLabel;
    private JTextField categoriaField, equipoField, circuitoField;
    private JButton agregarButton;
    private JPanel panel;
    private List<Carreras> carreras;

    public CarreraFrame() {
        super("Crear carrera");

        // Crear componentes de la interfaz
        categoriaLabel = new JLabel("Categoría:");
        categoriaField = new JTextField(20);
        equipoLabel = new JLabel("Equipo:");
        equipoField = new JTextField(20);
        circuitoLabel = new JLabel("Circuito:");
        circuitoField = new JTextField(20);
        agregarButton = new JButton("Agregar");
        panel = new JPanel(new GridLayout(4, 2));

        // Agregar componentes al panel
        panel.add(categoriaLabel);
        panel.add(categoriaField);
        panel.add(equipoLabel);
        panel.add(equipoField);
        panel.add(circuitoLabel);
        panel.add(circuitoField);
        panel.add(new JLabel()); // Espacio en blanco
        panel.add(agregarButton);

        // Agregar panel a la ventana
        add(panel);

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Inicializar la lista de carreras
        carreras = new ArrayList<>();

        // Agregar un ActionListener al botón
        agregarButton.addActionListener(this);
    }

    public static void main(String[] args) {
        new CarreraFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarButton) {
            // Obtener los valores ingresados por el usuario
            String categoria = categoriaField.getText();
            String equipo = equipoField.getText();
            String circuito = circuitoField.getText();

            // Crear un objeto de la clase Carrera con los valores ingresados
            Carreras carrera = new Carreras(categoria, equipo, circuito);

            // Agregar el objeto a la lista de carreras
            carreras.add(carrera);

            // Limpiar los campos de texto
            categoriaField.setText("");
            equipoField.setText("");
            circuitoField.setText("");
        }
    }
}
