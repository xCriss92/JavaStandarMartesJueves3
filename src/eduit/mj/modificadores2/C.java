/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.mj.modificadores2;
import eduit.mj.modificadores1.*;

/**
 *
 * @author EducaciónIT
 */
public class C {
    public void mostrarContenidoA() {
        int z = new A().metodoPublico();
        // int z1 = new A().metodoProtegido(); NO TENGO ACCESSO
        // int z1 = new A().metodoDefault(); NO TENGO ACCESO
    }
}
