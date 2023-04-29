package org.example.ds.tree.avltree;

import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    BinaryNode root;
    AVLTree(){
        root = null;
    }

    public void preOrder(BinaryNode node){
        if(root == null)
            return;
        else{
            System.out.println(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(BinaryNode node){
        if(root == null)
            return;
        else{
            inOrder(node.left);
            System.out.println(node.val);
            inOrder(node.right);
        }
    }

    public void postOrder(BinaryNode node){
        if(root == null)
            return;
        else{
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.val);
        }
    }

    public void levelOrder(){

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode currNode = queue.remove();
            System.out.println(currNode.val);
            if(currNode.left!= null)
                queue.add(currNode.left);
            if(currNode.right!= null)
                queue.add(currNode.right);
        }
    }

    public BinaryNode search(BinaryNode node,int val){

        if(root == null || root.val == val)
            return root;
        else{
            if(root.val < val)
                return search(root.right,val);
            else return search(root.left,val);
        }
    }

    public int getHeight(BinaryNode node){
        return node.height;
    }

    public int getBalance(BinaryNode node){
        return getHeight(node.left) - getHeight(node.right);
    }

    public BinaryNode rotateRight(BinaryNode dsNode){
        BinaryNode temp = dsNode.left;
        dsNode.left = dsNode.left.right;
        temp.right = dsNode;
        dsNode.height = 1 + Math.max(getHeight(dsNode.left), getHeight(dsNode.right));
        temp.height = 1 + Math.max(getHeight(temp.left), getHeight(temp.right));
        return temp;
    }

    public BinaryNode rotateLeft(BinaryNode dsNode){
        BinaryNode temp = dsNode.right;
        dsNode.right = dsNode.right.left;
        temp.left = dsNode;
        dsNode.height = 1 + Math.max(getHeight(dsNode.left), getHeight(dsNode.right));
        temp.height = 1 + Math.max(getHeight(temp.left), getHeight(temp.right));
        return temp;
    }


    public BinaryNode insertNode(BinaryNode node,int val){
        if(node == null)
        {
            BinaryNode newNode = new BinaryNode(val);
            node.height = 1;
            return newNode;
        }else{
            if(node.val > val)
                node.left = insertNode(node.left,val);
            else
                node.right = insertNode(node.right,val);
        }
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance  = getBalance(node);
        if(balance > 1 && val < node.left.val )
            return rotateRight(node);
        if(balance > 1 && val > node.left.val ) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && val > node.right.val )
            return rotateLeft(node);
        if(balance < -1 && val < node.right.val ) {
            node.right = rotateRight(node.left);
            return rotateLeft(node);
        }
        return node;
    }

    public BinaryNode miniMum(BinaryNode node){
        if(root.left == null)
            return root;
        else
            return miniMum(node.left);
    }

    public BinaryNode deleteNode(BinaryNode root,int val){
        if(root == null)
            return null;
        else{
            if(val < root.left.val)
                root.left = deleteNode(root.left,val);
            else if(val > root.right.val)
                root.right = deleteNode(root.right,val);
        }
        if(root.left!=null && root.right.right!=null){
            BinaryNode temp = miniMum(root.right);
            root.val = temp.val;
            root.right = deleteNode(root.right,temp.val);
        }
        else if(root.left != null)
            root = root.left;
        else if(root.right != null)
            root = root.right;
        else
            return null;

        int balance = getBalance(root);
        if(balance > 1 && getBalance(root.left) >= 0)
            return rotateRight(root);
        if(balance > 1 && getBalance(root.left)<0) {
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        if(balance < -1 && getBalance(root.right) <= 0)
            return rotateLeft(root);
        if(balance < -1 && getBalance(root.right) > 0) {
            root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

}
