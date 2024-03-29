package main;

import java.util.Scanner;

import objetos.Cine;
import objetos.Pelicula;
import objetos.Sala;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int opcion1 = 0;
        int opcion2 = 0;
        int opcion3 = 0;

        Cine cine1 = new Cine("Artesiete", 200, 5);
        Pelicula pelicula1 = new Pelicula("Frozen", 120);
        Pelicula pelicula2 = new Pelicula("Spiderman", 145);
        Pelicula pelicula3 = new Pelicula("Wonka", 113);
        Pelicula pelicula4 = new Pelicula("Barbie", 110);
        Pelicula pelicula5 = new Pelicula("La Sirenita", 100);

        // Aquí se crea un array de objetos

        Sala[] salas = new Sala[cine1.getNumSalas()];

        // Las diferentes salas del cine

        salas[0] = new Sala(1, pelicula1, 5, 8);
        salas[1] = new Sala(2, pelicula2, 5, 8);
        salas[2] = new Sala(3, pelicula3, 5, 8);
        salas[3] = new Sala(4, pelicula4, 5, 8);
        salas[4] = new Sala(5, pelicula5, 5, 8);

        System.out.println("\nBienvenido al programa de compra de entradas del cine " + cine1.getNombreCine() + ", contamos con " + cine1.getNumSalas() + " salas y con un aforo total de " + cine1.getAforo() + " de personas");

        /**
         * Este while sirve para que el usuario pueda seguir comprando hasta
         * que decida salir del menú de compra de entradas
         */
        while (opcion != 4) {
            System.out.print(
                    "\nPor favor, seleccione una opción:\n1- Ver las salas y las películas \n2- Reservar sala y butaca  \n3- Consultar asientos libres \n4- Salir \n>>> ");
            opcion = entrada.nextInt();
            /**
             * Este switch permite que se vayan seleccionando las opciones
             * que el usuario quiera en cada momento.
             * El switch incluye el default para evitar errores
             */
            switch (opcion) {
                case 1:
                    for (int i = 0; i < salas.length; i++) {
                        salas[i].mostrarInformacion();
                    }
                    break;
                case 2:
                    System.out.print("\nPor favor, seleccione el número de sala para reservar: ");
                    opcion2 = entrada.nextInt();
                    if (opcion2 <= salas.length) {
                        salas[opcion2 - 1].reservarButaca();
                    } else {
                        System.out.println("Por favor, seleccione una sala del 1 al " + salas.length);
                    }
                    break;
                case 3:
                    System.out.print("\nPor favor, seleccione el número de sala para comprobar los asientos libres: ");
                    opcion3 = entrada.nextInt();
                    if (opcion3 <= salas.length) {
                        salas[opcion3 - 1].asientosLibres();
                    } else {
                        System.out.println("Por favor, seleccione una sala del 1 al " + salas.length);
                    }
                    break;
                case 4:
                    System.out.println("\nAdiós");
                    break;
                default:
                    System.out.println("\nPor favor seleccione una opción válida");
            }

        }
    }
}