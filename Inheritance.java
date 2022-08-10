/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;

import java.util.*;

class A{
    void A1(){
        System.out.println("method of A - A1");}
    void A2(){
        System.out.println("method of A - A2");}
    void common(){
        System.out.println("common of A");}
}

class B extends A{
    void B1(){
        System.out.println("method of B - B1");}
    void B2(){
        System.out.println("method of B - B2");}
    @Override
    void common(){
        System.out.println("common of B");}
}
class C extends B{
    void C1(){
        System.out.println("method of C - C1");}
    void C2(){
        System.out.println("method of C - C2");}
    @Override
    void common(){
        System.out.println("common of C");}
}

public class Inheritance {
    public static void main(String[] args) {
        A ao = new A();
        ao.A1();
        ao.A2();
        ao.common();
        B bo = new B();
        bo.B1();
        bo.B2();
        bo.common();
        C co = new C();
        co.C1();
        co.C2();
        co.common();
        
        A ob;
        ob = new B();
        ob.common();
        ob = new C();
        ob.common();
    }
}
