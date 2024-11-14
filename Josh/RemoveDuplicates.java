package Josh;
import java.util.*;
public class RemoveDuplicates {
   public static String M1(String str){
       LinkedHashSet<Character> set = new LinkedHashSet<>();
       for(int i=0;i<str.length();i++){
           set.add(str.charAt(i));

       }
       String s="";
       for(Character ch : set) s+=Character.toString(ch);
       return s;
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    System.out.println(M1(str));
   }
}
