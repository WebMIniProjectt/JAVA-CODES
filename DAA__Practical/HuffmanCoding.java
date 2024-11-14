import java.util.*;
class Node{
  int val;
  String str="";
  Node left;
  Node right;
  Node(int x){
     val=x;
     left=null;
     right=null;
  }

  void preOrder(Node root){
    if(root==null) return;
    System.out.print(root.val+"->"+root.str+"....");
    preOrder(root.left);
    preOrder(root.right);
  }

  void add_value(Node root){
    if (root ==null) {
      return;
    }
    if(root.left!=null) root.left.str=root.str+root.left.str;
    if(root.right!=null) root.right.str=root.str+root.right.str;
    add_value(root.left);
    add_value(root.right);
  }
}

public class HuffmanCoding {
  public static void main(String[] args) {
      String str="BCAADDDCCACACAC";
      HashMap<Character,Integer> map =new HashMap<>();
      for(char c : str.toCharArray()) map.put(c,map.getOrDefault(c, 0)+1);
      System.out.println(map);

      ArrayList<Node> arr =new ArrayList<>();
      for(int i:map.values()) arr.add(new Node(i));
      Node x=new Node(1);
      // for(Node n:arr) System.out.print(n.val+" ");
      // Collections.sort(arr,(a,b)-> a.val-b.val);
      // System.out.println();
      // for(Node n:arr) System.out.print(n.val+" ");
      
      while(arr.size()!=1){
        Collections.sort(arr,(a,b)-> a.val-b.val);
        Node l=arr.remove(0);
        l.str+="0";
        x.add_value(l);
        Node r=arr.remove(0);
        r.str+="1";
        x.add_value(r);
        Node c=new Node(l.val+r.val);
        c.left=l;
        c.right=r;
        arr.add(c);
      }

     
      x.preOrder(arr.get(0));
      
     
}
}