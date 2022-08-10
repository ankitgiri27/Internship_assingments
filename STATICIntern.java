
package validintern;


public class STATICIntern {
    int z=7;
    int z1=77;
    static int ss=100;
    static int ss1=101;
    static void sta1(){
        System.out.println("i am static method 1");
    }
    static void sta2(){
        System.out.println("i am static method 2");
    }
    void inst1(){
        System.out.println("i am istance method 1");
    }
    void inst2(){
        System.out.println("i am instance method 2");
    }
    public static void main(String[] args) {
        STATICIntern ob = new STATICIntern();
        //calling static method and variable
        System.out.println(STATICIntern.ss+" "+STATICIntern.ss1);
        STATICIntern.sta1();
        STATICIntern.sta2();
        //calling instance variable and method
        System.out.println(ob.z+" "+ ob.z1);
        ob.inst1();
        ob.inst2();
    }
}
