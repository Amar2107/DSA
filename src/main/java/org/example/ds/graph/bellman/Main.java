package org.example.ds.graph.bellman;

import org.example.ds.graph.dijkstra.WeightedNode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<WeightedNode> al = new ArrayList<>();
        al.add(new WeightedNode("A", 0));
        al.add(new WeightedNode("B", 1));
        al.add(new WeightedNode("C", 2));
        al.add(new WeightedNode("D", 3));
        al.add(new WeightedNode("E", 4));
        al.add(new WeightedNode("F", 5));
        al.add(new WeightedNode("G", 6));

        BellmanFord graph = new BellmanFord(al);

        /*
         *         B ---3---- E
         *      2 /  \       / \ 9
         *       /    1\   /4   \
         *      A        D      G
         *      \              /
         *     5 \            /7
         *        C----8-----F
         *
         *
         * */

        graph.addWeightedDirectionNode(0, 1, 2); // A -> B 2
        graph.addWeightedDirectionNode(0, 2, 5); // A -> C 5
        graph.addWeightedDirectionNode(1, 2, 6); // B -> C 6
        graph.addWeightedDirectionNode(1, 3, 1); // B -> D 1
        graph.addWeightedDirectionNode(1, 4, 3); // B -> E 3
        graph.addWeightedDirectionNode(2, 5, 8); // C -> F 8
        graph.addWeightedDirectionNode(3, 4, 4); // D -> E 4
        graph.addWeightedDirectionNode(5, 6, 7); // F -> G 7
        graph.addWeightedDirectionNode(4, 6, 9); // E -> G 9

        System.out.println("Printing from A");
        graph.bellMan(graph.nodeList.get(0));
    }

}
