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
public class NewClass2 {
    protected int a = 5;
    public int aa=9;
    protected void z(){
        System.out.println("protected"+a);
    }
    public static void main(String[] args) {
        NewClass2 o = new NewClass2();
        o.z();
        o.a=9;
        o.z();
    }
}
