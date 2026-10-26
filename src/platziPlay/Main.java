package platziPlay;

import platziPlay.contenido.Pelicula;
import platziPlay.plataforma.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("Platzi play");
        Pelicula p1 = new Pelicula("Matrix", "Lo mejor de lo mejor",1,
               "Accion",20218,true);
       p1.calificar(3.7F);

        Usuario u1 = new Usuario("Juan pablo jimenez");

       System.out.println(p1.obtenerFichaTecnica());
       p1.reproducir();
       u1.ver(p1);

       System.out.println();


//       System.out.println("Platzi play");
//
//        Scanner read = new Scanner(System.in);
//        String nombre;
//        System.out.println("Cual es tu nombre");
//        nombre = read.nextLine();
//        System.out.println("Hola" + nombre + ",Bienvenido a Platzi Play");
//        int anios;
//        System.out.println("Hola" + nombre + ",Cuantos anios tienes");
//        anios = read.nextInt();
//
//        System.out.println(nombre + ", puedes ver contenido + " + anios);*/

    }
}
