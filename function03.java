import java.util.*;
public class function03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(reversOfN(n));
        System.out.println(palindromeCheck(n));
        System.out.println(productOfDigits(n));
        System.out.println(checkArmstrongNumber(n));
        int x = 10;
        System.out.println(harshadnumber(x));
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

    public static int productOfDigits(int n){
        int pro = 1;
        while(n!= 0){
            int rem = n % 10;
            pro = pro * rem;
            n = n /10;
        }
        return pro;
    }

    public static boolean checkArmstrongNumber(int n){
        int count = 0;
        int d1 = n;
        int d2 = n;
        while(n != 0){
            count++;
            n = n /10;
        }
        int sum = 0;
        while(d1 != 0){
            int rem = d1 % 10;
            int ans = 1;
            for(int i = 1; i<=count; i++){
                ans = ans * rem;
            }
            sum = sum + ans;
            d1 = d1/10;
        }
        if(d2==sum) return true;
        else return false;
    }

    public static int harshadnumber(int x){
         int sum = 0;
        int temp = x;
        while(temp>0){
            sum = temp % 10 + sum;
            temp = temp/10;
        }
         if(x % sum == 0)
            return sum;
         else
            return -1;
    }
}
