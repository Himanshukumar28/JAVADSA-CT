import java.util.*;

public class function06 {
  public static int  count(int n){
    int c = 0;
    while(n>0){
      c++;
      n = n/10;
    }
    return c;
  }
  public static int power(int a , int b){
    int ans = 1;
    for(int i = 1; i<=b; i++){
      ans = ans*a;
    }
    return ans;
  } 
    public static void main(String[] args) {
       //int n = 153;
       Scanner sc = new Scanner(System.in);
       int lr = sc.nextInt();
       int ur = sc.nextInt();
       for(int i = lr; i<= ur; i++){
        if(checkArmstrong(i) == true){
          System.out.println(i);
        }
       }

    }
    public static boolean checkArmstrong(int n ){
      int cd = count(n);
      int sum = 0;
      int dummy = n;
      while(n > 0){
        int id = n % 10;
        sum = sum + power(id , cd);
        n = n/10;
      }
      return sum == dummy;
  }
}