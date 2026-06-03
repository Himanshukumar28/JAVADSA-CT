package HASHING;
import java.util.*;
public class Hashmap01 {
    public static void main(String[] args) {

        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("china" , 150 );
        hm.put("UK" , 50);
        hm.put("Indonesia", 10);
        hm.put("NePal" , 5 );
        hm.put("USA" , 60);

        System.out.println(hm);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys="+k+ ",values="+hm.get(k));
        }
    }
}
