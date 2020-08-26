package Lab4;

public class Example_BasicMethot {
    public static int C(int x , int y) {
        //Statement
        System.out.println("hello C.");
        int sum = x + y;
        return sum;


    }//C
    public static void B(int x){
        //Statement
        System.out.println("Hello B "+x);
    }//B
    public static void main(String[] args) {
        System.out.println("Hollo Main.");
        //call A.()
        A();
        A();
        A();
        //B()
        B(200);
        //call C()
        int num = C(300,500);
        System.out.println(num);
        System.out.println(C(30,50));
    }//main

    public  static void A(){
        //statement
        System.out.println("Hello A.");
        B(500);
    }//A

} //cass
