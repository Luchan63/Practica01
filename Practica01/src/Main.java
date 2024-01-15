import javax.swing.*;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // inicializamos la clase Registrar personas
        RegistrarPeronas registrarPersonas = new RegistrarPeronas();

        boolean salir = false;
        do {
            // usamos
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea registrar una persona:\n1- Si\n2- No"));

            if (opcion == 1) {
                Personas personas = new Personas();
                registrarPersonas.registrarPersonas(personas);
            } else if (opcion == 2) {
                salir = true;
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo");
            }

        } while (!salir);

        int opcionConsulta = Integer.parseInt(JOptionPane.showInputDialog("¿Desea consultar la lista?\n1- Si\n2- No"));

        if (opcionConsulta == 1) {
            registrarPersonas.consultarListaPersonas();
        } else if (opcionConsulta == 2) {
            JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
        }
    }
}