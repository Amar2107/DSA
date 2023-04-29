package org.example.ds.tree.binarytree;

public class MainBTArray {

    public static void main(String[] args) {
        BinaryTreeArray bt = new BinaryTreeArray(5);
        bt.insert("a");
        bt.insert("b");
        bt.insert("c");
        bt.insert("d");
        bt.insert("e");

        //bt.preOrder(1);
        bt.lvlOrder();
        bt.deleteElem("c");
        System.out.println();
        bt.lvlOrder();

        bt.delteBT();
    }

}
