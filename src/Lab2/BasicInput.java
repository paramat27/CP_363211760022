package Lab2;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name ?: ");
        String name = scanner.nextLine();
        System.out.println("Your name is "+name);

        System.out.print("อายุเท่าไร ?: ");
        int age = scanner.nextInt();
        System.out.println("ฉันอายุ "+age);

        System.out.print("Enter you nick name ?: ");
        String nickname = scanner.nextLine();
        System.out.println("Your nickname is "+nickname);
    }
}
