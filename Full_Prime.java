import java.util.*;
public class Full_Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //FULL PRIME
        // int n = sc.nextInt();
        // boolean check = true;
        // while (n>0) {
        //     int rem = n%10;
        //     if(rem==0|| rem==1||rem==4||rem==6||rem==8||rem==9){
        //         check =false;
        //         break;
        //     }
        //     n=n/10;
        // }
        // if(check==false){
        //     System.out.println(false);
        // }
        // else{
        //     System.out.println(true);
        // }


        int n =sc.nextInt();
        boolean check = true;
        
        while(n>0){
            int rem = n%10;
            if(rem==0||rem==1||rem==3||rem==4||rem==6||rem==8||rem==9){
                check = false;
                break;
            }
            n=n/10;
        }
        if(check==false){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}
