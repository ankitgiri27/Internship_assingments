/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

public class StringIndexOutOfBonds {
    public static void main(String[] args) {

        String str = "Sharan";
        try {
            
            char charAtNegativeIndex = str.charAt(-1);
            
            char charAtLengthIndex = str.charAt(11);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException caught");
            
            e.printStackTrace();
        }
    }
}