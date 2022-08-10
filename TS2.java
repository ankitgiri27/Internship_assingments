/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
class p{
static int z=10;
void me(){
    System.out.println("yo");}
}
public class TS2 extends p{
    void z1(){
        super.me();
        System.out.println("oy"+super.z);
    }
    public static void main(String[] args) {
        p n =new p();
        System.out.println(n.z);
        TS2 i = new  TS2();
        i.z1();
      
    }
}
