/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

import java.util.*;


interface An1{
abstract void meth();
abstract void meth1();
}
public class Interface3 implements An1{
    @Override
    public void meth(){
        System.out.println("i am method meth");
    }
    @Override
    public void meth1(){
        System.out.println("i am method meth1");
    }
    public static void main(String[] args) {
        An1 ob = new Interface3();
        ob.meth();
        ob.meth1();
    }
}
