/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author totit
 */
public class Main {
    public static void main(String[] args) {
        try {
            Cuentas origen= new Cuentas(1000);
            Cuentas destino= new Cuentas(100);
            
            Hilo2 hilo1= new Hilo2(origen, destino, 904);
            Hilo2 hilo2= new Hilo2(origen, destino, 493);
            Thread Hilo1= new Thread(hilo1);
            Thread Hilo2= new Thread(hilo2);
            
            Hilo1.start();
            Hilo2.start();
            
            
            Hilo1.join();
            Hilo2.join();
            
            origen.Obtener();
            destino.Obtener();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
