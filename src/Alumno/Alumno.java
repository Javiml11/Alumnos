package Alumno;

public class Alumno {
  private String nombre;
  private double nota = 0.0;
    

   /**
    * Devuelve el nombre del alumno.
    * 
    * @return Devuelveme el nombre del alumno 
    */
    public String getNombre() {
        return nombre;
    }
/**
 * Recibe el nombre del alumno.
 * 
 * @param nombre Nombre del alumno en cuestion
 */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Recibe nombre
 * 
 * @return Devuelve nota dicho alumno
 */

    public double getNota() {
        return nota;
    }
    
    /**
     * Recibe la nota
     * 
     * @param notaMedia Nota del alumno
     */

    public void setNota(double notaMedia) {
        this.nota = notaMedia;
    }
    

  
  
}
