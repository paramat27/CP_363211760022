package Exercise;
import java.util.Scanner;

public class Chapter5_2 {
    public static final double PI =3.141;
    //1. รับค่า รัศมีวงกลม (r)
    //2. หาพื้นที่วงกลม (PI * r * r)
    //3. หาเส้นรอบวง (2 *PI *r)
    //4. หาปริมาตรทรงกลม(4/2 * PI *r*r*r)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("รัศมีวงกลม (r) : ");
        double r = scanner.nextDouble();

        double area = PI * r * r;
        System.out.println("พื้นที่วงกลม:"+area);

        double x = 2 * PI * r;
        System.out.println("พื้นที่รอบวง:"+x);

        double k = 4/2*PI*r*r*r;
        System.out.println("ปริมาตรสุทธิ"+k);




    }





}
