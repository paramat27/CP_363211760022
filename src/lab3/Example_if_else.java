package lab3;

import java.util.Scanner;

public class Example_if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter integer 1: ");
        int x = scanner.nextInt();
        System.out.println("Enter integer 2: ");
        int y = scanner.nextInt();

        if (x > y){
            System.out.println(x+"more than"+y);
        } else {
            System.out.println(x+ "less than"+y);
        }






    }
}
