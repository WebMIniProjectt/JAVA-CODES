package ImportantPrograms;
public class removeWoels {
  public static void main(String[] args) {
        String str= "abcdefghijklmnopqrstuvwxyz";
        String s="AEIOUaeiou";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(!s.contains(Character.toString(str.charAt(i)))) ans+=Character.toString(str.charAt(i));
        }
        System.out.println(ans);
        
  }
}
