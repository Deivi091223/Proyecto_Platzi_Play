package platziPlay.contenido;

public class Pelicula {
    private String titulo;
    private String descripcion;
    private int duracion;
    private String genero;
    private int anioDeEstreno;
    private float calificacion;
    private boolean disponible;

    public  Pelicula(String titulo, String descripcion, int duracion, String genero,
    int anioDeEstreno, boolean disponible) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.genero = genero;
        this.anioDeEstreno = anioDeEstreno;
        this.calificacion = calificacion;
        this.disponible = disponible;
    }
    public void reproducir() {
        System.out.println("Reproduciendo..." + titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String obtenerFichaTecnica() {
        return titulo + "\n (" + anioDeEstreno + ") \n"  + "Genero = "+ genero + "\n" + "Clificacion ="
                + calificacion;
    }

    public void calificar(float calificacion) {
        if (calificacion >= 0 && calificacion <=5) {
            this.calificacion = calificacion;
        }
    }
    public boolean esPopular() {
        return calificacion >= 4;

    }
}
