package org.example.ds.tree.binarytree;


import java.util.LinkedList;
import java.util.Queue;

class BinaryNode{
    int value;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(int value){
        this.value = value;
        left = null;
        right = null;
    }
}
public class BinaryTree {

    BinaryNode root;

    public BinaryTree(){
        this.root = null;
    }


    //Root Left Right
    void preOrder(BinaryNode node){
        if(node == null)
            return;
        System.out.println(" "+node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    //Left Root Right
    void inOrder(BinaryNode node){
        if(node == null)
            return;
        inOrder(node.left);
        System.out.println(" "+node.value);
        inOrder(node.right);
    }

    //Left Right Root
    void postOrder(BinaryNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(" "+node.value);
    }

    void levelOrder(){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();

        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode node = queue.remove();
            System.out.println(node.value+" ");
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }

    public void searchNode(int value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode node = queue.remove();
            if(node.value == value) {
                System.out.println("Values is present");
             return;
            }
            else{
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
        }
        System.out.println("Value not found");
    }

    //Insert Method
    public void insertValue(int value){
        BinaryNode node = new BinaryNode(value);
        if(root == null){
            root = node;
        }
        else{
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryNode currentNode = queue.remove();
                if(currentNode.left == null) {
                    currentNode.left = node;
                    break;
                }
                else if(currentNode.right == null) {
                    currentNode.right = node;
                    break;
                }
                else {
                    queue.add(currentNode.left);
                    queue.add(currentNode.right);
                }
            }
        }
    }


    //deepest Node
    BinaryNode deepestNode(){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode node = null;
        while(!queue.isEmpty()){
            node = queue.remove();
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        return node;
    }

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while (!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null) {
                previousNode.right = null;
                return;
            }
            else if(presentNode.right == null){
                previousNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }


    public void deleteNode(int value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currentNode = null;
        while (!queue.isEmpty()){
            currentNode = queue.remove();
            if(currentNode.value == value){
                int deepest = deepestNode().value;
                deleteDeepestNode();
                currentNode.value = deepest;
            }
            else {
                if(currentNode.left != null)
                    queue.add(currentNode.left);
                if(currentNode.right != null)
                    queue.add(currentNode.right);
            }
        }
    }

    void deleteBT(){
        root =null;
    }

}
