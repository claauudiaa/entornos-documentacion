package objetos;

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
