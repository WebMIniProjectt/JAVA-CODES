package Josh;
public class uglyNo{
  public static boolean isUgly(int num){
     int arr[]={2,3,5};
     for(int i:arr){     
         while(num%i==0) num=num/i;
    }
    return num==1;
  } 
    public static void main(String[] args) {
        System.out.println(isUgly(64));
    }
}
