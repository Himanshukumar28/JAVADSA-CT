// package RECURSION;

public class reverse {
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;
        System.out.println(reverse(rev , n ));
    }
    static int reverse(int rev , int n ){
        if(n == 0 ) return rev ;
        return reverse(rev*10+n%10, n/10 );
    }
}
