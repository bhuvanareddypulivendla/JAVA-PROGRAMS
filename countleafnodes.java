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
    public static int countleafnodes(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }

    return countleafnodes(node.left)+countleafnodes(node.right);
}
    public  int countleafnodes(){
        return countleafnodes(root);
    }
}
public class countleafnodes{
    public static void main(String[] args){
        BinaryTree br=new BinaryTree();
        br.root=new TreeNode(1);
        br.root.left =new TreeNode(2);
        br.root.right=new TreeNode(3);
        br.root.left.left=new TreeNode(4);
        br.root.left.right=new TreeNode(5);
        br.root.right.left=new TreeNode(6);
        br.root.right.right=new TreeNode(7);
        int leafcount=br.countleafnodes();
        System.out.println("The total leafcount is:" +leafcount);
    }
}