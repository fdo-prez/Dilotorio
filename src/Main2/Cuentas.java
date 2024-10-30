/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main2;

/**
 *
 * @author totit
 */
public class Cuentas {
    private int saldo;

    public Cuentas(int saldo) {
        this.saldo = saldo;
    }
    
    public synchronized void Transferir(Cuentas destino,int cantidad)
    { 
        if(cantidad<saldo || cantidad==saldo){
            System.out.println("Dinero enviado");
            saldo-=cantidad;
            destino.Agregar(cantidad);
            
        }else {System.out.println("Dinero no enviado");}
    
    }
    
    
     public synchronized void Agregar(int cantidad) {
        saldo += cantidad; // Método para agregar dinero al saldo
    }
    public void Obtener(){
        System.out.println("El saldo es de "+ saldo);
    }

}
