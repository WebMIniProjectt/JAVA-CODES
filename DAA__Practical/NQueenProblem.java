import java.util.ArrayList;

public class NQueenProblem {
  public static void display(int arr[][]){
    for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr[0].length;j++){
         System.out.print(arr[i][j]+"   ");
       }
       System.out.println();
       System.out.println();
    }
  }
  public static void copy(int board[][] ,int ans[][]){
     for(int i=0;i<board.length;i++){
      for(int j=0;j<board[0].length;j++){
          ans[i][j]=board[i][j];
      }
     }
  }
  public static boolean isSafe(int row,int col,int board[][]){
     int x=row;
     int y=col;
     while(y>=0){
        if(board[row][y]==1) 
        return false;
        y--;
     }
      x=row;
      y=col;
      while(y>=0 && x>=0){
        if(board[x][y]==1) 
        return false;
        y--;
        x--;
     }
     x=row;
     y=col;
     while(y>=0 && x<board.length){
      if(board[x][y]==1) 
      return false;
      y--;
      x++;
   }

   return true;

  }
  public static void solve(int col ,int board[][] ,  int ans[][] ,int n ){
     if(col==n){
        copy(board,ans);
        return;
     }
     for(int row=0;row<n;row++){
       if(isSafe(row,col,board)){
          board[row][col]=1;
          solve(col+1, board, ans, n);
          board[row][col]=0;
       }
     }
  }
  public static int[][] sloveNQueen( int board[][] ,int n){
     int ans[][]=new int[n][n];
    solve(0, board , ans , n);
     return ans;

  } 
  public static void main(String[] args) {
    int n=5;
    int board[][] =new int[n][n];
    display(board);
 
    System.out.println();
   display(sloveNQueen(board,n));
  }
}
