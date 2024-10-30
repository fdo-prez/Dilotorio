/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main2;

/**
 *
 * @author totit
 */
public class Hilo2 implements Runnable {

    private Cuentas origen;
    private Cuentas destino;
    private int cantidad;

    public Hilo2(Cuentas origen, Cuentas destino, int cantidad) {
        this.origen = origen;
        this.destino = destino;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        origen.Transferir(destino, cantidad);
    }

}
