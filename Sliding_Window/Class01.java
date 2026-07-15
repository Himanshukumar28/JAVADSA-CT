package Sliding_Window;

public class Class01 {
    public static void main(String[] args) {
        int arr[] = {3,4,1,7,6,3,2};
        int k = 3;

        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        //Precompute First Element
        for(int i = 0; i<k; i++){
            sum = sum + arr[i];
        }
        max = sum;
        //Now Start From the Second
        for(int i = 1; i<=n-k; i++){
            //Shrink
            sum = sum - arr[i-1];
            //Expand
            sum = sum + arr[i+k-1];
             //Update 
            max = Math.max(max , sum);
        }
            System.out.print(max);
        }
    }

