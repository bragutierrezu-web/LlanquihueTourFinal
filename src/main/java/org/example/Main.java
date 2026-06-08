package org.example;

import Model.Cliente;
import Model.Tour;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Vuelta al lago Llanquihue" , "Frutillar", "5 dias", 250000 );
        Tour tour2 = new Tour("Navegación en Catamarán", "Volcán Osorno", "1 día", 100000);


        Cliente cliente1 = new Cliente("Braulio Gutiérrez", 23, "21.055.861-6", "+569 2231 9615", "Español", "Chilena", tour1 );
        Cliente cliente2 = new Cliente("Claudia Venegas", 25, "21.292.373-7", "+569 5456 3379", "Francés", "Francesa" , tour1);
        Cliente cliente3 = new Cliente("Cecilia Ubilla", 50, "9.864.657-7", "+569 8144 5119", "Inglés", "Inglesa", tour2);

        System.out.println(cliente1);
        System.out.println("---------------");
        System.out.println(cliente2);
        System.out.println("---------------");
        System.out.println(cliente3);
        }


    }
