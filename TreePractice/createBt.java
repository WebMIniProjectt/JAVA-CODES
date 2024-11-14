package TreePractice;
import TreePractice.TreeNode;
import TreePractice.TreeTrversalMethods;

public class createBt {
  static int i=-1;
  public static TreeNode buildBT( int arr[] ){
    i++;
    if( arr[i]==-1) return null;
    TreeNode root=new TreeNode(arr[i]);
    root.lChild= buildBT(arr);
    root.rChild= buildBT(arr);
    return root;
  }
  public static void main(String[] args) {
    int arr[]={20,30,-1,4,-1,-1,2,1,3,-1,-1,4,-1,-1,2,-1,3,-1,-1};
    TreeNode root=null;
    TreeNode treeRoot =buildBT(arr);
    TreeTrversalMethods t=new TreeTrversalMethods();
    t.inOrder(treeRoot);
    System.out.println();
    t.preOrder(treeRoot);
    System.out.println();
    System.out.println("Height Of Triangle"+t.height(treeRoot));
    System.out.println("level Order Traversal  Of Tree : ");
    t.levelOrderTraversal(treeRoot);
    System.out.println("\nlevel Order Traversal  Of Tree line By Line : ");
    t.LineByLine(treeRoot);
    System.out.println("Size of BT:-"+t.sizeOfBinaryTree(treeRoot));

  }
}
