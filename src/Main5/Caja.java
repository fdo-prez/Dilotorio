/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main5;

/**
 *
 * @author totit
 */
public class Caja {
    private int monedas;

    public Caja(int monedas) {
        this.monedas = monedas;
    }
    
    public synchronized void Agregar(int cantidad)
    { monedas+=cantidad;
    }

    public Caja() {
    }
    public void mostrarcaja(){
        System.out.println("Hay "+ monedas+" en la caja");
    }
    
}
