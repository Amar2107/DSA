package org.example.ds.tree.binarysearchtree.assignments;

public class Main {

    public static void main(String[] args) {
        LC108 lc = new LC108();
        int a[] = {-10,-3,0,5,9};
        TreeNode root = lc.sortedArrayToBST(a);

        lc.inOrder(root);

    }
}
