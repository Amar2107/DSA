package org.example.ds.tree.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insertVal(100);
        bst.insertVal(30);
        bst.insertVal(20);
        bst.insertVal(50);
        bst.insertVal(10);

        bst.inorderRec(bst.root);

        System.out.println();
        bst.preOrder(bst.root);

        System.out.println(bst.searchElem(20).data);

        bst.deleteNode(bst.root,30);

        bst.inorderRec(bst.root);

    }
}
