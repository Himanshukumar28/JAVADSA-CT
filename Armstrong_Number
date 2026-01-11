import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dummy = n;
        int copy = n;
        int dc = 0;
        int sum = 0;
        while(n!=0){
            dc = dc + 1;
            n = n/10;
        }
        while(dummy != 0){
            int rem = dummy % 10;
            sum = sum + (int)Math.pow(rem , dc);
            dummy =  dummy /10;
        }
        if(copy == sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

        // User function Template for Java
// class Solution {
//     static boolean armstrongNumber(int n) {
//         // code here
//         int sum = 0;
//         int dummy = n;
//         while(n!=0){
//             int rem = n % 10;
//             sum = sum + rem*rem*rem;
//             n = n/10;
//         }
//         if(dummy == sum){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }
        
    }
}
