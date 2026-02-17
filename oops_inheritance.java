public class oops_inheritance {
    public static void main(String[] args) {
        child c1 = new child();
        c1.age = 6;
        c1.eyeColor = "Black";
        
        System.out.println(c1.eyeColor);
    }
}

class parents {
    String name;
    int age;
    String gender;

}
class child extends parents {
    String eyeColor;
}
