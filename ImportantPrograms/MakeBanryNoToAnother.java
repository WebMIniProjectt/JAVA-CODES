package ImportantPrograms;
import java.util.*;
class Solution {
  public ArrayList<Integer> intToBinary(int n){
         ArrayList<Integer> arr = new ArrayList<Integer>();
         while(n>0){
              int rem =n%2;
             arr.add(rem);
             n=n/2;
         }
         return arr;
  }
  public int minChanges(int n, int k) {
      if(k>n) return -1;
      if(n==k) return 0;
      ArrayList<Integer> num1 =intToBinary(n);
      ArrayList<Integer> num2 =intToBinary(k);  
      System.out.println(num1);
      System.out.println(num2);
      int count=0;
      int count2=0;
      for(int i=num2.size()-1;i>=0;i--){
          if(num1.get(i)==1 && num2.get(i)==0 ){
                  num1.set(i,0);
                  count++;
          }
          else{
            count2++;
          }
      }
         
      return -1;
        
  }
}

public class MakeBanryNoToAnother {
  public static void main(String[] args) {
    int num=14;
    int k=13;
    
    Solution s=new Solution();
    
    System.out.println(s.minChanges(num, k));
  }
}
