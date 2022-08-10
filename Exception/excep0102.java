/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

 //1. Write a program to generate Arithmetic Exception without exception handling
// 2. Handle the Arithmetic exception using try-catch block

import java.util.*;
public class excep0102 {
    public static void main(String[] args) {
        int a=10,b=0,c ;
        try{
            System.out.println("Inside try block");
        c= a/b;
            System.out.println("ans : "+c);
        }
        catch(Exception e){
            System.out.println("exception = "+e);
    }
        c= a/b;
        System.out.println("answer = "+c);
    }
    
}

