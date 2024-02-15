package objetos;

import java.util.Scanner;

import java.util.Random;

public class Sala {

    Random rand = new Random();

    private int numSala;
    private Pelicula pelicula;
    private int[][] butacas;

    public Sala(int numSala, Pelicula pelicula, int filas, int columnas) {
        this.numSala = numSala;
        this.pelicula = pelicula;
        this.butacas = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.butacas[i][j] = rand.nextInt(2); // 0 representa libre
            }
        }
    }

    /**
     * Este método muestra la informacion de las salas, usando los getter
     * establecidos en la clase pelicula para recuperar el titulo y la duración
     */
    public void mostrarInformacion() {
        System.out.println("\nNúmero de Sala: " + numSala);
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
    }

    /**
     * Este método permite al usuario reservar su asiento.
     * Primer muestra las butacas para mostrar las ocupadas (1) y las vacías (0).
     * Después permite al usuario seleccionar la columan y fila de su asiento.
     * Hace un control de errores que dice si el asiento ha sido reservado o si
     * el asiento estaba ocupado.
     * Por último, vuelve a mostrar las butacas y se marca tu asiento reservado con 1.
     */
    public void reservarButaca() {

        Scanner entrada = new Scanner(System.in);
        int fila;
        int columna;
        System.out.println("\n");
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nSelecciona una fila: ");
        fila = entrada.nextInt();
        System.out.print("Selecciona una columna: ");
        columna = entrada.nextInt();

        // Esta parte impide que se reserve una butaca ocupada

        if (butacas[fila][columna] == 1) {
            System.out.println("\nAsiento ocupado, por favor, seleccione otro asiento\n");
        } else {
            butacas[fila][columna] = 1; // El 1 representa una butaca ocupada
            System.out.println("\nAsiento reservado con éxito\n");
        }

        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                System.out.print(butacas[i][j] + " ");
            }
            System.out.println();
        }

    }
    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int[][] getButacas() {
        return butacas;
    }

    public void setButacas(int[][] butacas) {
        this.butacas = butacas;
    }

}
