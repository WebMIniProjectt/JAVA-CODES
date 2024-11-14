package ImportantPrograms;

public class PrimeNumber {
  public static boolean isPrime(int num){
    if(num==2 && num==3) return true;
    else if(num%2==0 && num%3==0) return false;
    for(int i=5;i*i<num;i=i+6){
            if(num%i==0) return false;
    }
    return true;
  }
  public static void main(String[] args) {
      int num=43;
      System.out.println(isPrime(num));
    
  }
}
