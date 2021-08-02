/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3verano;

import java.lang.reflect.Array;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author salva
 */
public class Actividad3Verano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila publicacionesEinstein = new Pila();
        String[] publicacionesNombres = new String[3];
        publicacionesNombres [0] = "Teoria de Cuerdas";
        publicacionesNombres [1] = "Agujeros Negros";
        publicacionesNombres [2] = "Relatividad General";
        
       
        for (int i = 0; i < publicacionesNombres.length; i++) {
           publicacionesEinstein.agregarDatos(publicacionesNombres[i]);

        }
                
       while (publicacionesEinstein.tamanioTotal() != 0) {

            System.out.println("<---  Listado   --->");
            publicacionesEinstein.mostrarListado();
            System.out.println("el tamaño es de :" + publicacionesEinstein.tamanioTotal());

            System.out.print("se va a publicar el siguiente libro: ");
            publicacionesEinstein.imprimirUltimo();
            publicacionesEinstein.eliminarDato();

            System.out.print("Se ha publicado el ultimo libro, los restantes son: ");
            System.out.println(publicacionesEinstein.tamanioTotal());
            publicacionesEinstein.mostrarListado();
        }
    }
}

