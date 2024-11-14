package ImportantPrograms;

public class Matrix90 {
  public  static void  display(int mat[][]){
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(mat[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int mat1[][]={{1,2,3},{2,3,4},{4,5,6}};
    int mat2[][]=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0,n=2;j<3;j++,n--){
          mat2[j][i]=mat1[i][n];
      }
    }
    display(mat1);
    display(mat2);
  }
}
