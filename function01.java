public class function01 {
    public static void main(String[] args) {
        int n = 5;
        int a = 12;
        int b = 18;
        System.out.println(fibonacci(n));
        System.out.println(ttribonaci(n));
        System.out.println(prime(n));
        System.out.println(printgcd(a,b));
        welcome();
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

    public static int ttribonaci(int n){
        if(n==0 || n==1) return n;
        if(n==2) return 1;
        int a = 0 , b = 1 , c = 1 , sum = 0;
        for(int i = 3; i<=n; i++){
            sum = a + b +c;
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }

    public static boolean prime(int n){
        int cout =  0;
        for(int i = 1; i<=n; i++){
            if(n%i==0) cout++;
        }
        if(cout==2)return true;
        else return false;
    }

    public static int printgcd(int a , int b){
        int gcd = 1;
        int min = Math.min(a, b);
        for(int i = min; i>=1; i--){
            if(a % i ==0 && b % i ==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void welcome(){
        System.out.println("Welcome home");
    }
}
