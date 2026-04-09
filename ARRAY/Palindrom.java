package ARRAY;

public class Palindrom {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 222, 111};
        int n  = arr.length;
        int low = 0;
        int high = n-1;
        Boolean isplindrome = true;
        while(low < high){
            if(arr[low] != arr[high]){
                isplindrome  = false;
                break;
            }
            low++;
                high--;
        }
        System.out.println(isplindrome);
    }
}
