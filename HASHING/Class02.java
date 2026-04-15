package HASHING;
import java.util.*;
public class Class02 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,6,3,5,3,5,2,2,1,4,5,6,3,3,5,4,7};
        Set<Integer> set = new HashSet<>();

        // for(int i = 0; i<arr.length ; i++){
        //   set.add(arr[i]);
        // }

        //for Each loop used in without indexing num
        for(int ele: arr){
            set.add(ele);
        }
        System.out.println(set);
        System.out.println(set.contains(6));

    }
}
