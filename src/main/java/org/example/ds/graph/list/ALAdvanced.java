package org.example.ds.graph.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ALAdvanced extends ALGraph{

    public ALAdvanced(ArrayList<GraphNode> nodeList) {
        super(nodeList);
    }

    public void pathPrint(GraphNode node){
        if (node.parent != null) {
           // System.out.println("PP"+node.name+" "+node.parent.name);
            pathPrint(node.parent);
        }
            System.out.print(node.name+" ");
    }


    public void SSSPPTravel(GraphNode node){
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            GraphNode current  = queue.remove();
            current.isVisited = true;
            System.out.print("Printing path for "+current.name+": ");
            pathPrint(current);
            System.out.println();
            for (GraphNode neighbor : current.neighbours){
                if(!neighbor.isVisited) {
                    neighbor.setParent(current);
                    neighbor.isVisited = true;
                    queue.add(neighbor);
                }
            }
        }
    }


}
