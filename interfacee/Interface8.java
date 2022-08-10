/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;
public interface Interface8 {
    //all the fields are public, static and final by default
    int num = 111; //values assigned

    public void myMethod();
}

//Implemented interface to a class
class Inter implements Interface8 {
    @Override
    public void myMethod() {
        System.out.println("This is a method");
    }

    //main method
    public static void main(String[] args) {
        Inter j = new Inter();
        //printing the values of the interface fields
        System.out.println(j.num);
        //calling the interface methods
        j.myMethod();
    }
}