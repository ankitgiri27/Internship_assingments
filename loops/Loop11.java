/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.loops;

import java.util.*;
public class Loop11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no. to check it is even or odd");
        int n = in.nextInt();
        System.out.println("enter 1 or 2: 1 for even and 2 for odd");
        int ch = in.nextInt();
        switch(ch){
            case 1:
                if (n%2==0){
                
                    System.out.println(n+" yes it is even");}
                else{
                System.out.println(n+" yes it is not even");}
                break;
            case 2:
                if(n%2!=0){
                System.out.println(n+" yes it is odd");}
                else{
                System.out.println(n+" yes it is not odd");}
                break;
            default:
                System.out.println("enter valid choice");
                       
        }
    }
}
