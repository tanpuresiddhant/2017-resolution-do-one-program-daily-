import java.util.*;

class TreeNode{
    int data;
    TreeNode left,right;
    public TreeNode(int data){
        this.data=data;
        left=null;
        right = null;
    }
}    

public class HelloWorld{
    
    public static TreeNode createBinaryTreeFromArray(int[] array, int start, int end){
        if(end<start){
            return null;
        }
        int mid = (start+end)/2;
        TreeNode n = new TreeNode(array[mid]);
        n.left = createBinaryTreeFromArray(array, start, mid-1);
        n.right= createBinaryTreeFromArray(array, mid+1,end);
        return n;
    }
    
    
    
    public static void createDepthWiseTree(TreeNode root,ArrayList<LinkedList<TreeNode>> lists,  int level){
        if(root==null){
            return;
        }
        LinkedList<TreeNode> list;
        if(lists.size()==level){
            list = new LinkedList<TreeNode>();
            lists.add(list);
        }else{
            list = lists.get(level);
        }
        list.add(root);
        createDepthWiseTree(root.left,lists, level+1);
        createDepthWiseTree(root.right,lists, level+1);
    }
    
    public static void main(String []args){
        System.out.println("Hello World");
        int[] array = new int[]{3,4,5,6,7,8}; 
        TreeNode head = createBinaryTreeFromArray(array, 0, 5);
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createDepthWiseTree(head, lists,0);
        for(int i=0;i<lists.size();i++){
            LinkedList<TreeNode> list = lists.get(i);
            int j = list.size();
            int k=0;
            while(k!=j){
                TreeNode temp = list.get(k);
                System.out.print(temp.data+" ");
                //list = list.next;
                k++;
            }
            System.out.println();
        }
     }
}
