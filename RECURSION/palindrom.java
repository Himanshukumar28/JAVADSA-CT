//package RECURSION;

public class palindrom {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        System.out.println(reverse(rev , n , n));
    }
    static boolean reverse(int rev , int n , int dummy){
        if(n == 0 ) return rev == dummy;
        return reverse(rev*10+n%10, n/10 , dummy);
    }
}
