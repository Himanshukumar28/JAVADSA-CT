package ARRAY;
public class MiddleRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        int[] res = new int[n];
        int j = 0;  // index of res
        int x = (n - k)/ 2;

        for(int i = x; i<x+k; i++){
            res[j] = arr[i];
            j++;
        }
        for(int i = 0; i<x; i++){
            res[j] = arr[i];
            j++;
        }
        for(int i = x+k; i<n; i++){
            res[j] = arr[i];
            j++;
        }
        System.out.println(res);
    }
        }
    

