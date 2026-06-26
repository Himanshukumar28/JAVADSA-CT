public class Class02 {
    public static boolean isPrime(int n){
    int count = 0;
    for(int i = 1; i<=n; i++){
      if(n % i == 0) count++; 
    }
    if(count == 2) return true;
    return false;
  }
  
    public static void main(String[] args) {
      int[][] arr = {{6,8,8},{3,9,8},{7,6,4},{3,3,6}};
      int row = arr.length;
      int col = arr[0].length;
      int sum = 0;
      //Prime integer ka
      for(int i = 0; i<row; i++){
        for(int j = 0; j<col; j++){
          if(isPrime(arr[i][j]) == true){
            sum = sum + arr[i][j];
          }
        }
      }
      System.out.println(sum);
    }
}
