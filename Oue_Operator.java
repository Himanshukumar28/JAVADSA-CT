public class Oue_Operator {
    public static void main(String[] args) {
        //Que01
        // int i = 11;
        // i = i++ +  ++i;
        // System.out.println(i);

        // int a = 11; 
        // int b = 22; 
        // int c ;
        // c = a + b  + a++ + b++  + a++  + b++;
        // System.out.println("a=" + a);
        // System.out.println("b="+ b);
        // System.out.println("c="+c);

        //compilation error:
        int a = 11++;
        System.out.println(a);
        
    }
}
