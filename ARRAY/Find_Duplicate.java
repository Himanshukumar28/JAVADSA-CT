package ARRAY;

import java.util.Arrays;

public class Find_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,7};
        int n = arr.length;
        Arrays.sort(arr);
        Boolean check = false;
        for(int i = 1; i<n; i++){
            if(arr[i] == arr[i-1]){
                System.out.println(arr[i]);
                check = true;
                break;
            }
        }
        if(!check)
        System.out.println("-1");
    }
}
