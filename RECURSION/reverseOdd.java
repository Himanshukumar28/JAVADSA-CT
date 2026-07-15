//package RECURSION;

public class reverseOdd {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        System.out.println(reverseOdd(rev , n));

    }
    public static int reverseOdd(int n , int rev){
        if(n == 0) return rev;
        if(n % 2 != 0) return reverseOdd(rev*10+n%10 , n/10);
        else return reverseOdd(rev , n);
    }
}
