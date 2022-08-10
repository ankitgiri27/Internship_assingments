/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;

import java.util.*;
public class Loop9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no. to check it is prime or not");
        int c = 0;
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            if(n%i==0){
            c++;}
        }
        if(c==1){
            System.out.println("its is prime");
        }
    }
}
