/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main3;

/**
 *
 * @author totit
 */
public class Hilo3 implements Runnable {
    
    private Cuenta origen;
    private Cuenta destino;
    int cantidad;

    public Hilo3(Cuenta origen, Cuenta destino, int cantidad) {
        this.origen = origen;
        this.destino = destino;
        this.cantidad = cantidad;
    }
    
    
    
    @Override
    public void run() {
      origen.Transferir(destino, cantidad);
        
    }
    
}
