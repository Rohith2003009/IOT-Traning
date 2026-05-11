class treeNode {

    int data;
    treeNode left, right;

    treeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {

    treeNode root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    treeNode insertRec(treeNode root, int data) {
        if (root == null) {
            root = new treeNode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(treeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
    }
}

public class p4 {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(18);

        int key = 30;
        if (tree.search(key)) {
            System.out.println("Element " + key + " found in the BST.");
        } else {
            System.out.println("Element " + key + " not found in the BST.");
        }
    }
}