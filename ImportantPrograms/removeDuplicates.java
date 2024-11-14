package ImportantPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicates {
   public static void main(String[] args) {
      int arr[]={1,4,6,7,1,5,2,4,9,6};
      HashSet<Integer> arr1 =new HashSet<>();
      for(int i:arr) arr1.add(i);
      ArrayList<Integer> ans=new ArrayList(arr1);
      System.out.println(ans);
   }
}
