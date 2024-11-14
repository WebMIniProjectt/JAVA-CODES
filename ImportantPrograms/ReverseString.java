package ImportantPrograms;

public class ReverseString {
  public static void reverse(char arr[],int start ,int end){
       while(start < end-1){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
       }
  }
  public static void main(String[] args) {
      String str="I plays circket";
      char arr[]=str.toCharArray();
      int start=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==' '){
            reverse( arr , start , i-1);
            start=i+1;
        }
      }
      reverse( arr , start , arr.length-1);
      reverse(arr,0,arr.length-1);
      System.out.println(new String(arr));

  }
}
