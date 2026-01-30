import java.util.*;
public class Remove0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value:");
        long n = sc.nextLong();
        //REMOVE ALL ZERO OF THE DIGITS
       // long n = 10203039;
        // long rev = 0;
        // while (n>=1) {
        //     long rem = n%10;
        //     if(rem!=0){
        //         rev = rev * 10 + rem;
        //     }
        //     n = n/10;
        // }
        // long rev1 = 0;
        // while(rev>=1){
        //     long rem = rev%10;
        //     rev1 = rev1 *10 + rem;
        //     rev = rev/10;
        // }
        // System.out.println(rev1);

        long rev = 0;
        while (n>=1) {
            long rem = n%10;
            if(rem!=0){
                rev = rev * 10 + rem;
            }
            n = n/10;
        }
        long rev1 = 0;
        while (rev>=1) {
            long rem = rev%10;
            rev1 = rev1 * 10 + rem;
            rev = rev/10;
        }
        System.out.println(rev1);



    }
}
