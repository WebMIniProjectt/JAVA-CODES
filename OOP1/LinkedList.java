package  OOP1;
class ListNode{
  int val;
  ListNode next;
  ListNode(int x){
    val=x;
    next=null;
  }
  public static void copy(ListNode obj1,ListNode obj2){
       int temp=obj1.val;
       obj1.val=obj2.val;
       obj2.val=temp;

  }

}
public class LinkedList{
  public static ListNode craeteList(int arr[]){
    ListNode head=null;
    ListNode prev=null;
    for(int i=0;i<arr.length;i++){
       ListNode x =new ListNode(arr[i]);
       if(head==null){
         head=x;
         prev=head;  
       }else{
          prev.next=x;
          prev=x;

       }

       
    }
   return  head;
  }
  // public  static ListNode  isertAtFirst(int x,ListNode head){
  //       ListNode  newNode = new ListNode(x);
  //       newNode.next=head;
  //       return newNode;
  // }

  // public static void  insertAtStart(int x,ListNode head){
  //       ListNode newNode=new ListNode(x);
         
  //       ListNode.copy(newNode, head);
  //       ListNode temp2=head.next;
  //       newNode.next=temp2;
  //       head.next=newNode;

  // }
  public static ListNode removeFirst(ListNode head){
       return head.next;
  }

  

   public static void main(String[] args) {
       
      int arr[]={1,2,3,4,5,6};
      ListNode head=craeteList(arr);
     
      while(head!=null){
        System.out.print(head.val+"->");
        head=head.next;
      }


   }
}
