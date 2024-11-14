package ImportantPrograms;

public class BinarySearchInArr {
   
   public static void main(String[] args) {
    int arr[]={56,78,98,100,105,189,200};
    int left=0;
    int x=500;
    int right=arr.length-1;
    int flag=0;
    while(left<=right){
      int mid=(left+right)/2;
      // System.out.println(mid);
      if(arr[mid]==x) {
         flag=1;
         break;
      }
      else if(arr[mid]>x) right=mid-1;
      else  left=mid+1;
    }
    if(flag==1) System.out.println("Element is Present");
    else System.out.println("Element is Not Present");
    String str="192.168.0.1";
    
    String str2=str.replaceAll(".", "-");
    System.out.println(str2);
    for(String s :str2.split("-"))System.out.print(s+" ");
    System.out.println((int)'.');
   }
}
