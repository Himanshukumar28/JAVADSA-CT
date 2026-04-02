package ARRAY;
import java.util.*;
public class Move_Zero {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,2,0};
        int n = arr.length;
        int[] copy = new int[n];
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] !=0){
                copy[j] = arr[i];
                j++;
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(copy[i] + " ");
        }
    }
}
