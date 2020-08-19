package Lab3;
public class Example_For {
    public static void main(String[] args) {
        //พิมพ์ข้อความ "Hello" 10 ครั้ง
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("" + i);
        }
        for( int i= 1; i<=20 ;i++) {
            if ( i % 2 == 0)
            System.out.println(i);
        }
        for( int i= 1; i<=100 ;i++) {
            if ( i % 3 == 0&&i % 5 == 0)
                System.out.println(i+"");
        }
        }
}