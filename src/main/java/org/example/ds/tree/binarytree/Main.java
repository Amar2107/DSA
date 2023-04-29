package org.example.ds.tree.binarytree;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertValue(1);
        bt.insertValue(2);
        bt.insertValue(3);
        bt.insertValue(4);
        bt.insertValue(5);
        bt.insertValue(6);
        bt.insertValue(7);

        bt.levelOrder();
        System.out.println();
        bt.preOrder(bt.root);
        System.out.println();
        bt.inOrder(bt.root);
        System.out.println();
        bt.postOrder(bt.root);

        bt.deleteNode(3);

        bt.levelOrder();

        bt.deleteBT();
    }
}
