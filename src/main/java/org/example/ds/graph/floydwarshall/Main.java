package org.example.ds.graph.floydwarshall;

import org.example.ds.graph.node.WeightedNode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> al = new ArrayList<>();
        al.add(new WeightedNode("A", 0));
        al.add(new WeightedNode("B", 1));
        al.add(new WeightedNode("C", 2));
        al.add(new WeightedNode("D", 3));
//        al.add(new WeightedNode("E", 4));
//        al.add(new WeightedNode("F", 5));
//        al.add(new WeightedNode("G", 6));

        FloydWarshall graph = new FloydWarshall(al);

        /*
        *     B------2---D
        *     |    \     | 9
         *    |    1  \  |
         *    A----4---C
         *
         * */

        graph.addWeightedDirectionNode(0, 3, 1);
        graph.addWeightedDirectionNode(0, 1, 8);
        graph.addWeightedDirectionNode(1, 2, 1);
        graph.addWeightedDirectionNode(2, 0, 4);
        graph.addWeightedDirectionNode(3, 1, 2);
        graph.addWeightedDirectionNode(3, 2, 9);
//        graph.addWeightedDirectionNode(3, 4, 4); // D -> E 4
//        graph.addWeightedDirectionNode(5, 6, 7); // F -> G 7
//        graph.addWeightedDirectionNode(4, 6, 9); // E -> G 9

        System.out.println("Printing from A");
        graph.floydWarshall();
    }
}
