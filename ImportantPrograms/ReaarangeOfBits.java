package ImportantPrograms;

import java.nio.charset.CharacterCodingException;

public class ReaarangeOfBits {
  public static void main(String[] args) {
     int num=15;
     int ans=0;
     int j=0;
     while(num>0){
      int rem=num%2;
      if(rem==1){ 
        ans+=Math.pow(2,j);
         j++;
      }
      num/=2;
     }
     System.out.println(ans);
     System.out.println("***************************************");

     String str="1010";
     int ans2=0;
     int k=0;
     for(int i=0;i<str.length();i++){
         int x=Integer.valueOf(Character.toString(str.charAt(i)));
         if(x==1){
          ans2+=Math.pow(2,k);
          k++;
         }
     }
     System.out.println(ans2);

     
      
      
  }
}
