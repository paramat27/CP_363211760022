package Exercise;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar SPC1 = new SuperCar();
        SPC1.setCarBrand("BMW");
        SPC1.setCarColor("Black");
        SPC1.setCarEngineSize(3000);
        SPC1.setMaxSpeed(1000);
        SPC1.setCountryOfOrigin("Thailand");

        displayDataOject(SPC1);

        SuperCar SPC2 = new SuperCar();
        SPC2.setCarBrand("Yamaha");
        SPC2.setCarColor("Red");
        SPC2.setCarEngineSize(150);
        SPC2.setMaxSpeed(130);
        SPC2.setCountryOfOrigin("Japen");
        displayDataOject(SPC2);

        SuperCar SPC3 = new SuperCar();
        SPC3.setCarBrand("Honda");
        SPC3.setCarColor("White");
        SPC3.setCarEngineSize(560);
        SPC3.setMaxSpeed(350);
        SPC3.setCountryOfOrigin("Japen");
        displayDataOject(SPC3);

        SuperCar SPC4 = new SuperCar();
        SPC4.setCarBrand("Ferrary");
        SPC4.setCarColor("Red");
        SPC4.setCarEngineSize(560);
        SPC4.setMaxSpeed(490);
        SPC4.setCountryOfOrigin("England");
        displayDataOject(SPC4);

        SuperCar SPC5 = new SuperCar();
        SPC5.setCarBrand("Lambokiny");
        SPC5.setCarColor("Red");
        SPC5.setCarEngineSize(560);
        SPC5.setMaxSpeed(490);
        SPC5.setCountryOfOrigin("England");
        displayDataOject(SPC5);




    }

    private static void displayDataOject(SuperCar SPC) {
        System.out.println(SPC.getCarBrand());
        System.out.println(SPC.getCarColor());
        System.out.println(SPC.getCarEngineSize());
        System.out.println(SPC.getCountryOfOrigin());
        System.out.println(SPC.getMaxSpeed());
    }
}
