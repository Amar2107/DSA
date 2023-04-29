package org.example.ds.tree.binarysearchtree;

public class BinaryNode {
        public int value;
        int height;
    public BinaryNode left;
    public BinaryNode right;
    public BinaryNode(){}
        BinaryNode(int data) {
            this.value = data;
            left = right = null;
        }
}
