/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.newpackage;
import validintern.newpackage.*;
/**
 *
 * @author asus
 */
public class NewClass1 {
    int a= 2;
    void d(){
        System.out.println("default class"+a);
    }
    public static void main(String[] args) {
        NewClass1 o= new NewClass1 ();
        o.d();
        o.a=5;
        o.d();
        Public1 b = new Public1();
        b.an();
       
        
    }
}
