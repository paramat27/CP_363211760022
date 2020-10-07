package Exercise;

import java.io.IOException;
import java.util.Scanner;

class Exception extends Throwable {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();  // text

        int x = 0;
                try {
                    x = Integer.parseInt(s);  // String to int
                }catch (NumberFormatException e){
                    System.out.println("Can not transfer String to int.");
                }


        System.out.println(x);




    }
}
