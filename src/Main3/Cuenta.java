/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main3;

/**
 *
 * @author totit
 */
public class Cuenta {
    private int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }
   public synchronized void Transferir(Cuenta destino, int cantidad){
   
   if(saldo>cantidad || saldo==cantidad){
       System.out.println("Dinero enviado");
       saldo-=cantidad;
       destino.Sumar(cantidad);
       
   }else {System.out.println("El dinero no se puede enviar");}
   
   
   }
   public synchronized void Sumar(int cantidad){
   saldo+=cantidad;
   }
   public void Mostrar(){
       System.out.println("El saldo de la cuenta es de "+ saldo+" Nombre"+ Thread.currentThread().getName());
   }
    
}
