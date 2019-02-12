/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduit.mj.sobrecarga;

/**
 *
 * @author EducaciónIT
 */
public class Init {
    public int suma(int a, int b) {
        return a + b;
    }
    public int suma(int a, int b, int c) {
        return a + b + c;
    }
    public long suma(int a, int b, long c) {
        return a + b + c;
    }
    public void aplicarSuma() {
        suma(3, 4);
        suma(3, 4, 5);
    }
    public static void main(String ... params) {
        new Init().aplicarSuma();
    }
}
