/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.loops;

import java.util.*;
public class Loop5 {
    public static void main(String[] args) {
        int a = 7;
        int b=8;
        int c=3;
        if(a>c){
            if(a>b){
                System.out.println("largest :"+a);}
            else{
            System.out.println("largest :"+b);}
        }
        else{
        if(c>b){
        System.out.println("largest :"+c);}
        else{
        System.out.println("largest :"+b);}
        }
    }
}
