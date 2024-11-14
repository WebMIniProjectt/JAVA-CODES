package ImportantPrograms;

public class IsPrime {
  //method1
  public static boolean method1(int x){
    if(x==1) return false;
    int iter=0;
    for(int i=2;i<x;i++){
      if(x%i==0){
        
        return false;
      }
      iter++;
    }
    System.out.println(iter);
    return true;
  }
  //method2
  public static boolean method2(int x){
    if(x==1) return false;
    int iter=0;
    for(int i=2;i*i<x;i++){
      if(x%i==0){
        System.out.println(i);
        return false;
        
      }
      iter++;
    }
    System.out.println(iter);
    return true;
  }
  public static boolean method3(int x){
    if(x==1) return false;
    if(x==2 || x==3) return true;
    if(x%2==0 || x%3==0) return false;
    int iter=0;
    for(int i=5;i*i<x;i=i+6){
      if(x%i==0){
        System.out.println(i);
        return false;
        
      }
      iter++;
    }
    System.out.println(iter);
    return true;
  }

  //method3

    public static void main(String[] args) {
      int x=43;
      int y=46;
      int z=117;
      int p=211;
      System.out.println(method1(x));
      // System.out.println(method1(y));
      // System.out.println(method1(z));
      System.out.println(method1(p));
      System.out.println(method2(x));
      System.out.println(method2(p));
      System.out.println(method3(x));
      System.out.println(method3(p));
      System.out.println(method3(7));
     
       
     
    }
}
