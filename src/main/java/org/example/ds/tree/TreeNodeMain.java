package org.example.ds.tree;

import java.util.ArrayList;

public class TreeNodeMain {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        drinks.addChild(hot);
        drinks.addChild(cold);
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode tea = new TreeNode("Tea");
        hot.addChild(coffee);
        hot.addChild(tea);
        TreeNode fanta = new TreeNode("Fanta");
        TreeNode cola = new TreeNode("Cola");
        cold.addChild(fanta);
        cold.addChild(cola);

        System.out.println(drinks.print(0));


    }

}
