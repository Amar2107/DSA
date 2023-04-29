package org.example.ds.tree.binarysearchtree;

class Node{
    int data;
    int height;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {

    Node root;

    public BST(){
        root = null;
    }

    public Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value<node.data)
            node.left = insert(node.left,value);
        else if(value > node.data)
            node.right = insert(node.right,value);
        return node;
    }

    void insertVal(int val){
        root = insert(root,val);
    }


    public void preOrder(Node node){
        if(node == null)
            return;
        else{
            System.out.println("value "+node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    Node searchElem(int val){
        return search(root,val);
    }

    Node search(Node root,int value){
        if(root == null || root.data == value)
            return root;
        else{
            if(root.data < value)
                return search(root.right,value);
            else return search(root.left,value);
        }
    }

    public Node minValue(Node root){
        if(root.left == null)
            return root;
        else
            return minValue(root.left);
    }


    public Node deleteNode(Node root,int val) {
        if (root == null) {
            System.out.println("BTS is empty");
            return null;
        }
        if (val > root.data)
            root.right = deleteNode(root.right, val);
        else if (val < root.data)
            root.left = deleteNode(root.left, val);
        else {
            if (root.left != null && root.right != null) {
                Node temp = root;
                root.data = minValue(temp.right).data;
                root.right = deleteNode(root.right, val);
            }else if(root.left == null)
                root = root.right;
            else if(root.right == null)
                root = root.left;
            else
                root  = null;
        }
        return root;
    }

}
