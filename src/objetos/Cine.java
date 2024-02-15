package objetos;

public class Cine {

    private String nombreCine;
    private int aforo;
    private int numSalas;

    public Cine(String nombreCine, int aforo, int numSalas) {
        this.nombreCine = nombreCine;
        this.aforo = aforo;
        this.numSalas = numSalas;
    }

    /**
     * Este getter se usa para estética del Main, de manera que se usa como
     * mensaje de bienvenida al cine
     * @return el nombre del cine, para añadirlo en la bienvenida de Main
     */
    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    /**
     * Este getter se usa para estética del Main, de manera que se usa como
     * mensaje de bienvenida al cine
     * @return el aforo del cine, para añadirlo en la bienvenida de Main
     */
    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    /**
     * Este getter se usa para estética del Main, de manera que se usa como
     * mensaje de bienvenida al cine
     * @return el numero de salas del cine, para añadirlo en la bienvenida de Main
     */
    public int getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }

}