package ImportantPrograms;
class Node{
  int val;
  Node next;
  Node(int x){
    val=x;
    next=null;
  }
}




public class midLinkedList {
  public static Node createList(int arr[]){
       Node root=null;
       Node prev=null;
       for(int i=0;i<arr.length;i++){
          if(root==null){
             root=new Node(arr[i]);
             prev=root;
          }
          else{
            Node temp=new Node(arr[i]);
            prev.next=temp;
            prev=temp;
          }
       }
       return root;
  }
  public static void displayList(Node root1){
    Node root=root1;
    while ((root!=null)) {
      System.out.print(root.val+"->");
      root=root.next;
    }
  }

  public static Node midLinkedList(Node root){
    Node slow=root;
    Node fast=root;
    while(fast!=null && fast.next!=null){
      fast=fast.next.next;
      slow=slow.next;
    }
    System.out.println();
    return slow;

  }
    public static void main(String[] args) {
      int arr[]={1,2,3,4};
          Node root=createList(arr);
          displayList(root);
          System.err.println(midLinkedList(root).val);
    }
}
