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
public class Hombre {
    private Mujer m = null;
    private String nombre;
    
    public Hombre(String nombreParam) {
        nombre = nombreParam;
    }
    public void esperandoQueLePidanQueLaLlame(Mujer m) {
        this.m = m;
        llamar();
    }
    public void llamar() {
        m.esperarLlamado(this);
    }
    public String obtenerNombre() {
        return nombre;
    }
}
