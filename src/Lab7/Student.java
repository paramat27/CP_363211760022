package Lab7;
public class Student {
    private String name;
    private String person_id;
    private int age;

    public Student(){}

    public Student(String n,String pid,int a){
        name = n;
        person_id = pid;
        age = a;
    }
    //getter and setter
    //get คือ อ่านข้อมูลจาก attribute ของ object
    //set คือ เปลี่ยนแปลงหรือปรับปรุงข้อมูล attribute ของ object

    public String getName (){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getPerson_id(){
        return person_id;
    }
    public void setPerson_id(String p_id){
        person_id = p_id;
    }
    public int getAge(){
        return age;
    }
    public  void setAge(int a){
        age = a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", person_id='" + person_id + '\'' +
                ", age=" + age +
                '}';
    }
}//class