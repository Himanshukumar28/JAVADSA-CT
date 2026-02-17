public class oop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "XYZ";
        s1.age = 20;
        s1.enroNo = "13324";

        Teacher t1 = new Teacher();
        t1.name = "ZXY";
        t1.age = 29;
        t1.empNo = "124";
        t1.gender = "Mail";

        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(t1.empNo);
        System.out.println(t1.gender);
    }
}

    class Student{
        String name;
        int age;
        String gender;
        String enroNo;
    }

    class Teacher{
        String name;
        int age;
        String gender;
        String empNo;
    }

