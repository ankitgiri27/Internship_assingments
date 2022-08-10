public class TS1 {

    int num;
    String name;

    TS1() {
        //3. Calling argument constructor of current class using this()
        this(11, "sayak");
    }

    TS1(int num, String name) {
        //1. Printing fields of the current class using this
        this.num = num;
        this.name = name;
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        TS1 ts1 = new TS1();
        TS1 ts = new TS1(12, "Ankit");
    }
}