package Josh;


public class CountVowelsOfAllSubString {
  public static  int CVowels(String str){
      String vowelStr="aeiou";
      int count=0;
      int n=str.length();
      for(int i=0;i<n;i++){
        if(vowelStr.contains(Character.toString(str.charAt(i))))
              count+=(i+1)*(n-i);
      }
      return count;
  }
   public static void main(String[] args) {
         String str="abcd";
         System.out.println(CVowels(str));
   }
}
