/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.mj.clasabstracta;

abstract class A {
    public void m1() {
        System.out.println("A:m1");
    }
    public abstract void m2();
}

abstract class B extends A {
    
}

class C extends B {
    public void m2() {
        System.out.println("C:m2");
    }
}

public class ClaseAbstracta {
    public static void main(String[] args) {
        new C().m1();
        new C().m2();
    }
}
