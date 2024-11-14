package OOP1;
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x){
    val=x;
    left=null;
    right=null;
  }
}
class MakeBinaryTree{
  public TreeNode insert(TreeNode root , int x ){
    if(root==null) return new TreeNode(x);
    if(root.left==null) root.left = new TreeNode(x);
    // else   root.left = insert(root.left,x);
    if(root.right==null) root.right= new TreeNode(x);
    // else root.right=insert(root.right,x);
    if(root.left!=null) root.left=insert(root.left,x);
    else root.right=insert(root.right,x);
    
     
    
    return root;

  }
  public TreeNode makeTree(int arr[]){
     TreeNode root=null;
     for(int i=0;i<arr.length;i++){
      root = insert( root , arr[i]);
     }
     return root;
  }
  public void inorder(TreeNode root){
    if(root==null) return;
    
    System.out.print(root.val+" ");
    inorder(root.left);
    inorder(root.right);
  }
}
public class BinaryTree {
  public static void main(String[] args) {
    int arr[]={1,2,3,-1,8,9-1};
    MakeBinaryTree obj =new MakeBinaryTree();
    TreeNode root=obj.makeTree(arr);
    obj.inorder(root);

  }
}


