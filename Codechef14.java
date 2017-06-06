import java.util.*;

class TreeNode{
    int data;
    TreeNode left, right;
    public TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class Codechef14{
    public static ArrayList<LinkedList<TreeNode>> createLinkedListDepthWiseFromTree(TreeNode root){
        
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        if(root!=null){
            current.add(root);    
        }
        
        while(current.size()>0){
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<TreeNode>();
            for(TreeNode parent: parents){
                if(parent.left!=null){
                    current.add(parent.left);
                    System.out.println(parent.left.data);
                }
                if(parent.right!=null){
                    current.add(parent.right);
                    System.out.println(parent.right.data);
                }
            }
        }
        return result;
    }
     public static void main(String []args){
        System.out.println("Hello World");
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right=new TreeNode(12);
        ArrayList<LinkedList<TreeNode>> results = createLinkedListDepthWiseFromTree(root);
        for(int i =0;i<results.size();i++){
            LinkedList<TreeNode> trav = results.get(i);
            System.out.println("Trav "+trav.size());
            for(int j=0;j<trav.size();j++){
                TreeNode temp = trav.get(j);
                System.out.println(temp.data);
            }
            System.out.println();
        }
        
     }
}
