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
public class A {
    private int variablePrivada = 3;
    private int metodoPrivado() {
        return 5;
    }
    public int metodoPublico() {
        return 500;
    }
    protected int metodoProtegido() {
        return 10000;
    }
    int metodoDefault() {
        return 100;
    }
}
