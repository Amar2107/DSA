package org.example.ds.graph.list;

import java.util.ArrayList;

public class ALMain {

    public static void main(String[] args) {
        ArrayList<GraphNode> graphNodes = new ArrayList<>();
        graphNodes.add(new GraphNode(0,"A"));
        graphNodes.add(new GraphNode(1,"B"));
        graphNodes.add(new GraphNode(2,"C"));
        graphNodes.add(new GraphNode(3,"D"));
        graphNodes.add(new GraphNode(4,"E"));
        ALGraph graph = new ALGraph(graphNodes);

        graph.addUndirectedEdgeBetweenNodes(0,1);
        graph.addUndirectedEdgeBetweenNodes(0,2);
        graph.addUndirectedEdgeBetweenNodes(0,3);
        graph.addUndirectedEdgeBetweenNodes(1,4);
        graph.addUndirectedEdgeBetweenNodes(2,3);
        graph.addUndirectedEdgeBetweenNodes(3,4);

        graph.printGraph();

        //graph.bfs();

        graph.dfs();


    }

}
