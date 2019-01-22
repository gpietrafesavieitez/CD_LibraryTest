/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prelibrarytest;

import static prelibrarytest.IO.*;

/**
 *
 * @author gpietrafesavieitez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int miNumero;
        
        try{
            miNumero = IO.introducir(VENTANA);
            IO.mostrar(miNumero,1);
        }catch(Exception e){
            IO.mostrar("Error",CONSOLA);
        }
    }
    
}
