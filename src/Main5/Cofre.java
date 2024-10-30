/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main5;

/**
 *
 * @author totit
 */
public class Cofre {
    private int monedas;

    public Cofre(int monedas) {
        this.monedas = monedas;
    }

    public synchronized void Transferir(int cantidad, Caja caja){
        if( cantidad<monedas){
        
        caja.Agregar(cantidad);
        monedas-=cantidad;
        System.out.println("El trabajador "+ Thread.currentThread().getName()+" ha llevado "+ cantidad+ " de monedas");}
        else{System.out.println("No se de donde has sacado tantas monedas gitano");}
    }
     
    public void mostrarcofre(){
        System.out.println("Hay "+monedas+" en el cofre");
    }

   
    
}
