package ImportantPrograms;

public class  EquilibiriumPoint {
    public static  int equiPoint(int arr[]){
       int leftSum=0;
       int rightSum=0;
       
       for(int i=0;i<arr.length;i++) rightSum+=arr[i];
      //  System.out.println(leftSum+" "+rightSum);
       for(int i=0;i<arr.length;i++){
         rightSum-=arr[i];
          if(leftSum==rightSum) return i+1;
          leftSum+=arr[i];
          // System.out.println(i+" "+leftSum+" "+rightSum);
       }
       return -1;
    }
     public static void main(String[] args) {
         int arr[]={-7,2,4,9,-8,1,6};
         int arr2[]={-3,-1,-1,-1};

         //i=0 
         
         String str= equiPoint(arr)==-1 ? "NOT FOUND" : String.valueOf(equiPoint(arr));
         String str2= equiPoint(arr2)==-1 ? "NOT FOUND" : String.valueOf(equiPoint(arr2));
         System.out.println(str);
         System.out.println(str2);
     }

}
