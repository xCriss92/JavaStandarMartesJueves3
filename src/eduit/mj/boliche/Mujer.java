/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.mj.boliche;

/**
 *
 * @author EducaciónIT
 */
public class Mujer {
    public void proponer() {
        Hombre anibal = new Hombre("Anibal");
        Hombre josesito = new Hombre("Josesito");
        
        josesito.esperandoQueLePidanQueLaLlame(this);
    }
    public void esperarLlamado(Hombre h) {
        System.out.println("Me esta llamando " + h.obtenerNombre());
    }
}
