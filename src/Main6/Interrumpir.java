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
public class Interrumpir implements Runnable{
    
    Hilo6 hilo;
   Thread Hilo= new Thread(hilo);

    public Interrumpir(Hilo6 hilo) {
        this.hilo = hilo;
    }

 
   
    
    @Override
    public void run() {
     int opcion= JOptionPane.showConfirmDialog(null,"Quieres parar algun hilo?");
          if(opcion==0){
         try {
                 Hilo.wait();
                  System.out.println("El hilo "+ Thread.currentThread().getName()+" se ha parado");
             } catch (InterruptedException ex) {
                 Logger.getLogger(Interrumpir.class.getName()).log(Level.SEVERE, null, ex);
             }
            
         }
           
         
          
    }
    
}
