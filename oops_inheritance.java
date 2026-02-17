public class oops_inheritance {
    public static void main(String[] args) {
        // child c1 = new child();
        // c1.age = 6;
        // c1.eyeColor = "Black";

        // grandchild c2 = new grandchild();
        // c2.roleno = 21;

        // System.out.println(c1.eyeColor);
        // System.out.println(c2.roleno);

        child1 c1 = new child1();
        c1.age = 18;
        c1.height = 6;
        System.out.println(c1.height);
        System.out.println(c1.age);
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

// class parents {
//     String name;
//     int age;
//     String gender;
// }

// class child extends parents {
//     String eyeColor;
// }

// class grandchild extends child{
//     int roleno;
// }

//HEIRARICAL INHERITANCE

class parents {
    String name;
    int age;
    String gender;
}
class child1  extends parents{
    int height;
}
class child2 extends parents{
    int height;
}
class child3 extends parents{
    int height;
}


