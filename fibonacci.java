import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = 0;
        // int y = 1;
        // int z = 0;
        // int n ;
        // System.out.println("Enter Max Value");
        // int val = sc.nextInt();
        // while (z<=val) {
        //     System.out.println(z);
        //     x = y;
        //     y = z;
        //     z = x + y;
        // }

        //IN TERMS USING WHILE LOOP
    //     Scanner sc = new Scanner(System.in); 
    //     int x = 0;
    //     int y = 1;
    //     int z =0;
    //     int term = 1;
    //     System.out.println("Enter value");
    //     int N = sc.nextInt();
    //     while(term<=N){
    //         System.out.println(z);
    //         x = y;
    //         y = z ;
    //         z =x+y;
    //         term = term + 1;
    //     }

        //FIBONACCI USING FOR LOOP 
        int a = 0;
        int b = 1;
        int c  = 0;
        for(int i = 1; i<=10; i++){
            System.out.println(c);
            a = b;
            b = c;
            c = a+ b;
            
        }
    }
}
