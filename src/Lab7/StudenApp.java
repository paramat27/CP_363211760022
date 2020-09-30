package Lab7;

public class StudenApp {
    public static void main(String[] args) {

        //create object of Student class
        Student std1 = new Student();

        std1.setName("Paramat Pantawip");
        std1.setPerson_id("1234567899877");
        std1.setAge(21);

        displayDataOject(std1);

        Student std2 = new Student();
        std2.setName("Kanokwan");
        std2.setPerson_id("9874561230000");
        std2.setAge(61);

        displayDataOject(std2);
        Student std3 =new Student("Paramat","1234567899874",40);
        displayDataOject(std3);
        System.out.println(std3.toString());


    }

    private static void displayDataOject(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }
}
