/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;

/**
 *
 * @author asus
 */
public class Opearators_1 {
    static void add(int a , int b){
        int c = a+b;
        System.out.println("add = " +c);
    }
    static void sub(int a , int b){
        int c = a-b;
        System.out.println("add = " +c);
    }
    static void mul(int a , int b){
        int c = a*b;
        System.out.println("add = " +c);
    }
    static void div(int a , int b){
        int c = a/b;
        System.out.println("add = " +c);
    }
    public static void main(String[] args) {
        int a=7;
        int b=3;
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
        
        
    }
}
