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
public class Masajista extends Seleccion{
    private String titulacion;
    private int anhosExperiencia;

    public Masajista(String titulacion, int anhosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnhosExperiencia() {
        return anhosExperiencia;
    }

    public void setAnhosExperiencia(int anhosExperiencia) {
        this.anhosExperiencia = anhosExperiencia;
    }
    
    public void darMasaje(){
        
    }
}
