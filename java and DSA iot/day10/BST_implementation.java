class treeNode{
    int Data;
    treeNode left;
    treeNode right;
    treeNode(int data){
        this.Data = data;
        this.left = this.right = null;
    }
}

class BST{
    treeNode root;
    treeNode insertvalue(treeNode root, int key){
        if(root == null){
            return new treeNode(key);
        }
        else if (root.Data > key){
            root.left = insertvalue(root.left, key);
        }
        else{
            root.right = insertvalue(root.right, key);
        }
        return root;
    }
    void display(treeNode root){
        if(root != null) {
            System.out.print(root.Data + " ");
            display(root.left);
            display(root.right);
        }
    }
}
public class BST_implementation {
    public static void main(){
        int[] arr = {4,2,3,7,8,6,9,12};
        BST tree = new BST();
        for(int n: arr){
            tree.root = tree.insertvalue(tree.root, n);
        }
        tree.display(tree.root);
    }
}
