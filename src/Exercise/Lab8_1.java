package Exercise;

public class Lab8_1 {
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50};
        int max = FineMax(number);
        System.out.println("The maximum number is "+max);
    }

    private static int FineMax(int[] number) {
        int max = number[0];
        try {
            System.out.println(number[0]);


        for (int i = 0; i <= 5 ; i++)
            if (max <= number[i])
                max = number[i];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  max ;
    }
}
