import java.util.*;
public class Class07 {
    public static void main(String[] args) {
        //POWER OF 2 , 3, 5 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value");
        int n = sc.nextInt();
        int n1 = n;
        int n2 = n;
        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;
        while(n>1){
            if(n%2==0){
                n = n/2;
            }else{
                    check1 = false;
                break;
                }
        }
        while(n1>1){
            if(n1%3==0){
                n1 = n1/3;
            } else{
                    check2 = false;
                break;
                }
        }
        while(n2>1){
            if(n2%4==0){
                n2 = n2/4;
            } else{
                    check3 = false;
                break;
                }
        }
        if(check1==true){
            System.out.println("Power of 2");
        }
        if(check2==true){
            System.out.println("Power of 3");
        }
        if(check3==true){
            System.out.println("Power of 4");
        }
       
    }
}
