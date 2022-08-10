/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern;

 import java.util.Scanner;
public class operator_7 {
   


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        int min, max;

        if (num1 > num2) {
            max = num1;
            min = num2;
        }
        else {
            min = num1;
            max = num2;
        }

        System.out.println("Larger Number: "+ max);
        System.out.println("Smaller Number: "+ min);
    }
}