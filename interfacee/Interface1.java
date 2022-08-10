/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

interface An{
abstract void meth();
}
public class Interface1 implements An {
    @Override
    public void meth(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Interface1 ob = new Interface1();
        ob.meth();
    }
}
