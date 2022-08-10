/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;
import validintern.newpackage.Public1;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Opearators_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();
        if (n == 7){
            System.out.println("it is 7");}
        if (n != 7){
            System.out.println("it is not 7");}
        
       Public1 o = new Public1();
        o.a =71;
        o.an();
        
    }
   
}
