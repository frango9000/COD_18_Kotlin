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
public class Entrenador extends Seleccion {
    private String idFederacion;

    public Entrenador(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
        
    }
    public void dirigirEntrenamiento(){
        
    }

    @Override
    public String toString() {
        
        return "Id: "+super.getId()+"\nNombre: "+super.getNombre()+"\nApellido: "+super.getApellido()+"\nEdad: "+super.getEdad() + "\nidFederacion: " + idFederacion;
    }
    
}
