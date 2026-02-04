import java.util.*;
public class Full_Prime_Adv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //FULL PRIME ADVANCE MEANS NUMBER PRIME AND ALL DIGITS ARE PRIME:
        int cout = 0;
        int temp = n;

        if(n<=0){
            System.out.println(false);
            return;
        }
        for(int i=1; i<=n; i++){
                if(n%i==0){
                    cout++;
                }
            }
            if(cout==2){
                boolean check = true;
                while(temp>0){
                    int rem = temp%10;
                    if(rem ==2 || rem==3 ||rem==5 || rem ==7 ){
                        temp = temp/10;
                    }
                    else{
                        check = false;
                        break;
                    }
                    }
                    if(check == true){
                        System.out.println(true);
                    }
                    else{
                        System.out.println(false);
                    }
                }
                else{
                    System.out.println(false);
                }

                //OR
                // int cout = 0;
                // for(int i = 1; i<=n; i++){
                //     if(n%i==0){
                //         cout++;
                //     }
                //     if(cout==2){
                //         boolean check = true;
                //         while(n!=0){
                //             int rem = n%10;
                //             if(rem==0 || rem==1 || rem==4 || rem==6 || rem==8 || rem==9){
                //                 check = false;
                //                 break;
                //             }
                //             n = n/10;
                //         }
                //         if(check==true){
                //             System.out.println(true);
                //         }
                //         else{
                //             System.out.println(false);
                //         }
                //     }
                //     else{
                //             System.out.println(false);
                //         }
                // }






            }
        }
    

