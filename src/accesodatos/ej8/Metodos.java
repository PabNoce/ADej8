/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos.ej8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author pablo
 */
public class Metodos {

    public void copiar(File fich, File copia) throws FileNotFoundException, IOException {
        FileInputStream fIn = new FileInputStream(fich);
        FileOutputStream fOut = new FileOutputStream(copia);
        int lil;
        while ((lil = fIn.read()) != -1) {
            fOut.write(lil);
        }
    }

    public void copiarBuffer(File fich, File copia, int buffer) throws FileNotFoundException, IOException {
        FileInputStream fIn = new FileInputStream(fich);
        //BufferedInputStream bIn = new BufferedInputStream(fIn);
        FileOutputStream fOut = new FileOutputStream(copia);
        byte[] buff = new byte[buffer];
        int i;
        //BufferedOutputStream bOut = new BufferedOutputStream(fOut);
        while ((i = fIn.read(buff)) != -1) {
            fOut.write(buff, 0, i);
          
        }
    }
}
