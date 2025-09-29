package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(nodes);
        //System.out.println(root.data);
        preOrder(root);
        inOrder(root);
        postOrder(root);
        levelOrder(root);
    }

    public static void preOrder(Node root){
        if(root == null) return;
        //System.out.print(root.data + "->");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        //System.out.print(root.data + "->");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        //System.out.print(root.data + "->");
    }

    public static void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node curr = queue.poll();
            System.out.print(curr.data + "->");

            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    int idx = -1;
    public Node buildTree(int[] nodes){
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        Node node = new Node(nodes[idx]);
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }
}

