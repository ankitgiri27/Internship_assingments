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
abstract void meth1();}
public class Interface4 implements An , A1 {
    @Override
    public void meth(){
        System.out.println("i am method meth");
    }
    @Override
    public void meth1(){
        System.out.println("i am method meth1");
    }
    public static void main(String[] args) {
        Interface4 ob = new Interface4();
        ob.meth();
        
        ob.meth1();
    }
}

