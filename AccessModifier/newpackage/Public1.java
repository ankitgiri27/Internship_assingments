/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.newpackage;

/**
 *
 * @author asus
 */
public class Public1 {
    public int a=2;
    public void an(){
        System.out.println("print of public method"+a);
    }
    public static void main(String[] args) {
        Public1 o = new Public1();
        o.an();
        o.a=7;
        o.an();
    }
}
