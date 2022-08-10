/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;
interface J9 {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
    //private int num4 = 44;  - error
    // protected int num5 = 55; - error
}
public class Interface091011 implements J9 {
    public static void main(String[] args) {
        Interface091011 if9 = new Interface091011();
        System.out.println(if9.num1 + " " + if9.num2);
        System.out.println(if9.num3);
        
    
}
}
