public class Class01 {
    public static void main(String[] args) {
      int[][] arr = {{6,8,8},{3,9,8},{7,6,4},{3,3,6}};
      int row = arr.length;
      int col = arr[0].length;
      //PRINTING 2D ARRAY
      //nested loop
      for(int i = 0; i<row; i++){
        for(int j = 0; j<col; j++){
          System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }

      //CHECK TARGET PRESENT OR NOT IN ARRAY 
      int target = 8;
      boolean check = false;
      for(int i = 0; i<row; i++){
        for(int j = 0; j<col; j++){
            if(arr[i][j] == target){
              check = true;
              break;
            }
        }
      }
      System.out.println(check);

      //SUM ALL DIGIT PRESENT IN ARRAY
      int sum = 0;
      for(int i = 0; i<row; i++){
        for(int j = 0; j<col; j++){
          sum = sum + arr[i][j];
        }
      }
      System.out.println(sum);

    }
}
