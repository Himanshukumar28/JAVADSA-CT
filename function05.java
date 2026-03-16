import java.util.*;
public class function05 {
    public static void main(String[] args) {
        Welcome();
        sum();
        String message  = greet();
        System.out.println(message);
    }
    static void Welcome(){
    System.out.println("Welcome");
}

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " + sum);

    }

    //Retur the value
    static String greet(){
        String greeting = "How are you";
        return greeting;
    }

    }


