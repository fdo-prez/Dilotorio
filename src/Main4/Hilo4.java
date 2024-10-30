/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main4;

/**
 *
 * @author totit
 */
public class Hilo4 implements Runnable {

    Utiles util;
    int caja;

    public Hilo4(Utiles util, int caja) {
        this.util = util;
        this.caja = caja;
    }


    
    
    @Override
    public void run() {
        util.Llevar(caja, util);
        
    }
    
}
