package ImportantPrograms;

import java.util.Scanner;

public class CountsOfInversionPair {
    public static int countInversionPair(int arr[]){
      int c=0;
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]) c++;
          }
      }
      return c;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       String strs[]=str.split(",");
       int nums[]=new int[strs.length];
       for(int i=0;i<strs.length;i++){
          nums[i]=Integer.valueOf(strs[i]);

       }

       System.out.println(countInversionPair(nums));

       

    }  
}
