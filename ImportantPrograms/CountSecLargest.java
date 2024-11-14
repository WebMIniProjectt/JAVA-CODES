package ImportantPrograms;

public class CountSecLargest {
   public static void main(String[] args) {
      int arr[]={ 1,2,2,3,3,4,6,6,6,8,8,8};
       int prev=arr[arr.length-1];
       
       int j=arr.length-1;
       while(prev==arr[j] && j>-1) j--;
       int slarge=arr[j];
       int c=0;
       while(slarge==arr[j] && j>-1)
       {
        j--;
        c++;
       }
       System.out.println( c);

      System.out.println("Aditya".replace('a','b'));
   }
}
