package TreePractice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import ImportantPrograms.sort;

class TreeNode{
   int val;
   TreeNode lChild;
   TreeNode rChild;
   TreeNode(int x){
    val=x;
  }
}

class TreeTrversalMethods{
     public void inOrder(TreeNode root){
      if(root==null) return;
      inOrder(root.lChild);
      System.out.print(root.val+" ");
      inOrder(root.rChild);
     }
     
     public void preOrder(TreeNode root){
      if(root==null) return;
      System.out.print(root.val+" ");
      preOrder(root.lChild);
      preOrder(root.rChild);
     }

     public void postOrder(TreeNode root){
      if(root==null) return;
      postOrder(root.lChild);
      postOrder(root.rChild);
      System.out.print(root.val+" ");
     
     }

     public int height(TreeNode root){
      if(root==null) return 0;
      int lh=height(root.lChild);
      int rh=height(root.rChild);
      return Math.max(lh,rh)+1;
     }

     public void printKDistinctNode(TreeNode root,int i,int k){
       if(root==null) return;
       printKDistinctNode(root.lChild, i+1, k);
       if(i==k) System.out.print(root.val+" ");
       printKDistinctNode(root.rChild, i+1, k);
     }

     public void levelOrderTraversal(TreeNode root){
       Queue<TreeNode> que=new LinkedList<>();
       que.offer(root);
       while(!que.isEmpty()){
         TreeNode temp=que.poll();
         System.out.print(temp.val+" ");
         if(temp.lChild!=null) que.offer(temp.lChild);
         if(temp.rChild!=null) que.offer(temp.rChild);
       }

     }
     public void LineByLine(TreeNode root){
        ArrayDeque<TreeNode> deq =new ArrayDeque<>();
        deq.offer(root);
        while(!deq.isEmpty()){
          int n=deq.size();
          for(int i=0;i<n;i++){
            TreeNode temp=deq.poll();
            System.out.print(temp.val+" ");
            if(temp.lChild!=null) deq.offer(temp.lChild);
            if(temp.rChild!=null) deq.offer(temp.rChild);
          }
          System.out.println();
        }
     }

     public int sizeOfBinaryTree(TreeNode root){
         if(root==null) return 0;
         return 1+sizeOfBinaryTree(root.lChild)+sizeOfBinaryTree(root.rChild);
     }

     public int maxEleOfTree(TreeNode root){
      if(root==null) return Integer.MIN_VALUE;
      return Math.max(Math.max(maxEleOfTree(root.lChild),maxEleOfTree(root.rChild)),root.val);
     }

}
 
public class constructTree {
     public static void main(String[] args) {
         TreeNode root=new TreeNode(45);
         root.lChild=new TreeNode(56);
         root.rChild=new TreeNode(65);
         root.lChild.lChild=new TreeNode(78);
         root.lChild.lChild.rChild =new TreeNode(12);
         root.rChild.lChild=new TreeNode(21);
         root.rChild.lChild.lChild=new TreeNode(7);
         root.rChild.rChild=new TreeNode(1);
         root.rChild.rChild.rChild=new TreeNode(55);

         TreeTrversalMethods t = new TreeTrversalMethods();
        //  System.out.println("InOrder : ");
        //  t.inOrder(root);
        //  System.out.println("\nPreOrder : ");
        //  t.preOrder(root);
        //  System.out.println("\nPostOrder :");
        //  t.postOrder(root);
        //  System.out.println("\nHeight Of Tree : "+t.height(root));
        //  System.out.println("3 level node Of Tree : ");
        //  t.printKDistinctNode(root, 0, 2);
         System.out.println(" level Order Traversal  Of Tree : ");
         t.levelOrderTraversal(root);
         System.out.println("\nlevel Order Traversal  Of Tree line By Line : ");
         t.LineByLine(root);
         System.out.println("Size of BT:-"+t.sizeOfBinaryTree(root));
         System.out.println("Max Element of Tree :-"+ t.maxEleOfTree(root));
         System.out.println(Integer.toBinaryString(45));
         System.out.println(Character.isDigit('1'));
        
     }
  
}
/*
 *        45
 *      /    \
 *     56     65
 *    /  \    / \
 *   78      21  1
 *    \     /     \
 *    12   7       55
 *  
 * InOrder => 78,12,56,45,7,21,65,1,55.
 * PreOrder=> 45,56,78,12,65,21,7,1,55.
 * PostOrder=>12,78,56,7,21,55,1,65,45. 
 */