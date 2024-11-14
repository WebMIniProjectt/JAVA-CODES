package ImportantPrograms;

public class UniqueTriplet {
  public static void main(String[] args) {
    int m=60;
    int arr[]={5,3,20,10,1,4,2};
    int count=0;
    for(int i=0;i<arr.length;i++)
     for(int j=i+1;j<arr.length;j++)
        for(int k=j+1;k<arr.length;k++){
          if(arr[i]*arr[j]*arr[k] == m) count++;
        }
    System.out.println(count);

  }
}
