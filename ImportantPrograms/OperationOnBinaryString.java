package ImportantPrograms;

public class OperationOnBinaryString {
  public static int A(int a,int b){
      if(a==1 && b==1) return 1;
      else return 0;
  }
  public static int B(int a,int b){
    if(a==0 && b==0) return 0;
    else return 1;
  }
  public static int C(int a,int b){
    if(a==1 && b==0 || a==0 && b==1) return 1;
    else return 0;
  }
  public static void main(String[] args) {
       String  str="1C0C1C1A0B1";
       int ans=Integer.parseInt(Character.toString(str.charAt(0)));
       for(int i=1;i<str.length();i=i+2){
          char op=str.charAt(i);
          int x=Integer.parseInt(Character.toString(str.charAt(i+1)));
          if(op=='A') ans=A(ans,x);
          else if(op=='B') ans=B(ans,x);
          else ans=C(ans,x);
       }
       System.out.println(ans);

  }
} 
