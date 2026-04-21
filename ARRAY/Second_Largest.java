package ARRAY;
import java.util.*;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size:- ");
        int size = sc.nextInt();

        System.out.print("Enter Array Element:- ");
        int[] arr = new int[size];
        for(int i =0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1];
        Boolean found = false;
        for(int i = n-1; i>=0; i--){
            if(arr[i] != max){
                System.out.print(arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print(-1);
        }
        sc.close();
    }
}
