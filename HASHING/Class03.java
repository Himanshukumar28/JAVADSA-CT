package HASHING;
import java.util.*;
public class Class03 {
    public static void main(String[] args) {
        int[] arr = {4,2,3,4,3,2,3,4,2,2,3,1,5,5,6};

        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for(int ele : arr){
            set1.add(ele);
            set2.add(ele);
        }

        System.out.println(set1);
        System.out.println(set2);

    }
}
