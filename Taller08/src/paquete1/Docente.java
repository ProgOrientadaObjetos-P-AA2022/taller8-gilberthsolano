/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Docente {

    /**
     * @param args the command line arguments
     */
    protected String nombres;
    protected String apellidos;
    protected String identificacion;
    protected int edad;

    public Docente() {

    }

    public void establecerNombres(String c) {
        nombres = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerApellidos(String c) {
        apellidos = c;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerIdentificacion(String c) {
        identificacion = c;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public int obtenerEdad() {
        return edad;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre: %s\nApellido: %s\nIdentificacion: %s\nEdad: %d\n", obtenerNombres(),
                 obtenerApellidos(), obtenerIdentificacion(), obtenerEdad());
        return reporte;
    }

}
