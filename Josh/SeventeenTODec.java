package Josh;

import java.util.HashMap;
import java.util.Scanner;

public class SeventeenTODec {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.next();
      // System.out.println(str);

      HashMap<Character,Integer> h =new HashMap<>();
      h.put('A',10);
      h.put('B',11);
      h.put('C',12);
      h.put('D',13);
      h.put('E',14);
      h.put('F',15);
      h.put('G',16);
      

      String s="ABCDEFG";
      int ans=0;
      int k=0;
   
      for(int i=str.length()-1;i>=0;i--){
         char x=str.charAt(i);
         if(s.contains(Character.toString(x))){
            ans+=h.get(x)*(int)Math.pow(17,k);
            k++;

         }else{
          int a=Integer.valueOf(Character.toString(x));
          ans=ans+a*(int)Math.pow(17,k);
          k++;
         }
      }
      System.out.println(ans );
    
  }
}
