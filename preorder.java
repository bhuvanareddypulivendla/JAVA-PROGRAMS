import java.util.*;


class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BinaryTree{
    TreeNode root;
    public void preordertraversal(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.data+" ");
        
        preordertraversal(node.left);

        preordertraversal(node.right);

       
    }
    public void preordertraversal(){
        preordertraversal(root);
    }
}
public class preorder{
    public static void main(String[] args){
        BinaryTree br=new BinaryTree();
        br.root=new TreeNode(1);
        br.root.left =new TreeNode(2);
        br.root.right=new TreeNode(3);
        br.root.left.left=new TreeNode(4);
        br.root.left.right=new TreeNode(5);
        br.root.right.left=new TreeNode(6);
        br.root.right.right=new TreeNode(7);
        
        System.out.println("preorder traversal:");
        br.preordertraversal();
    }
}