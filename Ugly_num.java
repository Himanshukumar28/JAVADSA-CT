import java.util.*;
public class Ugly_num {
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println(false);
            return;
        }
        while(n>1) {
            if(n%2==0){
                n = n/2;
            }
            else if(n%3==0){
                n = n/3;
            }
            else if(n%5==0){
                n = n/5;
            }
            else{
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
