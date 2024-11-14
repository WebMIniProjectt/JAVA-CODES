import java.util.*;
class objectInfo{
  int profit;
  int weight;
  float profitByweight;
  objectInfo(int x,int y,float z){
    profit=x;
    weight=y;
    profitByweight=z;
  }
}
public class KNapSackGreedy {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int m =15;
    int n= 7;
    int profit[]= {10,5,15,7,6,18,3};
    int weight[]={2,3,5,7,1,4,1} ;
    float selled[]=new float[n];

    ArrayList<objectInfo> arr =new ArrayList<>();
    float profitByweight[]=new float[n];
    for(int i=0;i<n;i++){
      profitByweight[i]=(float)profit[i]/(float)weight[i];
      arr.add(new objectInfo(profit[i],weight[i], profitByweight[i]));

    }
    
   
    Collections.sort(arr, (a,b)-> (int)b.profitByweight-(int)a.profitByweight);

  
    float maxProfit=1;
    int j=0;
    while(m!=0 && j< arr.size()){
       if(m > arr.get(j).weight){
            m-=arr.get(j).weight;
            maxProfit+=arr.get(j).profit;
            selled[j]=1;
       }
       else{

          int x=arr.get(j).weight;
          while(x>m){
            x--;

          }
          selled[j]=(float)x/(float)arr.get(j).weight;
          m-=x;
          maxProfit+=(arr.get(j).profitByweight*x);

       }
       j++;
    }
    
    for(float i:selled)  System.out.print(i==1 ? "1 " : (i==0) ? "0 ":i+" ");
    System.out.println();
    System.out.println(maxProfit);
     
  }
  

}
