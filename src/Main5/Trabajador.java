/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main5;

/**
 *
 * @author totit
 */
public class Trabajador implements Runnable {

    Cofre cofre;
//Estas instancias las crearemos en el main, y seran a las que accedan cada trabajador 
    public Trabajador(Cofre cofre, Caja caja, int cantidad) {
        this.cofre = cofre;
        this.caja = caja;
        this.cantidad = cantidad;
    }
    Caja caja;
    int cantidad;
    
    @Override
    public void run() {
        cofre.Transferir(cantidad, caja);
    }
    
}
