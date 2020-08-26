package Exercise;
import com.sun.deploy.security.SelectableSecurityManager;
import sun.security.util.Password;
import java.util.Scanner;
public class Exercise_Lab_Login {
    public static void main(String[] args) {
        //define account
        String username = "admin";
        String password = "1234";
        //create Scanner object as sc
        Scanner sc = new Scanner(System.in);
        int count = 0;
       do {
            System.out.println("Username: ");
            String u = sc.nextLine();
            System.out.println("Password: ");
            String p = sc.nextLine();
            if (u.equals(username) && p.equals(password)) {
                System.out.println("Welcome to MT System.");
                break;
            } else {
                System.out.println("Username or Password is not corrected.");
                count++;
                if (count== 3){
                    System.out.println("Your account has been locked.Please,contact admin.");
                }
            }
        }while (count < 3);


    }
}