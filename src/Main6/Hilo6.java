/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author totit
 */
public class Hilo6 implements Runnable{
 private int numero;
 private int intervalo;

    public Hilo6(int numero, int intervalo) {
        this.numero = numero;
        this.intervalo = intervalo;
    }

 
    @Override
    public void run() {
    Hilo6.Multiplicar(numero,intervalo);
    
    }
    
    
    public static void Multiplicar(int numero,int intervalo){ 
    
        for (int i = 0; i <50; i++) {
            System.out.println(numero +"x"+i+"="+ (numero*i));
            try {
                Thread.sleep(intervalo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
        public static void Multiplicar2(int numero){ 
    
        for (int i = 0; i <50; i++) {
            System.out.println(numero +"x"+i+"="+ (numero*i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
