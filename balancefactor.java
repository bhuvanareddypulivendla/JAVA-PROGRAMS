Balance Factor:
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
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right));
    }
    public int balanceFactor(TreeNode node){
        if(node==null){
            return 0;
        }
        return height(node.left)-height(node.right);
    }
    public void checkbalanceFactors(TreeNode node){
        if(node==null){
            return;
        }
        int balance=balanceFactor(node);
        System.out.println("Node" +node.data+ "has" +balance+ "balance factor");
    
    checkbalanceFactors(node.left);
    checkbalanceFactors(node.right);

    }  
}
public class balancefactor{
    public static void main(String[] args){
        BinaryTree br=new BinaryTree();
        br.root=new TreeNode(1);
        br.root.left =new TreeNode(2);
        br.root.right=new TreeNode(3);
        br.root.left.left=new TreeNode(4);
        br.root.left.right=new TreeNode(5);
        br.root.right.left=new TreeNode(6);
        br.root.right.right=new TreeNode(7);
        
        System.out.println("Checking balance factors of all nodes:");
        br.checkbalanceFactors(br.root);
      
    }
}