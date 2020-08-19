package lab3;

import java.util.Scanner;

public class Example_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        while (num !=0){
            System.out.print("Enter integrs:");
            num = sc.nextInt();

        }
        System.out.print("Good Bye.");



    }
}
