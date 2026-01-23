import java.util.*;
public class Que_Practic02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //LEETCODE 2413
        // int n = 6;
        // int sint = 0;
        // for(int i=n; i>=n; i++){
        //     if(i%n==0 && i%2==0){
        //         sint = sint + i;
        //         break;
        //     }
        // }
        // System.out.println(sint);

        //LEETCODE 2427
        // int a = 12;
        // int b = 6;
        // int cout = 0;
        // for(int i = 1;i<=Math.min(a,b); i++){
        //     if(a%i==0 && b%i==0){
        //        // cout = cout + 1;
        //         cout++;
        //     }
        // }
        // System.out.println(cout);

        //LEETCODE 2119
        int num = sc.nextInt();
        //int num = 250;
        if(num ==0){
            System.out.println(true);
        }
        else if(num % 10==0){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }


    }
}
