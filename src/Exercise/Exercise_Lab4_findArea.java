package Exercise;
import java.util.Scanner;
//พื้นที่สามเหลี่ยม =0.5 * w * h
//พื้นที่วงกลม =pi * r * r * r
//พื้นทรงกรวย =1/3 * pi * r * r * h
public class Exercise_Lab4_findArea {
    public static void main(String[] args) {
        // user select list menus 1-4
        Scanner sc = new Scanner(System.in);
        int select;
        boolean b = false;
        do {
            System.out.println("Please, select menu below: ");
            System.out.println("1. คำนวนพื้นที่สามเหลี่ยม");
            System.out.println("2. คำนวนพื้นที่วงกลม");
            System.out.println("3. คำนวนพื้นที่ทรงกรวย");
            System.out.println("4. ออกจากโปรแกรม");
            System.out.println(" เลือก ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    findTiangleArea();
                    break;
                case 2:
                    ;
                    findCircleArea();
                case 3:
                    ;
                    findConeArea();
                case 4:
                    ;
                    System.exit(1);
                    break;
            }

        } while (b);
    }

    private static void findConeArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("รัศมีของทรงกรวย:");
        double r = sc.nextDouble();
        System.out.println("ความสูงของทรงกรวย:");
        double h = sc.nextDouble();
        double area = (1.0/3.0) * (22/7) * r * r * h ;
        System.out.println("พื้นที่ทรงกรวย  ="+area);

    }

    private static void findCircleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("รัศมีวงกลม:");
        double r = sc.nextDouble();
        double area = 22/7 * r * r * r ;
        System.out.println("พื้นที่วงกลม ="+area);
    }

    private static void findTiangleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ความยาวฐานสามเหลี่ยม:");
        double b = sc.nextDouble();
        System.out.println("ความสูงสามเหลี่ยม:");
        double h = sc.nextDouble();
        double area = 0.5 * b * h ;
        System.out.println("พื้นที่สามเหลี่ยม  ="+area);
    }
}