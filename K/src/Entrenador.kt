/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_13

/**
 *
 * @author fsancheztemprano
 */
class Entrenador(var idFederacion: String?, id: Int, nombre: String, apellido: String, edad: Int) : Seleccion(id, nombre, apellido, edad) {

    class Seleccion(var id: Int, val nombre: String, val apellido: String, var edad: Int)

    fun dirigirPartido() {

    }

    fun dirigirEntrenamiento() {

    }


    override fun viajar() {
        println("viajan los entrenadores") //To change body of generated methods, choose Tools | Templates.
    }

}
