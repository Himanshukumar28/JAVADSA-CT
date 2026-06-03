package HASHING;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert 0(1)
        hm.put("India", 100);
        hm.put("china" , 150 );
        hm.put("UK" , 50);

        System.out.println(hm);

        //Get - 0(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        //ContainsKey - 0(1)
        // System.out.println(hm.containsKey("India")); // true
        // System.out.println(hm.containsKey("Indonesia")); //false

        //Remove - 0(1)
        // System.out.println(hm.remove("UK"));
        // System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //IS Empty
        System.out.println(hm.isEmpty());
    }
}
