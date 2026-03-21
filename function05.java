import java.util.*;
public class function05 {
    public static void main(String[] args) {
        Welcome();
        sum();
        String message  = greet();
        System.out.println(message);
        int ans = sum2(4,6);
        System.out.println(ans);
        int a = 2324;
        System.out.println(reverse(a));
        System.out.println(sum1(a));
        int a1 = 48 , b1 = 18; 
        System.out.println(primegcd(a1, b1));
        int d = 121;
        System.out.println(pallendromcheck(d));
        int mul = 234;
        System.out.println(productofdigit(mul));
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

    //Return  the value
    static String greet(){
        String greeting = "How are you";
        return greeting;
    }

    //Pass the value of numbers when you are calling the method in main()
    static int sum2(int a , int b){
        int sum = a + b;
        return sum;
    }

    static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int rem = n %10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }

    static int sum1(int n){
        int sum = 0;
        while( n != 0){
            int rem = n %10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }

    static boolean prime(int n){
        int count = 0;
        for(int i = 1; i<=n; i++){
            if( n% 1 == 0) count++;
        }
        if(count == 2 ) return true;
        else return false ;
    }

    static int primegcd(int a1 , int b1){
        int gcd = 1;
        int min = Math.min(a1, b1);
        for(int i = min; i>=1; i--){
            if( a1%i == 0 && b1%i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    static boolean pallendromcheck(int n){
        int rev = 0;
        int dummy = n;
        while(n != 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/ 10;
        }
        if(rev == dummy) return true;
        else return false;
    }

    static int productofdigit(int n ){
        int pro = 1;
        while(n != 0){
            int rem = n % 10;
            pro = pro * rem;
            n =n/10;
        }
        return pro;
    }
}  


