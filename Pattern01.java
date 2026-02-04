import java.util.*;
public class Pattern01 {
    public static void main(String[] args) {
        //CREATE NESTED LOOP
        //THINK FOR ROWS AND COLLUMNS
        //GENERAL FORMULA
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

            for(int i = 1; i<=n; i++){
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        // for(int i = n; i>=1; i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-1; j++){
        //         System.out.print("#");
        //     }
        //     for(int k = 1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        



    }
}
