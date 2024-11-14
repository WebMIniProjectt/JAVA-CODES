package ImportantPrograms;
import java.util.Scanner;

public class NumberIsPalinderome {
  //Method1
  public static boolean method1(int x){
    int ans=0;
    int n=x;
    while(n>0){
      int rem=n%10;
      ans=rem+ans*10;
      n/=10;

    }
    return x==ans ? true : false;
  }
  //method2
  public static boolean method2(int n){
    String str=Integer.toString(n);
    StringBuffer buff = new StringBuffer(str);
    buff.reverse();
    String s=new String(buff);
    if(s.equals(str)) return true;
    else return false;
  }

  //method3
  public static boolean method3(int n){
    String str=String.valueOf(n);
    int start=0;
    int end=str.length()-1;
    while(start < end){
      if(str.charAt(start)!=str.charAt(end)) return false;
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
     int x=900;
     int min=sc.nextInt();
     int max=sc.nextInt();
     System.out.println(method1(x));
     System.out.println(method2(x));
     System.out.println(method3(x));
     for(int i=min ;i<max ;i++){
      if(method1(i)){
        System.out.println(i);
      }
     }

    
  }
}
