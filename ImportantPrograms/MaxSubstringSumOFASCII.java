package ImportantPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubstringSumOFASCII {
  public static int sumOfMaxSubstingAscci(String str1,String str2){
    int sum=0;
    ArrayList<String> arr =new ArrayList<>();
    for(int i=0;i<str1.length();i++){
       for(int j=i+1;j<str1.length();j++){
          if(str2.contains(str1.substring(i,j+1))){
              arr.add(str1.substring(i, j+1));
          }
       }
    }
    int maxlen=0;
    String maxStr="";
    for(String str:arr){
       if(str.length()>maxlen) {
          maxlen=str.length();
          maxStr=str;
       }
    }
    
    for(int i=0;i<maxStr.length();i++){
       sum+=Integer.valueOf(maxStr.charAt(i));
    }
    System.out.println(arr);;

    return sum;
  }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str1=sc.next();
       String str2=sc.next();
       System.out.println(sumOfMaxSubstingAscci(str1,str2));
   }
}
//adventure future