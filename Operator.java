public class Operator {
    public static void main(String[] args) {
        //unary operator
        // int a = 5;
        // a++;
        // ++a;
        // a++;
        // System.out.println(a);

        int a = 12;
        int b = 23;

        int c =  a++ + b-- + ++a + ++b - ++a;
        System.out.println(c);



    }
}
