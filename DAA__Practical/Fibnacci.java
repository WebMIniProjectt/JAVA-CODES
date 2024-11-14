public class Fibnacci {
  public static int fibNo(int n){
    System.out.println(n);
    if(n==0) return 0;
    if(n == 1) return 1;
    return fibNo(n-1)+fibNo(n-2);
  }
   public static void main(String[] args) {
     int n=8;
     int f1=0;
     int f2=1;
     int f3=0;
     System.out.print(f1+" "+f2);
     for(int i=2;i<=n;i++){
      f3=f1+f2;
      System.out.print(" "+f3+" ");
      f1=f2;
      f2=f3;
     }
     //Recursive Approach;
     System.out.println("\n"+fibNo( 90000));
   }
}
