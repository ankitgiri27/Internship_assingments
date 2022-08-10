import java.util.*;
public class MethodOverloading1 {
    int a,b,c;
    String s;
     // 01.Two methods with the same name but different number of parameters of same type
    void a1(int a){
        this.a=a;
        System.out.println("a1 : "+a);
    }
    void a2(int a , int b){
        this.a=a;
        this.b=b;
        System.out.println(a+" a2 "+b);
    }
    // 02.Two methods with the same name but different number of parameters of different data type
    //same method name one parameter
    void b1(int a){
        this.c=a;
        System.out.println("b1 : "+c);}
    void b2(int a , String s){
    this.a=a;
    this.s=s;
        System.out.println(a+" b2 "+s);       
    }
    // 04.Two methods with the same name and same number of parameters of different type
    //same method name different parameter type
    void c1(int c){
    this.c=c;
        System.out.println("c1 : "+c);}
    void c2(String s){
    this.s=s;
        System.out.println("c2 : "+s);}
    public static void main(String[] args) {
        
        MethodOverloading1 ob = new MethodOverloading1();
        
        ob.a1(20);
        ob.a2(20, 11);
        
        ob.b1(22);
        ob.b2(17, "ank");
        
        ob.c1(88);
        ob.c2("aannkk");
        
    }
}
