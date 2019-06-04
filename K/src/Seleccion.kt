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
open class Seleccion(var id: Int, val nombre: String, val apellido: String, var edad: Int) {


    fun concentrarse() {
        println(" concentrase a selección ")

    }

    open fun viajar() {
        println("viaxa a selección")
    }

    override fun toString(): String {
        return "Id: $id\nNombre: $nombre\nApellido: $apellido\nEdad: $edad" //To change body of generated methods, choose Tools | Templates.
    }

}
