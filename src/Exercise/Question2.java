package Exercise;
import java.util.Scanner;
public class Question2 {

    static class BMI
    {
        public static void main(String []args)
        {
            Scanner me = new Scanner(System.in);
            String gender = me.nextLine();



            System.out.print("อายุเท่าไร?: ");
            int age = me.nextInt();

            System.out.print("น้ำหนัก: ");
            double weight = me.nextDouble();

            System.out.print("ส่วนสูง: ");
            double h = me.nextDouble();
            double bmr = 0;

            if (gender == "M"){
                bmr = ((10*weight)+(6.25*h)-(5*age)+5);
            }
            else
            {
                bmr = ((10*weight)+(6.25*h)-(5*age)-161);
            }
            System.out.println("your BMR is :"+bmr);

            System.out.println("คุณออกกำลังกายมากเท่า?");
            System.out.println("1.) ไม่ออกเลย");
            System.out.println("2.) 1-3ต่อสัปดาห์");
            System.out.println("3.) 3-5ต่อสัปดาห์");
            System.out.println("4.) 6-7ต่อสัปดาห์");
            System.out.println("5.) ออกกำลังกายหนักมาก");
            Scanner me2 = new Scanner(System.in);
            System.out.print("Select ?:");
            int seclect = Integer.parseInt(me2.nextLine());
            double tdee = 0;
            if (seclect == 1){
                tdee = bmr *1.2;
            }else if (seclect == 2){
                tdee = bmr *1.375;
            }else if (seclect == 3){
                tdee = bmr *1.55;
            }else if (seclect == 4){
                tdee = bmr *1.725;
            }else {
                tdee = bmr *1.99;
            }
            System.out.println("your TDEE is:"+tdee);







        }
    }
    }

