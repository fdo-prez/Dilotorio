/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author totit
 */
public class Main {
    public static void main(String[] args) {
        
        try {
            Utiles util2= new Utiles();
            
            
            Hilo4 hilo1= new Hilo4 (util2,123);
            Hilo4 hilo2= new Hilo4(util2,2003);
            Hilo4 hilo3= new Hilo4 (util2,224);
            
            Thread Hilo1= new Thread(hilo1);
            Thread Hilo2= new Thread(hilo2);
            Thread Hilo3= new Thread(hilo3);
            
            Hilo1.start();
            
            
            Hilo2.start();
            
            
            Hilo3.start();
            
            
            
            Hilo1.join();

            Hilo2.join();

            Hilo3.join();
            
             util2.Mostrar();

        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
