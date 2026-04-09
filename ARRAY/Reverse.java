package ARRAY;

public class Reverse {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int n = s.length;
        int low = 0;
        int high = n-1;
        while(low < high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        System.out.println(s);
    }
}
