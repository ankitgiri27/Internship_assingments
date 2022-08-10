/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;
import java.util.*;

abstract class A{
abstract void A1();

void A2(){
    System.out.println("non abstract method of A");}
}


public class AbstractClass1 extends A{
@Override
void A1(){
    System.out.println("at B , i'm the override method of A");}

    public static void main(String[] args) {
        A ao = new AbstractClass1 (); 
         ao.A2();
         
        AbstractClass1 ob = new AbstractClass1();
        ob.A1();
        ob.A2();
        
        
    }
   
}
