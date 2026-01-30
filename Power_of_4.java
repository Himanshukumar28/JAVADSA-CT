import java.util.*;
public class Power_of_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //POWER OF 4,1
        if(n<=0){
            System.out.println(false);
            return;
        }
        while(n>1){
            if(n%4 != 0){
                System.out.println(false);
                return;
            }
            n =n/4;
        }
        System.out.println(true);
    }
}