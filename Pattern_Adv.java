import java.util.*;
public class Pattern_Adv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //HALF BUTTER FLY

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //REVERS HALF BUTTER FLY

        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //BUTTER FLY

        for(int i = 1; i<=n-1; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //DIAMOND 

        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j = 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    


    }
}
