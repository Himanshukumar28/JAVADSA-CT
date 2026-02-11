public class function02 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n));
    }

    public static int reverse(int n){
        int rev = 0;
        while(n!= 0 ){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }

    public static 
}
