import java.util.*;
public class Power_Of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //POWER OF 2
        // int n  = sc.nextInt();
        // if(n<=0){
        //     System.out.println(false);
        // }
        // else{
        //     boolean check = true;
        //     while(n !=1){
        //         if(n % 2 == 0){
        //             n = n/2;
        //         }
        //         else{
        //             check = false;
        //             break;
        //         }
        //     }
        //     if(check == true){
        //         System.out.println(true);
        //     }
        //     else{
        //         System.out.println(false);
        //     }
        // }

        //POWER OF 3
        // int n = sc.nextInt();
        // if(n<=0){
        //         System.out.println(false);
        // }
        // else{
        //     boolean check = true;
        //     while(n!=1){
        //         if(n%3==0){
        //             n = n/3;
        //         }
        //         else{
        //             check = false;
        //             break;
        //         }
        //     }
        //     if(check==true){
        //             System.out.println(true);
        //         }
        //         else{
        //             System.out.println(false);
        //         }
        // }

        //POWER OF 4

        int n = sc.nextInt();
        if(n<=0){
            System.out.println(false);
        }
        else{
            boolean check = true;
            while(n != 1){
                if(n%4==0){
                    n = n/4;
                }
                else{
                    check = false;
                    break;
                }
            }
            if(check==true){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        
        

    
    }
}
