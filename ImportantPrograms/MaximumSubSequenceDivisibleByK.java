package ImportantPrograms;

import java.util.ArrayList;

public class MaximumSubSequenceDivisibleByK {
  private static int max=0;
  private static ArrayList<Integer> lst =new ArrayList<>();
  public static int  maxSequenceLength(int arr[],int k){
     int max=0;
   
     for(int i=0;i<arr.length;i++){
       int count=1;
       for(int j=i+1;j<arr.length;j++){
           if(Math.abs(arr[j-1]-arr[j])%k==0){
             count++;

           }
           else{
              max=Math.max(max,count);
              break;
           }
       }
     }
     return max;
  }

     public static void solve(int indx,int arr[], ArrayList<Integer> aux ,int k){
       if(indx==arr.length){
        if(max<aux.size()){ 
          lst.clear();
          lst.addAll(aux);
          max=aux.size();}
        return ;
       }
       if(aux.size()==0 || Math.abs(aux.get(aux.size()-1)-arr[indx])%k==0) {
          aux.add(arr[indx]);
          solve(indx+1,arr,aux,k);
          aux.remove(Integer.valueOf(arr[indx]));
       }
       
      solve(indx+1, arr, aux, k);
       
      }
     public static void main(String[] args) {
      int arr[]={1,4,5,3,3,6,3,6,18,5,4,3,2,2,1};
       int arr2[]={1,1,2};
       int k=3;
       //op:-6;
       ArrayList<Integer> aux =new ArrayList<>();
       System.out.println(maxSequenceLength(arr, k));
       System.out.println(maxSequenceLength(arr2, k));
       solve(0 , arr2, aux, k);
       System.out.println(max);
       max=0;
       solve(0 , arr, aux, k);
       System.out.println(max);
       System.out.println(lst);
         

    }


}
