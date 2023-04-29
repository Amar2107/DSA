package org.example.ds.graph.matrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AMAdvanced extends AMGraph{
    AMAdvanced(ArrayList<GraphNode> nodeList) {
        super(nodeList);
    }


    public void printPath(GraphNode node){
        if(node.parent != null)
            printPath(node.parent);
        System.out.print(node.name+" ");
    }

    public void SSSPP(GraphNode node){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            current.setVisited(true);
            System.out.print("Printing path for "+current.name+" : ");
            printPath(current);
            System.out.println();
            for (GraphNode neighbor : getNeighbors(current)){
                if (!neighbor.getVisited()){
                    neighbor.setVisited(true);
                    neighbor.setParent(current);
                    queue.add(neighbor);
                }
            }
        }

    }

}
