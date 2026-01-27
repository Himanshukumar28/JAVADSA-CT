public class Pattern {
    public static void main(String[] args) {

        // for(int i = 1; i<=5; i++){
        //     for(int j=1;j<=5; j++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

        // for(int i=1; i<=5; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        // int n = 5;
        // for(int i= 1; i<=n; i++){
        //     for(int j= 1; j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // OR
        // for(int i=1; i<=5; i++){
        //     for(int j=4; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        
        // char ch = 'A';
        // for(int i = 1; i<=5; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // int num = 1;
        // for(int i= 1; i<=5; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }

        //STAR WITH SPACE

        // for(int i = 1; i<=4; i++){
        //     for(int j =3; j>=i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //REVERSE WITH SPACE

        // for(int i = 1; i<=4;i++){
        //     for(int j=2;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=4; k>=i; k--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

         //PYRAMID
        for(int i = 1; i<=4; i++){
            for(int j =3; j>=i;j--){
                System.out.print(" ");
            }
            for(int k= 1;k<=(2*i-1);k++){
                System.out.print("#");
            }
            System.out.println();
        }

        
    
    }
}

