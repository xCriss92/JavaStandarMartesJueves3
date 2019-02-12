/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.mj.modificadores1;

/**
 *
 * @author EducaciónIT
 */
public class B extends A {
    public void mostrarContenidoSuperClase() {
        int z = metodoProtegido();
        int z1 = metodoDefault();
        int z2 = new A().metodoDefault();
    }
}
