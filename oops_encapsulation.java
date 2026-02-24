public class oops_encapsulation {
    public static void main(String[] args) {

        Student s1 = new Student();
       // s1.name = "Himanshu"; // Not possible because name entity is private
        s1.setName("himanshu"); // setName change the value after calling the setName funnction
        s1.setAge(20);
        s1.setGender("Mail");
        System.out.println(s1.getName()); //getName return the  value
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());
    }
}
class Student{
    private String name;
    private int age;
    private String gender;
    //setter
    public void setName(String name){       //Non static Kyunki access krni hai main function me ess student class ke function ko
        this.name = name;
    }
    public String getName(){
        return name;   
    }
    public void setAge(int age){
        this.age = age;
    } 
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
}
