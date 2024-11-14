package ImportantPrograms;
public class OnBulb {
  public static int minimumReq(int arr[]){
    int c=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]==0){
           for(int j=i;j<arr.length;j++){
                if(arr[j]==1) arr[j]=0;
                else arr[j]=1;
           }
           c++;
       }
    }
    return c;
  }
  public static void main(String[] args) {
       int arr[]={0,1,0,1};
       int arr2[]={1,0,0,0};
       System.out.println(minimumReq(arr));
       System.out.println(minimumReq(arr2));

  }
}
