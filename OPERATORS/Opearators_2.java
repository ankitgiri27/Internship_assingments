/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;

import java.util.*;

/**
 *
 * @author asus
 */
public class Opearators_2 {
    static int increment(int a){
    return ++a;
    }
    static int decrement(int a){
    return --a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to increment it : ");
        int a  = in.nextInt();
        System.out.println("inc = "+increment(a));
        System.out.println("inc = "+decrement(a));
    }
}
