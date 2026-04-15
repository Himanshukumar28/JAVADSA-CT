package HASHING;
import java.util.*;

public class Class01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(1);
        set.add(3);
        set.add(2);

        System.out.println(set);
        System.out.println(set.contains(3));
    }
}
