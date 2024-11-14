package Josh;

public class MoveHashToFront {
  public static void main(String[] args) {
      String str="Aditya#Ashok#Gore##ab#c3";
      int Hashc=0;
      for(int i=0;i<str.length();i++) if(str.charAt(i)=='#') Hashc++;
      
      String s="";
      for(int i=0;i<Hashc;i++) s+="#";
      for(int i=0;i<str.length();i++) if(str.charAt(i)!='#') s+=Character.toString(str.charAt(i));
      System.out.println(s);
  }
}
