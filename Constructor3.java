
public class Constructor3 {
   int roll;
   String Enroll;
   String Name;
   String College;
    
    Constructor3(){
        this(10);
    }
    Constructor3(int r){
        this("A91","Ankit");
        this.roll=r;
        System.out.println("Roll no. :"+roll);
       }
    Constructor3(String en , String n){
        this("amity");    
        this.Enroll=en;
        this.Name=n;
        System.out.println("Enroll no. :"+en);
        System.out.println("NAme : "+n);
    }
    protected Constructor3(String c){
        this.College=c;
        System.out.println("College : "+c);
    }
    public static void main(String[] args) {
         Constructor3 ob=new Constructor3();
    }
}
