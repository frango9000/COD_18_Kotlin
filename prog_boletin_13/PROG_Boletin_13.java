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
public class PROG_Boletin_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador("IDF0008",1, "Nombre", "Apellido", 30);
        Jugador jugador = new Jugador(1, "Portero", 2,"Nombre2", "Apellido2",19);
        Masajista masajista = new Masajista("Titulo", 10, 3, "Nombre Masajista", "Apellido Masajista", 45);
        Seleccion jugador2 = new Jugador(1, "Portero", 2,"Nombre2", "Apellido2",19);
        entrenador.concentrarse();
        jugador.concentrarse();
        masajista.concentrarse();
        jugador2.concentrarse();
        
        entrenador.viajar();
        jugador.viajar();
        masajista.viajar();
        jugador2.viajar();
    }
    
}
