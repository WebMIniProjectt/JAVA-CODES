package ImportantPrograms;

public class MatrixMul {
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
        int mat2[][] = {{2,3,4},{2,3,4},{1,2,3}};
        int mat3[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int k=0;k<3;k++){
                int sum=0;
                for(int j=0;j<3;j++){
                    sum+=mat1[i][j]*mat2[j][k];
                    
                }
                mat3[i][k]=sum;
            }

        }
        display(mat1);
        display(mat2);
        display(mat3);
      }
  
}
