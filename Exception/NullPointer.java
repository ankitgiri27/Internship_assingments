/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

public class NullPointer {
    //we are trying to perform the length() operation on str which is null
    static void simpleNullCheck(String str) {
        System.out.println(str.length());
    }

    public static void main(String args[]) {

        String input = null;
        try {
            simpleNullCheck(input);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            
        }
    }
}