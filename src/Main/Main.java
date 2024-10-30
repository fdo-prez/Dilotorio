/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author totit
 */
public class Main {
    public static void main(String[] args) {
        Contador contador= new Contador();
        
        Hilo hilo1= new Hilo(contador);
        Hilo hilo2= new Hilo(contador);
        
        Thread Hilo1= new Thread(hilo1);
        Thread Hilo2= new Thread(hilo2);
        
        Hilo1.start();
        Hilo2.start();
        
        try {
            Hilo1.join();
            Hilo2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("La cuenta es de "+ contador.Obtener());
        
        
    }
}
