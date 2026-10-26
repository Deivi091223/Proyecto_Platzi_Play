package platziPlay.plataforma;

import platziPlay.contenido.Pelicula;

public class Usuario {
    private String nombreCompleto;
    private String email;

    public Usuario(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void ver(Pelicula pelicula) {
        System.out.println(nombreCompleto + " está viendo: " + pelicula.getTitulo());
    }
}
