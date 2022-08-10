/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author asus
 */
public class excep04 {
 public static void main(String[] args) {
        
        try {
            int[] a = new int[9];
            
            a[6] = 10 / 0;
           
            System.out.println(a[10]);
        }
        
        catch (ArithmeticException e) {
            
            System.out.println("Exception occurs : "+e);
            e.getStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurs : "+e);
            e.getStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurs");
            e.getStackTrace();
        }
        
}
}
