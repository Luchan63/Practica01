import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        // inicializamos la clase Registrar personas
        RegistrarPerona registrarPersonas = new RegistrarPerona();

        boolean salir = false;
        do {

            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Desea registrar una persona:\n1- Si\n2- No"));

            if (opcion == 1) {
                Persona personas = new Persona();
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