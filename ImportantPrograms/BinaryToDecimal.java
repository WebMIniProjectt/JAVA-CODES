package ImportantPrograms;
public class BinaryToDecimal {
  public static void main(String[] args) {
     int binary=1010111;
     String str=Integer.toString(binary);
     int decNo=0;
     int j=0;
     while(binary>0){
       int rem=binary%10;
       if(rem==1){
         decNo+=Math.pow(2,j);
       }
       j++;
       binary/=10;

     }
     System.out.println(decNo);
     System.out.println(Integer.valueOf(str, 10));
  }
}
