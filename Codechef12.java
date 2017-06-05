class TreeNode{
    int data;
    TreeNode left, right;
    public TreeNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
    
}
public class Codechef12{

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
    
    public static void inorder(TreeNode head){
        if(head!=null){
            inorder(head.left);
            System.out.println(head.data);
            inorder(head.right);
        }
    }
     public static void main(String []args){
        System.out.println("Hello World");
        int[] array = new int[]{3,4,5,6,7,8}; 
        TreeNode head = createBinaryTreeFromArray(array, 0, 5);
        inorder(head);
     }
}
