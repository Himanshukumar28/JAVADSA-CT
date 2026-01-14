public class Oue_Operator {
    public static void main(String[] args) {
        //Que01
        // int i = 11;
        // i = i++ +  ++i;
        // System.out.println(i);

        // Que02
        // int a = 11; 
        // int b = 22; 
        // int c ;
        // c = a + b  + a++ + b++  + a++  + b++;
        // System.out.println("a=" + a);
        // System.out.println("b="+ b);
        // System.out.println("c="+c);

        //Que03
        //compilation error:
        // int a = 11++;
        // System.out.println(a);

        //Que04.
        // int ch = 'A';
        // System.out.println(ch++);

        //Que05.
        // char ch = 'A';
        // System.out.println(++ch);

        //Que06.
        // double d = 1.5;
        // double D = 2.5;
        // System.out.println(d++  + ++D);

        //Que07.
        // int  m=1010;
        // int  n = 1010;
        // System.out.println(m++ / ++n * n-- / --m);

        //Que02.
        char ch = "123".charAt(1);
        System.out.println(ch++ + ++ch);
    }
}
