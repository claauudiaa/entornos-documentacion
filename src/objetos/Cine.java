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

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getNumSalas() {
        return numSalas;
    }

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }

}