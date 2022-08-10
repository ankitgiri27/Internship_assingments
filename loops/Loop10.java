/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.loops;

/**
 *
 * @author asus
 */
import java.util.*;
public class Loop10 {
    static void palin(int num){
    int t= num;
    int d;
    int s=0;
    while(t!=0){
    d = t % 10;
    s = s * 10 + d;
    t = t / 10;
    }
    if(num==s){
        System.out.println("yes it is palindrome : "+num);
    }
    else{
        System.out.println("not a plindrome");}
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a no. ");
        
        int n = in.nextInt();
        palin(n);
    }
   
}
