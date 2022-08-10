/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validintern.AccessModifier;
import validintern.newpackage.NewClass2;
/**
 *
 * @author asus
 */
class Bn extends NewClass2 {
void cc(){
    System.out.println(a);
    System.out.println(aa);
    super.z();
}
}
public class NewClass1 {
    
    public static void main(String[] args) {
        
        Bn o = new Bn();
        o.cc();
    }
}
