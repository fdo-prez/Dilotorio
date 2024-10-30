/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main6;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author totit
 */
public class Main {
    public static void main(String[] args) {
        
        Hilo6 hilo= new Hilo6(3,1000);
        Hilo6 hilo2= new Hilo6(7,3000);
        Thread Hilo2= new Thread(hilo2,"Multiplicacion2");
        Thread Hilo= new Thread(hilo,"Multiplicacion");
        Hilo.start();
        Hilo2.start();
        
        Interrumpir stop= new Interrumpir(hilo);
        try {
            Hilo.join();
            Hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         
          
    }
    
}
