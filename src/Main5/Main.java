/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main5;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author totit
 */
public class Main {
    public static void main(String[] args) {
        
        //ESTA CAJA Y ESTE COFRE SON A LAS QUE ACCEDERAN CADA TRABAJADOR
        Cofre cofre= new Cofre(1000);
        Caja caja= new Caja(0);
        
         Cofre cofre2= new Cofre(1000);
         Caja caja2= new Caja(0);
        
        
        Trabajador juan= new Trabajador(cofre, caja, 12);
        Trabajador bigote = new Trabajador(cofre, caja, 35);
        Trabajador fernando = new Trabajador(cofre, caja, 123);

        Thread Juan = new Thread(juan, "Juan");
        Thread Bigote = new Thread(bigote, "Bigote");
        Thread Fernando = new Thread(fernando, "Fernando");

        Trabajador pedro = new Trabajador(cofre2, caja2, 54);
        Trabajador jose = new Trabajador(cofre2, caja2, 354);
        Trabajador fran = new Trabajador(cofre2, caja2, 1253);

        Thread Pedro = new Thread(pedro, "Pedro");
        Thread Jose = new Thread(jose, "Jose");
        Thread Fran = new Thread(fran, "Fran");

        Juan.start();
        Bigote.start();
        Fernando.start();
        Pedro.start();
        Jose.start();
        Fran.start();
        

        try {
            Juan.join();
            Bigote.join();
            Fernando.join();
            System.out.println("------");
            Pedro.join();
            Jose.join();
            Fran.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("De la caja primera");
        cofre.mostrarcofre();
        caja.mostrarcaja();
        System.out.println("De la caja segunda");
        cofre2.mostrarcofre();
        caja2.mostrarcaja();
    }

}
