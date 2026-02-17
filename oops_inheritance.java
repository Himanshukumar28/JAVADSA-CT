public class oops_inheritance {
    public static void main(String[] args) {
        child c1 = new child();
        c1.age = 6;
        c1.eyeColor = "Black";

        System.out.println(c1.eyeColor);
    }
}

//SINGLE INHERITANCE

// class parents {
//     String name;
//     int age;
//     String gender;
// }

// class child extends parents {
//     String eyeColor;
// }

//MULTILEVEL INHERITANCE

class parents {
    String name;
    int age;
    String gender;
}

class child extends parents {
    String eyeColor;
}

class grandchild extends child{
    String rollno;
}

