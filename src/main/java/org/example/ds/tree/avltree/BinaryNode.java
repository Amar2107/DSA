package org.example.ds.tree.avltree;

public class BinaryNode {

    int val;
    BinaryNode left;
    BinaryNode right;

    int height;

    BinaryNode(){}

    BinaryNode(int val){
        this.val = val;
    }

    BinaryNode(int val, BinaryNode left, BinaryNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
