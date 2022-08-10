/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.loops;

import java.util.*;
public class Loop6 {
    public static void main(String[] args) {
        int i =10;
        System.out.println("even no. :");
        while(true){
        if(i%2==0){
            System.out.print(i+" ,");}
        i++;
        if(i==101){
        break;}
        }
    }
}
