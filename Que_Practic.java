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
        int  a = 0;
        int b = 0;
        int c = 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for(int i=4; i<=10; i++){
        int d = a + b + c ;
            System.out.println(d+" ");
            a = b;
            b =c;
            c =d;
    
        }
    


    }
}
