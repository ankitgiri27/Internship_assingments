/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

interface An{
abstract void meth();

}
interface A1{
abstract void meth();}
public class Interface5 implements An , A1 {
    @Override
    public void meth(){
        System.out.println("i am method meth");
    }
    
    public static void main(String[] args) {
       An ob = new Interface5();
        ob.meth();
        
    }
}