package platziPlay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Platzi play");

        Scanner read = new Scanner(System.in);
        String nombre;
        System.out.println("Cual es tu nombre");
        nombre = read.nextLine();
        System.out.println("Hola" + nombre + ",Bienvenido a Platzi Play");
        int anios;
        System.out.println("Hola" + nombre + ",Cuantos anios tienes");
        anios = read.nextInt();

        System.out.println(nombre + ", puedes ver contenido + " + anios);
    }
}
