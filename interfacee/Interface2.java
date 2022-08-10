/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

interface An3{
abstract void meth();
abstract void meth1();
}
public class Interface2 implements An3 {
    @Override
    public void meth(){
        System.out.println("i am method meth");
    }
    @Override
    public void meth1(){
        System.out.println("i am method meth1");
    }
    public static void main(String[] args) {
        Interface2 ob = new Interface2();
        ob.meth();
        ob.meth1();
    }
}
