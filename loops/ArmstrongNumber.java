/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;

import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrong(int n) {
        int r, result = 0;
        
        int temp = n;
        
        while (n != 0) {
            r = n % 10;
            
            result += (r * r * r);
            n = n / 10;
        }
       
        return temp == result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        
        int num = new Scanner(System.in).nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        
    }
}

