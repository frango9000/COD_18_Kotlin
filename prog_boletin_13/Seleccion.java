/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_13;

/**
 *
 * @author fsancheztemprano
 */
public class Seleccion {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Seleccion() {
    }

    public Seleccion(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    public void concentrarse() {
        System.out.println(" concentrase a selección ");

    }

    public void viajar() {

    }

    @Override
    public String toString() {
        return "Id: "+id+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad; //To change body of generated methods, choose Tools | Templates.
    }
    
}
