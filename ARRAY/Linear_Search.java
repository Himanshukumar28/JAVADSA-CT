package ARRAY;
import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        
        // int[] arr = {1,2,3,4,5};
        // int n = arr.length;
        // //Linear Search
        // int target = 5;
        // //travers
        // boolean check = false;
        // for(int i = 0; i<n; i++){
        //     if(arr[i] == target){
        //         check = true;
        //         break;
        //     }
        // }
        // System.out.print(check);

        //USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array length :");

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target :");
        int target = sc.nextInt();
        Boolean check = false;
        for(int i =0; i<size; i++){
            if(arr[i] == target){
                check = true;
                break;
            }
        }
        System.out.print(check);
        sc.close();
    }
}
