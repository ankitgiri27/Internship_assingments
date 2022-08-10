/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.JAVABASICS;

public class javab5 {
    int N = 4;

    static void localVariable() {
        int N = 5;

        //LOCAL VARIABLE
        System.out.println("Local variable N: "+ N);
    }

    public static void main(String[] args) {
        javab5 obj = new javab5();

        //GLOBAL VARIABLE
        System.out.println("Instance variable N: "+ obj.N);

        obj.localVariable();
    }
}
