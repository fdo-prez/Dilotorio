/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main4;

/**
 *
 * @author totit
 */
public class Utiles {
    private int saco=989;
    private int caja;

    public Utiles() {
        
        
    }
    
    public synchronized void Llevar(int cantidad,Utiles util){
    if(cantidad<saco){
    saco-=cantidad;
    util.Agregar(cantidad);
    }else{System.out.println("Imposible, no hagas trampas");}
   
    }
     public synchronized void Agregar(int cantidad){
     caja+=cantidad;
    
    }
     public void Mostrar(){
         System.out.println("El saco tiene "+saco+" diamantes"+ " y la caja tiene "+caja);
     }
}
