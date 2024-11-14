package Josh;

public class CountSpaceAndComma {
  public static void main(String[] args) {
     String str="Aditya , Radhika are staudents study in 10th std";
     int s=0,c=0;
     for(int i=0;i<str.length();i++){
       if(str.charAt(i)==',') c++;
       if(str.charAt(i)==' ') s++;
     }
     System.out.println("comma  "+c+" "+"space  "+s);

  }
}
