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
public class EnConstructores {
   public EnConstructores() {
       System.out.println("Constructor vacio");
   } 
   public EnConstructores(String s) {
       System.out.println("Constructor con un String");
   } 
   public EnConstructores(String s, int a) {
       System.out.println("Constructor String + entero");
   }
   public EnConstructores(String s, byte a) {
       System.out.println("Constructor String + entero");
   }   
   public EnConstructores(String s, float a) {
       System.out.println("Constructor String + entero");
   }
   public static void main(String... params) {
       new EnConstructores("hola", 3);
   }
}
