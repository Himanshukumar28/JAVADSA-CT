public class function01 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));
        System.out.println(ttribonaci(n));
    }
    public static int fibonacci(int n){
        if( n ==0 || n ==1) return n;
        int a = 0 , b = 1 , sum =0;
        for(int i = 2; i<=n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

    // public static int ttribonaci(int n){
    //     if(n==0 || n==1) return n;
    //     if(n==2) return 1;
    //     int a = 0 , b = 1 , c = 1 , sum = 0;
    //     for(int i = 3; i<=n; i++){
    //         sum = a + b +c;
    //         a = b;
    //         b = c;
    //         c = sum;
    //     }
    //     return sum;
    // }
}
