package app;

import model.*;
import util.LectorArchivo;

import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Vuelta al lago Llanquihue", "Frutillar", "5 dias", 250000);


        String ruta = "target/classes/clientes.txt";

        ArrayList<Cliente> clientes = LectorArchivo.cargarClientes(ruta, tour1);

        Direccion dir1 = new Direccion("La Jardinera", 14567, "Santiago. ");
        Cliente clienteNuevo = new Cliente("Braulio Gutierrez", 23, "21.055.861-6", "+56922319615", dir1, "Espanol", "Chilena", tour1);

        LectorArchivo.guardarCliente(ruta, clienteNuevo);

        System.out.println("--- LISTADO DE CLIENTES ---");

        for (Cliente cli : clientes) {
            System.out.println(cli);
            System.out.println("---------------------------------------------------------------");

        }
        GestorEntidades gestor = new GestorEntidades();


        boolean continuar = true;
        while (continuar) {
            String[] opciones = {"Registrar Guía Turístico", "Registrar Vehículo", "Mostrar Resumen y Procesar", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción para la Agencia Llanquihue Tour:",
                    "Menú de Entrada - Semana 8",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion == 0) {
                String nombreG = JOptionPane.showInputDialog("Ingrese nombre del Guía: ");
                int edadG = 0;
               try {
                   edadG = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
               } catch(NumberFormatException e ){
                   JOptionPane.showMessageDialog(null, "Error, al no ingresar número quedará guardado como 0. ");

               }

                String rutG = JOptionPane.showInputDialog("Ingrese RUT: ");
                String fonoG = JOptionPane.showInputDialog("Ingrese teléfono: ");
                String idiomaG = JOptionPane.showInputDialog("Ingrese idioma certificado: ");
                int expG = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese años de experiencia: "));


                Direccion dirG = new Direccion("Pasaje Centenario", 450, "Puerto Varas " );


                GuiaTuristico nuevoGuia = new GuiaTuristico(nombreG, edadG, rutG, fonoG, dirG, idiomaG, expG);
                gestor.agregarEntidad(nuevoGuia);
                JOptionPane.showMessageDialog(null, "Guía registrado correctamente.");

            } else if (seleccion == 1) {
                String patenteV = JOptionPane.showInputDialog("Ingrese Patente del vehículo: ");
                int capacidadV = 0;
               try {
                   capacidadV = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capacidad de pasajeros: "));
               }catch (NumberFormatException e ) {
                   JOptionPane.showMessageDialog(null, "Error, al no ingresar numero quedara guardado como 0. ");
               }

                Vehiculo nuevoVehiculo = new Vehiculo(patenteV,  capacidadV);
                gestor.agregarEntidad(nuevoVehiculo);
                JOptionPane.showMessageDialog(null, "Vehículo registrado correctamente.");

            } else if (seleccion == 2) {
                System.out.println("\n--- PROCESANDO ENTIDADES REGISTRADAS EN LA GUI ---");
                gestor.procesarEntidades();
                JOptionPane.showMessageDialog(null, "Se ha impreso el resumen en la consola ");

            } else {
                continuar = false;
            }
        }
    }

    }
