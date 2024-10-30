/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author totit
 */
public class Contador {

    private int cuenta = 0;

    public synchronized void Contar() {
        cuenta++;

    }

    public int Obtener() {
        return cuenta;
    }
}
