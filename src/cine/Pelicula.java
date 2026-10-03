package cine;

public class Pelicula {
    private final String titulo;
    private final String genero;
    private final Integer duracion;
    private final Director director;

    public Pelicula(String titulo, String genero, Integer duracion, Director director) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
    }

    @Override
    public String toString() {
        return "\n---------------- DETALLE DE PELÍCULA ----------------" +
                "\n  Título:      " + titulo +
                "\n  Género:      " + genero +
                "\n  Duración:    " + duracion + " min" +
                "\n  Director:    " + director.get_nombre() + " (" + director.get_nacionalidad() + ")" +
                "\n--------------------------------------------------------";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Director getDirector() {
        return director;
    }
}
