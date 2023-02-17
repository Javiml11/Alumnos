package alumnos;

import Alumno.Alumno;
import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Define la estructura, un array de 5 alumnos
        // pero no crea los objetos
        Alumno[] alum = new Alumno[5];

        // Pide los datos de los alumnos /////////////////////////////////
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");

        Campo(alum, entrada);

        // Muestra los datos de los alumnos /////////////////////////////////
        System.out.println("Los datos introducidos son los siguientes:");

        double sumaDeMedias = ejercicio(alum);

        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }
/**
 * Información de la nota y nombre alumno
 * 
 * @param alum
 * @return 
 */
    private static double ejercicio(Alumno[] alum) {
        double sumaDeMedias = 0;
        for (int alumno = 0; alumno < 5; alumno++) {
            System.out.println("Alumno " + alumno);
            System.out.println("Nombre: " + alum[alumno].getNombre());
            System.out.println("Nota media: " + alum[alumno].getNota());
            System.out.println("----------------------------");

            sumaDeMedias += alum[alumno].getNota();
        } // for alumno
     
        return sumaDeMedias;
    }
    /**
     * Suma las medias de los alumnos que he dado
     * 
     * @param alum
     * @param entrada 
     */

    private static void Campo(Alumno[] alum, Scanner entrada) {
        for (int alumno = 0; alumno < 5; alumno++) {

            alum[alumno] = new Alumno();
            System.out.println("Alumno " + alumno);
            System.out.print("Nombre: ");
            alum[alumno].setNombre(entrada.nextLine());
            System.out.print("Nota media: ");
            alum[alumno].setNota(entrada.nextDouble());
        } // for alumno
        
         
    }
    
}
