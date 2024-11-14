package ImportantPrograms;
import java.util.HashMap;

public class DecodeTheWord { 
  public static String decodeWord(String str){
     HashMap<Integer,Character> h =new HashMap<>();
     int i=1;
     for(int j=65;j<91;j++){
        h.put(i,(char)j);
        i++;
     }
     h.put(0,' ');
     System.out.println(h);
     String ans="";
     i=0;
     for(int j=0;j<str.length();j++){
          if(str.charAt(j)=='0'){
             ans+=Character.toString(h.get(i));
             i=0;
          }
          else{
             i++;
          }
     }
    
     int c=0;
     i=str.length()-1;
     while(str.charAt(i)!='0'){
      c++;
      i--;
     }
     ans+=Character.toString(h.get(c));
     return ans;
  }
  public static void main(String[] args) {
        System.out.println(decodeWord("10110111011110"));
  }
}
