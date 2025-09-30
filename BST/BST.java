package BST;

public class BST {
    public static void main(String[] args) {
        int[] values = {5, 4, 6, 8, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        //inorder(root);

        System.out.println(search(root, 9));
    }

    public static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data > key){
            return search(root.left, key);
        }else if(root.data < key){
            return search(root.right, key);
        }else if(root.data == key){
            return true;
        }
        return false;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subtreee
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
