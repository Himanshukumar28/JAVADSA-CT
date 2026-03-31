package ARRAY;
import java.util.*;

public class First_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array Element: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i =0; i<size; i++){
            max = Math.max(max , arr[i]);
        }
        System.out.print("Largest Number is : " + max);
    }
}
