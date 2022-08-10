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

public class Constructor1 {
    public static void main(String[] args) {
        A ob = new A();
        new A(42);
        new A("Ankit" , " A91");
    }
}
