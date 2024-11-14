package ImportantPrograms;
class TreeNode{
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x){
    val=x;
  }
}
public class Tree {
  public static void preOrder(TreeNode root){
    if(root==null) return;
    System.out.print(root.val+" ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static TreeNode insertNode(TreeNode root,int x){
    if(root==null) return new TreeNode(x);
    else if(root.left==null) root.left=insertNode(root.left, x) ;
    else if(root.right==null) root.right=insertNode(root.right, x);
    return root;
  }

  public static TreeNode createTree(int arr[]){
    TreeNode root=null;
    for(int i=0;i<arr.length;i++){
        root=insertNode(root,arr[i]);
    }
    return root;
  }
  public static void main(String[] args) {
       int arr[]={1,2,4};/*,-1,-1,5,-1,-1,6,-1,-1}; */
        TreeNode r=createTree(arr);
        preOrder(r);
  }
}
