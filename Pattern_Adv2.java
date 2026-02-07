import java.util.*;
public class Pattern_Adv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //7feb
        //SQUARE HOLLOW
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         if(i ==1 || i==n){
        //             System.out.print('*');
        //         }
        //         else{
        //             if(j==1 || j==n){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print("  ");
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        //TRIANGLE

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");  //space
        //     }
        //     for(int j = 1; j<=2*i-1; j++){
        //         System.out.print("*");  //star
        //     }
        //     System.out.println();
        // }

        //DIAMOND
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");  //space
        //     }
        //     for(int j = 1; j<=2*i-1; j++){
        //         System.out.print("*");  //star
        //     }
        //     System.out.println();
        // }
        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");  //space
        //     }
        //     for(int j = 1; j<=2*i-1; j++){
        //         System.out.print("*");  //star
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);  //num
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");  //space
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i);  //num
            }
            System.out.println();
        }
        
        

    }
}
