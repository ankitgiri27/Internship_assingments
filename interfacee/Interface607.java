/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

interface A{
abstract void jod();
}
interface B extends A{
abstract void jod2();
}
public class Interface607 implements B {
    @Override
    public void jod2(){
        System.out.println("i am method of interface B");
    }
    @Override
    public void jod(){
        System.out.println("i am the method of interface A");
        
    
    }
    public static void main(String[] args) {
        Interface607 ob = new Interface607();
        
        ob.jod();
        ob.jod2();
    }
}
