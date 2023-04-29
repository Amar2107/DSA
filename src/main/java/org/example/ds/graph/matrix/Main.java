package org.example.ds.graph.matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        GraphNode node = new GraphNode("A",0);
        GraphNode node1 = new GraphNode("B",1);
        GraphNode node2 = new GraphNode("C",2);
        GraphNode node3 = new GraphNode("D",3);
        GraphNode node4 = new GraphNode("E",4);
        ArrayList<GraphNode> list = new ArrayList<>(Arrays.asList(node,node1,node2,node3,node4));
        AMGraph graph = new AMGraph(list);
        graph.addUndirectedGraph(0,1);
        graph.addUndirectedGraph(0,2);
        graph.addUndirectedGraph(0,3);
        graph.addUndirectedGraph(1,4);
        graph.addUndirectedGraph(2,3);

        System.out.println(graph.toString());
        System.out.println();

        //graph.bfs();
        graph.dfs();
    }
}
