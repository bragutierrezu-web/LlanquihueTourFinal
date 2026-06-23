package app;

import model.Cliente;
import model.Direccion;
import model.Tour;
import util.LectorArchivo;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Vuelta al lago Llanquihue", "Frutillar", "5 dias", 250000);


        String ruta = "target/classes/clientes.txt";

        ArrayList<Cliente> clientes = util.LectorArchivo.cargarClientes(ruta, tour1);

        Direccion dir1 = new Direccion("La Jardinera", 14567, "Santiago");
        Cliente clienteNuevo = new Cliente("Braulio Gutierrez", 23, "21.055.861-6", "+56922319615", dir1, "Espanol", "Chilena", tour1);

        LectorArchivo.guardarCliente(ruta, clienteNuevo);

        System.out.println("--- LISTADO DE CLIENTES ---");

        for (Cliente cli : clientes) {
            System.out.println(cli);
            System.out.println("-------------------------");

        }

    }

    }
