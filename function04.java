import java.util.*;
public class function04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printsquarepattern(n);
        printbinary(n);
        printrighttringle(n);
        printsquarehollow(n);
        printhalfbutterfly(n);
        printbutterfly(n);
        printdiamon(n);
    }

    public static void printsquarepattern(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printrighttringle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printbinary(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(i%2 == 0){
                    if(j%2 ==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                else{
                    if(j%2 ==0){
                        System.out.print("0");
                    }
                    else{
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printsquarehollow(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if( i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    if(j ==1 || j ==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printhalfbutterfly(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }

    public static void printbutterfly(int n){
        for(int i = 1; i<=n-1; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printdiamon(int n){
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}



