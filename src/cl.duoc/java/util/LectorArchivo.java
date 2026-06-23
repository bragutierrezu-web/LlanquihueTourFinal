package util;

import model.Direccion;
import model.Cliente;
import model.Tour;

import java.io.*;
import java.util.ArrayList;

public class LectorArchivo {

    public static ArrayList<Cliente> cargarClientes(String rutaArchivo, Tour tour) {
        ArrayList<Cliente> lista = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length >= 9) {

                    try {
                        String nombre = datos[0].trim();
                        int edad = Integer.parseInt(datos[1].trim());
                        String rut = datos[2].trim();
                        String telefono = datos[3].trim();
                        String calle = datos[4].trim();
                        int numero = Integer.parseInt(datos[5].trim());
                        String ciudad = datos[6].trim();
                        String idioma = datos[7].trim();
                        String nacionalidad = datos[8].trim();

                        Direccion dir = new Direccion(calle, numero, ciudad);
                        Cliente cli = new Cliente(nombre, edad, rut, telefono, dir, idioma, nacionalidad, tour);
                        lista.add(cli);

                    } catch (NumberFormatException e) {

                        System.out.println("Error al leer el archivo en formato numérico. ");
                    }
                }
            }
            System.out.println("Archivo procesado. Clientes cargados correctamente: " + lista.size());

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo. " + e.getMessage());
        }

        return lista;
    }

    public static void guardarCliente(String rutaArchivo, Cliente cliente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) {

            String linea = cliente.getNombre() + "," +
                    cliente.getEdad() + "," +
                    cliente.getRut() + "," +
                    cliente.getTelefono() + "," +
                    cliente.getDireccion().getCalle() + "," +
                    cliente.getDireccion().getNumero() + "," +
                    cliente.getDireccion().getCiudad() + "," +
                    cliente.getIdioma() + "," +
                    cliente.getNacionalidad();

            bw.write(linea);
            bw.newLine();
            System.out.println("-> Cliente guardado en el archivo exitosamente.");

        } catch (IOException e) {
            System.out.println("Error al intentar guardar el cliente. " + e.getMessage());
        }
    }
}


