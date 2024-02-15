package objetos;

public class Pelicula {

    private String titulo;
    private int duracion;

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Este método devuelve el nombre de la película para que en Main se
     * pueda crear una sala que permita traer el titulo.
     * @return titulo para usarlo en el constructor en Main
     */
    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Este método devuelve la duración de la película para que en Main se
     * pueda crear una sala que permita traer la duración.
     * @return duracion que es un int porque el tiempo está en minutos
     */
    public int getDuracion() {
        return duracion;
    }


    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


}