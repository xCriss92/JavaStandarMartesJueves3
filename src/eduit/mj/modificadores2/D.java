/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.mj.modificadores2;
import eduit.mj.modificadores1.A;

/**
 *
 * @author EducaciónIT
 */
public class D extends A {
    public void mostrarMetodoProtected() {
        int z = metodoProtegido();
        // int z1 = super.metodoDefault(); No tengo acceso por mas que extienda de A
    }
}
