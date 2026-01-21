public class Que_Practic02 {
    public static void main(String[] args) {
        //LEETCODE
        int n = 6;
        int sint = 0;
        for(int i=n; i>=n; i++){
            if(i%n==0 && i%2==0){
                sint = sint + i;
                break;
            }
        }
        System.out.println(sint);

        
    }
}
