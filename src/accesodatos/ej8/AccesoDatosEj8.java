/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.ej8;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class AccesoDatosEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos metodo = new Metodos();
        File fich=new File("C:/Users/pablo/documents/a.txt");
        File copia=new File("C:/Users/pablo/documents/b.txt");
        int buffer=1024;
        try {
            metodo.copiarBuffer(fich, copia, buffer);
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosEj8.class.getName()).log(Level.SEVERE, null, ex);
        }
        //El tamaño optimo del buffer dependerá del tamaño del fichero y de la memoria
        //caché disponible, aumentando segun aumentan estos parámetros.
    }
}
