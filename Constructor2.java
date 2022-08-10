class A{
int a;
String name;
String Enroll;
A(){
    System.out.println("Details of class A");
}
A(int a){
    this.a=a;
    System.out.println("Roll no : "+a);
}
A(String name , String Enroll){
    this.name=name;
    this.Enroll=Enroll;
    System.out.println("Name : "+name);
    System.out.println("Enrollment number: "+Enroll);
}
}

class B extends A{
B(){
super();
}
B(int a){
super.a=a;
    System.out.println("Roll no(B)"+a);
}
B(String n , String en){
super.name=n;
super.Enroll=en;
    System.out.println("Name(B) : "+n);
    System.out.println("Enroll no(B) :"+en);
}
}

public class Constructor2 {
    public static void main(String[] args) {
        A ob = new A();
         new A(42);
        new A("Ankit" , " A91");
        A bb=new B();
        bb = new B(10);
        bb = new B("sayak" , "A92");
    }
}

