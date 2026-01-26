import java.util.*;
public class Que_Practic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //SECOND MAXIMUM
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int d = sc.nextInt();

        // int smax = 0;
        // int max  =Math.max(Math.max(Math.max(a,b),c),d);
        // int min = Math.min(Math.min(Math.min(a,b),c),d);

        // if(a!=max && a!=min){
        //     smax = Math.max(smax,a);
        // }
        // if(b!=max && b!=min){
        //     smax = Math.max(smax,b);
        // }
        // if(c!=max && c!=min){
        //     smax = Math.max(smax,c);
        // }
        // if(d!=max && d!=min){
        //     smax = Math.max(smax,d);
        // }
        // System.out.println(smax);

        //PRIME NUM
        // int n = sc.nextInt();
        // if(n<=1){
        //     System.out.println("Neha is Sad");
        // }
        // else{
        //     boolean isprime = true;
        //     for(int i =2; i*i<=n; i++){
        //         if(n%i==0){
        //             isprime  = false;
        //             break;
        //         }
        //     }
        //     if(isprime){
        //         System.out.println("Neha is Happy");
        //     }
        //     else{
        //         System.out.println("Neha is Sad");
        //     }
        // }

        //TRIBONACCI SERIES
        // int  a = 0;
        // int b = 0;
        // int c = 1;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // for(int i=4; i<=10; i++){
        // int d = a + b + c ;
        //     System.out.println(d+" ");
        //     a = b;
        //     b =c;
        //     c =d;
    
        // }

        //IN TERMS
        System.out.print("Enter value");
        int n  = sc.nextInt();
        if(n==0){
            System.out.print(0);
        }
        else if(n==1|| n==2){
            System.out.print(1);
        }else{
            int a = 0, b=1 , c = 1;
            for(int i  =3; i<=n; i++){
                int next = a + b + c;
                a =b;
                b= c;
                c =next;
            }
            System.out.print(c);
        }
    sc.close();

    
        //LEETCODE 3099
        // int x = 25;
        // int sum = 0;
        // int temp = x;
        // while (temp>0) {
        //     sum = temp % 10 + sum;
        //     temp = temp / 10;
        // }
        // if(x % sum ==0){
        //     System.out.println(sum);
        // }
        // else{
        //     System.out.println(-1);
        // }

        //LEETCODE 3783.
    //     int n = sc.nextInt();
    //    // int n = 25;
    //     int rev = 0;
    //     int N = n;
    //     while(n>0){
    //         int rem = n%10;
    //         rev = rev * 10 + rem;
    //         n = n/10;
    //     }
    //     int ans = Math.abs(N - rev);
        //System.out.println(n);
        



    }
}
