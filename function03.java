import java.util.*;
public class function03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reversOfN(n));
        System.out.println(palindromeCheck(n));
    }

    public static int reversOfN(int n){
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev * 10 +rem;
            n = n/10;
        }
        return rev;
    }

    public static boolean palindromeCheck(int n){
        int rev = 0;
        int dummy = n;
        while (n!= 0) {
            int rem = n  %10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(rev == dummy) return true;
        else return false;
    }
}
