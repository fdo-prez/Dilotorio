/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author totit
 */
public class Main {
    public static void main(String[] args) {
        try {
            Cuenta origen = new Cuenta(1200);
            Cuenta destino= new Cuenta(250);
            
            Hilo3 hilo3= new Hilo3(origen, destino, 124);
            Hilo3 hilo4= new Hilo3(origen, destino, 234);
            Thread Hilo3= new Thread(hilo3);
            Thread Hilo4= new Thread(hilo4);
            
            Hilo3.start();
            Hilo4.start();
            
            Hilo3.join();
            Hilo4.join();
            
            origen.Mostrar();
            destino.Mostrar(); 
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
